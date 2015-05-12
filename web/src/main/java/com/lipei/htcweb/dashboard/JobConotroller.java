package com.lipei.htcweb.dashboard;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortOrder;
import org.primefaces.model.UploadedFile;

import com.lipei.htcweb.server.Server;
import com.lipei.htcweb.server.ServerEJB;
import com.lipei.htcweb.status.AbstractClassAdsInfo_;
import com.lipei.htcweb.status.Job;
import com.lipei.htcweb.status.Job_;

@Named
@SessionScoped
public class JobConotroller implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 153799457138628865L;

	private LazyDataModel<Job> model;

	@PersistenceContext
	EntityManager em;

	private String keyword;

	private Job selectJob;

	@Inject
	private ServerEJB sevejb;

	private List<Server> serverlist;

	public JobConotroller() {
		model = new LazyDataModel<Job>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 162860777669374273L;

			@Override
			public List<Job> load(int first, int pageSize, String sortField, SortOrder sortOrder,
					Map<String, Object> filters) {
				setSum();
				CriteriaBuilder cb = em.getCriteriaBuilder();

				CriteriaQuery<Job> cq = cb.createQuery(Job.class);
				Root<Job> from = cq.from(Job.class);
				CriteriaQuery<Job> select = cq.select(from);
				select.orderBy(cb.desc(from.get(AbstractClassAdsInfo_.serid)));
				select.orderBy(cb.desc(from.get(Job_.clusterId)));
				select.orderBy(cb.asc(from.get(Job_.procId)));

				addKeySearch(cb, cq, from);

				TypedQuery<Job> query = em.createQuery(cq);
				query.setMaxResults(pageSize).setFirstResult(first);
				return query.getResultList();
			}

			@Override
			public Job getRowData(String rowKey) {

				CriteriaBuilder cb = em.getCriteriaBuilder();
				CriteriaQuery<Job> cq = cb.createQuery(Job.class);
				Root<Job> from = cq.from(Job.class);

				cq.select(from).where(cb.equal(from.get(Job_.globalJobId), rowKey));

				return em.createQuery(cq).getSingleResult();
			}

			@Override
			public Object getRowKey(Job job) {
				return job.getGlobalJobId();
			}

		};
	}

	@PostConstruct
	public void init() {
		setSum();
		serverlist = sevejb.getServerList();
	}

	private void setSum() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Long> cq = cb.createQuery(Long.class);
		Root<Job> from = cq.from(Job.class);
		cq.select(cb.count(from));

		addKeySearch(cb, cq, from);

		TypedQuery<Long> query = em.createQuery(cq);
		model.setRowCount(query.getSingleResult().intValue());
	}

	private void addKeySearch(CriteriaBuilder cb, CriteriaQuery cq, Root<Job> from) {
		if (!StringUtils.isEmpty(StringUtils.trim(keyword))) {
			String likekey = "%" + keyword + "%";
			cq.where(cb.or(cb.like(from.get(Job_.clusterId).as(String.class), likekey),
					cb.like(from.get(Job_.procId).as(String.class), likekey)));
		}
	}

	public LazyDataModel<Job> getModel() {
		return model;
	}

	public void search() {
		setSum();
	}

	public void refresh(ActionEvent event) {
		keyword = "";
		setSum();
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Job getSelectJob() {
		return selectJob;
	}

	public void setSelectJob(Job selectJob) {
		this.selectJob = selectJob;
	}

	public void onRowSelect() {
		String test = new String();
		test.toString();
	}

	private UploadedFile file;

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public void upload() {
		if (selectid == null) {
			FacesMessage message = new FacesMessage("Error", "Please select server is no valid");
			FacesContext.getCurrentInstance().addMessage(null, message);
			return;
		}

		if (file != null) {
			String fileName = file.getFileName();

			try {
				selectid.getWebservice().upload(file);
			} catch (Exception e) {
				FacesMessage message = new FacesMessage("Error", fileName + " is no valid");
				FacesContext.getCurrentInstance().addMessage(null, message);
				e.printStackTrace();
				return;
			}

		}
	}

	private Server selectid;

	public Server getSelectid() {
		return selectid;
	}

	public void setSelectid(Server selectid) {
		this.selectid = selectid;
	}

	public List<Server> getServerlist() {
		return serverlist;
	}
}
