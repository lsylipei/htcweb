package condor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the condor package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _CreateJobTemplateCmd_QNAME = new QName("", "cmd");
	private final static QName _CreateJobTemplateArgs_QNAME = new QName("", "args");
	private final static QName _CreateJobTemplateOwner_QNAME = new QName("", "owner");
	private final static QName _CreateJobTemplateRequirements_QNAME = new QName("", "requirements");
	private final static QName _GetJobAdTransaction_QNAME = new QName("", "transaction");
	private final static QName _DeclareFileHash_QNAME = new QName("", "hash");
	private final static QName _DeclareFileName_QNAME = new QName("", "name");
	private final static QName _ReleaseJobReason_QNAME = new QName("", "reason");
	private final static QName _GetJobAdsConstraint_QNAME = new QName("", "constraint");
	private final static QName _ClassAdStructArrayAndStatusClassAdArray_QNAME = new QName("", "classAdArray");
	private final static QName _FileInfoArrayAndStatusInfo_QNAME = new QName("", "info");
	private final static QName _Base64DataAndStatusData_QNAME = new QName("", "data");
	private final static QName _StatusMessage_QNAME = new QName("", "message");
	private final static QName _StatusNext_QNAME = new QName("", "next");
	private final static QName _SubmitJobAd_QNAME = new QName("", "jobAd");
	private final static QName _ClassAdStructAndStatusClassAd_QNAME = new QName("", "classAd");

	private final static QName _QueryStorageAdsConstraint_QNAME = new QName("", "constraint");
	private final static QName _StringAndStatusMessage_QNAME = new QName("", "message");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: condor
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link QueryStartdAds }
	 * 
	 */
	public QueryStartdAds createQueryStartdAds() {
		return new QueryStartdAds();
	}

	/**
	 * Create an instance of {@link QueryLicenseAds }
	 * 
	 */
	public QueryLicenseAds createQueryLicenseAds() {
		return new QueryLicenseAds();
	}

	/**
	 * Create an instance of {@link InsertAd }
	 * 
	 */
	public InsertAd createInsertAd() {
		return new InsertAd();
	}

	/**
	 * Create an instance of {@link QueryAnyAdsResponse }
	 * 
	 */
	public QueryAnyAdsResponse createQueryAnyAdsResponse() {
		return new QueryAnyAdsResponse();
	}

	/**
	 * Create an instance of {@link ClassAdStructArray }
	 * 
	 */
	public ClassAdStructArray createClassAdStructArray() {
		return new ClassAdStructArray();
	}

	/**
	 * Create an instance of {@link QueryStorageAds }
	 * 
	 */
	public QueryStorageAds createQueryStorageAds() {
		return new QueryStorageAds();
	}

	/**
	 * Create an instance of {@link QuerySubmittorAdsResponse }
	 * 
	 */
	public QuerySubmittorAdsResponse createQuerySubmittorAdsResponse() {
		return new QuerySubmittorAdsResponse();
	}

	/**
	 * Create an instance of {@link QueryLicenseAdsResponse }
	 * 
	 */
	public QueryLicenseAdsResponse createQueryLicenseAdsResponse() {
		return new QueryLicenseAdsResponse();
	}

	/**
	 * Create an instance of {@link QuerySubmittorAds }
	 * 
	 */
	public QuerySubmittorAds createQuerySubmittorAds() {
		return new QuerySubmittorAds();
	}

	/**
	 * Create an instance of {@link QueryScheddAdsResponse }
	 * 
	 */
	public QueryScheddAdsResponse createQueryScheddAdsResponse() {
		return new QueryScheddAdsResponse();
	}

	/**
	 * Create an instance of {@link QueryMasterAdsResponse }
	 * 
	 */
	public QueryMasterAdsResponse createQueryMasterAdsResponse() {
		return new QueryMasterAdsResponse();
	}

	/**
	 * Create an instance of {@link GetVersionString }
	 * 
	 */
	public GetVersionString createGetVersionString() {
		return new GetVersionString();
	}

	/**
	 * Create an instance of {@link QueryMasterAds }
	 * 
	 */
	public QueryMasterAds createQueryMasterAds() {
		return new QueryMasterAds();
	}

	/**
	 * Create an instance of {@link QueryStorageAdsResponse }
	 * 
	 */
	public QueryStorageAdsResponse createQueryStorageAdsResponse() {
		return new QueryStorageAdsResponse();
	}

	/**
	 * Create an instance of {@link QueryScheddAds }
	 * 
	 */
	public QueryScheddAds createQueryScheddAds() {
		return new QueryScheddAds();
	}

	/**
	 * Create an instance of {@link GetVersionStringResponse }
	 * 
	 */
	public GetVersionStringResponse createGetVersionStringResponse() {
		return new GetVersionStringResponse();
	}

	/**
	 * Create an instance of {@link StringAndStatus }
	 * 
	 */
	public StringAndStatus createStringAndStatus() {
		return new StringAndStatus();
	}

	/**
	 * Create an instance of {@link GetPlatformString }
	 * 
	 */
	public GetPlatformString createGetPlatformString() {
		return new GetPlatformString();
	}

	/**
	 * Create an instance of {@link GetPlatformStringResponse }
	 * 
	 */
	public GetPlatformStringResponse createGetPlatformStringResponse() {
		return new GetPlatformStringResponse();
	}

	/**
	 * Create an instance of {@link QueryAnyAds }
	 * 
	 */
	public QueryAnyAds createQueryAnyAds() {
		return new QueryAnyAds();
	}

	/**
	 * Create an instance of {@link QueryStartdAdsResponse }
	 * 
	 */
	public QueryStartdAdsResponse createQueryStartdAdsResponse() {
		return new QueryStartdAdsResponse();
	}

	/**
	 * Create an instance of {@link InsertAdResponse }
	 * 
	 */
	public InsertAdResponse createInsertAdResponse() {
		return new InsertAdResponse();
	}

	/**
	 * Create an instance of {@link Status }
	 * 
	 */
	public Status createStatus() {
		return new Status();
	}

	/**
	 * Create an instance of {@link ClassAdStructAndStatus }
	 * 
	 */
	public ClassAdStructAndStatus createClassAdStructAndStatus() {
		return new ClassAdStructAndStatus();
	}

	/**
	 * Create an instance of {@link ClassAdStructArrayAndStatus }
	 * 
	 */
	public ClassAdStructArrayAndStatus createClassAdStructArrayAndStatus() {
		return new ClassAdStructArrayAndStatus();
	}

	/**
	 * Create an instance of {@link ClassAdStructAttr }
	 * 
	 */
	public ClassAdStructAttr createClassAdStructAttr() {
		return new ClassAdStructAttr();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QueryStorageAds.class)
	public JAXBElement<String> createQueryStorageAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QueryStorageAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "message", scope = StringAndStatus.class)
	public JAXBElement<String> createStringAndStatusMessage(String value) {
		return new JAXBElement<String>(_StringAndStatusMessage_QNAME, String.class, StringAndStatus.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ClassAdStruct }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "classAd", scope = ClassAdStructAndStatus.class)
	public JAXBElement<ClassAdStruct> createClassAdStructAndStatusClassAd(ClassAdStruct value) {
		return new JAXBElement<ClassAdStruct>(_ClassAdStructAndStatusClassAd_QNAME, ClassAdStruct.class,
				ClassAdStructAndStatus.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QueryScheddAds.class)
	public JAXBElement<String> createQueryScheddAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QueryScheddAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QueryMasterAds.class)
	public JAXBElement<String> createQueryMasterAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QueryMasterAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "message", scope = Status.class)
	public JAXBElement<String> createStatusMessage(String value) {
		return new JAXBElement<String>(_StringAndStatusMessage_QNAME, String.class, Status.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "next", scope = Status.class)
	public JAXBElement<Status> createStatusNext(Status value) {
		return new JAXBElement<Status>(_StatusNext_QNAME, Status.class, Status.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QueryAnyAds.class)
	public JAXBElement<String> createQueryAnyAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QueryAnyAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QuerySubmittorAds.class)
	public JAXBElement<String> createQuerySubmittorAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QuerySubmittorAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QueryStartdAds.class)
	public JAXBElement<String> createQueryStartdAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QueryStartdAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = QueryLicenseAds.class)
	public JAXBElement<String> createQueryLicenseAdsConstraint(String value) {
		return new JAXBElement<String>(_QueryStorageAdsConstraint_QNAME, String.class, QueryLicenseAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ClassAdStructArray }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "classAdArray", scope = ClassAdStructArrayAndStatus.class)
	public JAXBElement<ClassAdStructArray> createClassAdStructArrayAndStatusClassAdArray(ClassAdStructArray value) {
		return new JAXBElement<ClassAdStructArray>(_ClassAdStructArrayAndStatusClassAdArray_QNAME,
				ClassAdStructArray.class, ClassAdStructArrayAndStatus.class, value);
	}

	/**
	 * Create an instance of {@link BeginTransactionResponse }
	 * 
	 */
	public BeginTransactionResponse createBeginTransactionResponse() {
		return new BeginTransactionResponse();
	}

	/**
	 * Create an instance of {@link TransactionAndStatus }
	 * 
	 */
	public TransactionAndStatus createTransactionAndStatus() {
		return new TransactionAndStatus();
	}

	/**
	 * Create an instance of {@link AbortTransaction }
	 * 
	 */
	public AbortTransaction createAbortTransaction() {
		return new AbortTransaction();
	}

	/**
	 * Create an instance of {@link Transaction }
	 * 
	 */
	public Transaction createTransaction() {
		return new Transaction();
	}

	/**
	 * Create an instance of {@link CloseSpool }
	 * 
	 */
	public CloseSpool createCloseSpool() {
		return new CloseSpool();
	}

	/**
	 * Create an instance of {@link GetJobAdResponse }
	 * 
	 */
	public GetJobAdResponse createGetJobAdResponse() {
		return new GetJobAdResponse();
	}

	/**
	 * Create an instance of {@link AbortTransactionResponse }
	 * 
	 */
	public AbortTransactionResponse createAbortTransactionResponse() {
		return new AbortTransactionResponse();
	}

	/**
	 * Create an instance of {@link SendFileResponse }
	 * 
	 */
	public SendFileResponse createSendFileResponse() {
		return new SendFileResponse();
	}

	/**
	 * Create an instance of {@link BeginTransaction }
	 * 
	 */
	public BeginTransaction createBeginTransaction() {
		return new BeginTransaction();
	}

	/**
	 * Create an instance of {@link NewClusterResponse }
	 * 
	 */
	public NewClusterResponse createNewClusterResponse() {
		return new NewClusterResponse();
	}

	/**
	 * Create an instance of {@link IntAndStatus }
	 * 
	 */
	public IntAndStatus createIntAndStatus() {
		return new IntAndStatus();
	}

	/**
	 * Create an instance of {@link RequestReschedule }
	 * 
	 */
	public RequestReschedule createRequestReschedule() {
		return new RequestReschedule();
	}

	/**
	 * Create an instance of {@link ListSpool }
	 * 
	 */
	public ListSpool createListSpool() {
		return new ListSpool();
	}

	/**
	 * Create an instance of {@link CloseSpoolResponse }
	 * 
	 */
	public CloseSpoolResponse createCloseSpoolResponse() {
		return new CloseSpoolResponse();
	}

	/**
	 * Create an instance of {@link GetJobAd }
	 * 
	 */
	public GetJobAd createGetJobAd() {
		return new GetJobAd();
	}

	/**
	 * Create an instance of {@link NewCluster }
	 * 
	 */
	public NewCluster createNewCluster() {
		return new NewCluster();
	}

	/**
	 * Create an instance of {@link RequestRescheduleResponse }
	 * 
	 */
	public RequestRescheduleResponse createRequestRescheduleResponse() {
		return new RequestRescheduleResponse();
	}

	/**
	 * Create an instance of {@link SubmitResponse }
	 * 
	 */
	public SubmitResponse createSubmitResponse() {
		return new SubmitResponse();
	}

	/**
	 * Create an instance of {@link RequirementsAndStatus }
	 * 
	 */
	public RequirementsAndStatus createRequirementsAndStatus() {
		return new RequirementsAndStatus();
	}

	/**
	 * Create an instance of {@link RemoveJob }
	 * 
	 */
	public RemoveJob createRemoveJob() {
		return new RemoveJob();
	}

	/**
	 * Create an instance of {@link RemoveJobResponse }
	 * 
	 */
	public RemoveJobResponse createRemoveJobResponse() {
		return new RemoveJobResponse();
	}

	/**
	 * Create an instance of {@link GetJobAdsResponse }
	 * 
	 */
	public GetJobAdsResponse createGetJobAdsResponse() {
		return new GetJobAdsResponse();
	}

	/**
	 * Create an instance of {@link HoldJob }
	 * 
	 */
	public HoldJob createHoldJob() {
		return new HoldJob();
	}

	/**
	 * Create an instance of {@link ExtendTransaction }
	 * 
	 */
	public ExtendTransaction createExtendTransaction() {
		return new ExtendTransaction();
	}

	/**
	 * Create an instance of {@link NewJobResponse }
	 * 
	 */
	public NewJobResponse createNewJobResponse() {
		return new NewJobResponse();
	}

	/**
	 * Create an instance of {@link GetFile }
	 * 
	 */
	public GetFile createGetFile() {
		return new GetFile();
	}

	/**
	 * Create an instance of {@link HoldJobResponse }
	 * 
	 */
	public HoldJobResponse createHoldJobResponse() {
		return new HoldJobResponse();
	}

	/**
	 * Create an instance of {@link DiscoverJobRequirements }
	 * 
	 */
	public DiscoverJobRequirements createDiscoverJobRequirements() {
		return new DiscoverJobRequirements();
	}

	/**
	 * Create an instance of {@link ClassAdStruct }
	 * 
	 */
	public ClassAdStruct createClassAdStruct() {
		return new ClassAdStruct();
	}

	/**
	 * Create an instance of {@link ListSpoolResponse }
	 * 
	 */
	public ListSpoolResponse createListSpoolResponse() {
		return new ListSpoolResponse();
	}

	/**
	 * Create an instance of {@link FileInfoArrayAndStatus }
	 * 
	 */
	public FileInfoArrayAndStatus createFileInfoArrayAndStatus() {
		return new FileInfoArrayAndStatus();
	}

	/**
	 * Create an instance of {@link RemoveCluster }
	 * 
	 */
	public RemoveCluster createRemoveCluster() {
		return new RemoveCluster();
	}

	/**
	 * Create an instance of {@link Submit }
	 * 
	 */
	public Submit createSubmit() {
		return new Submit();
	}

	/**
	 * Create an instance of {@link DeclareFile }
	 * 
	 */
	public DeclareFile createDeclareFile() {
		return new DeclareFile();
	}

	/**
	 * Create an instance of {@link GetJobAds }
	 * 
	 */
	public GetJobAds createGetJobAds() {
		return new GetJobAds();
	}

	/**
	 * Create an instance of {@link SendFile }
	 * 
	 */
	public SendFile createSendFile() {
		return new SendFile();
	}

	/**
	 * Create an instance of {@link CreateJobTemplate }
	 * 
	 */
	public CreateJobTemplate createCreateJobTemplate() {
		return new CreateJobTemplate();
	}

	/**
	 * Create an instance of {@link NewJob }
	 * 
	 */
	public NewJob createNewJob() {
		return new NewJob();
	}

	/**
	 * Create an instance of {@link DiscoverJobRequirementsResponse }
	 * 
	 */
	public DiscoverJobRequirementsResponse createDiscoverJobRequirementsResponse() {
		return new DiscoverJobRequirementsResponse();
	}

	/**
	 * Create an instance of {@link ReleaseJob }
	 * 
	 */
	public ReleaseJob createReleaseJob() {
		return new ReleaseJob();
	}

	/**
	 * Create an instance of {@link CreateJobTemplateResponse }
	 * 
	 */
	public CreateJobTemplateResponse createCreateJobTemplateResponse() {
		return new CreateJobTemplateResponse();
	}

	/**
	 * Create an instance of {@link CommitTransaction }
	 * 
	 */
	public CommitTransaction createCommitTransaction() {
		return new CommitTransaction();
	}

	/**
	 * Create an instance of {@link GetFileResponse }
	 * 
	 */
	public GetFileResponse createGetFileResponse() {
		return new GetFileResponse();
	}

	/**
	 * Create an instance of {@link Base64DataAndStatus }
	 * 
	 */
	public Base64DataAndStatus createBase64DataAndStatus() {
		return new Base64DataAndStatus();
	}

	/**
	 * Create an instance of {@link ExtendTransactionResponse }
	 * 
	 */
	public ExtendTransactionResponse createExtendTransactionResponse() {
		return new ExtendTransactionResponse();
	}

	/**
	 * Create an instance of {@link ReleaseJobResponse }
	 * 
	 */
	public ReleaseJobResponse createReleaseJobResponse() {
		return new ReleaseJobResponse();
	}

	/**
	 * Create an instance of {@link CommitTransactionResponse }
	 * 
	 */
	public CommitTransactionResponse createCommitTransactionResponse() {
		return new CommitTransactionResponse();
	}

	/**
	 * Create an instance of {@link DeclareFileResponse }
	 * 
	 */
	public DeclareFileResponse createDeclareFileResponse() {
		return new DeclareFileResponse();
	}

	/**
	 * Create an instance of {@link RemoveClusterResponse }
	 * 
	 */
	public RemoveClusterResponse createRemoveClusterResponse() {
		return new RemoveClusterResponse();
	}

	/**
	 * Create an instance of {@link Requirements }
	 * 
	 */
	public Requirements createRequirements() {
		return new Requirements();
	}

	/**
	 * Create an instance of {@link FileInfo }
	 * 
	 */
	public FileInfo createFileInfo() {
		return new FileInfo();
	}

	/**
	 * Create an instance of {@link FileInfoArray }
	 * 
	 */
	public FileInfoArray createFileInfoArray() {
		return new FileInfoArray();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "cmd", scope = CreateJobTemplate.class)
	public JAXBElement<String> createCreateJobTemplateCmd(String value) {
		return new JAXBElement<String>(_CreateJobTemplateCmd_QNAME, String.class, CreateJobTemplate.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "args", scope = CreateJobTemplate.class)
	public JAXBElement<String> createCreateJobTemplateArgs(String value) {
		return new JAXBElement<String>(_CreateJobTemplateArgs_QNAME, String.class, CreateJobTemplate.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "owner", scope = CreateJobTemplate.class)
	public JAXBElement<String> createCreateJobTemplateOwner(String value) {
		return new JAXBElement<String>(_CreateJobTemplateOwner_QNAME, String.class, CreateJobTemplate.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "requirements", scope = CreateJobTemplate.class)
	public JAXBElement<String> createCreateJobTemplateRequirements(String value) {
		return new JAXBElement<String>(_CreateJobTemplateRequirements_QNAME, String.class, CreateJobTemplate.class,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = GetJobAd.class)
	public JAXBElement<Transaction> createGetJobAdTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, GetJobAd.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "hash", scope = DeclareFile.class)
	public JAXBElement<String> createDeclareFileHash(String value) {
		return new JAXBElement<String>(_DeclareFileHash_QNAME, String.class, DeclareFile.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = DeclareFile.class)
	public JAXBElement<String> createDeclareFileName(String value) {
		return new JAXBElement<String>(_DeclareFileName_QNAME, String.class, DeclareFile.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "reason", scope = ReleaseJob.class)
	public JAXBElement<String> createReleaseJobReason(String value) {
		return new JAXBElement<String>(_ReleaseJobReason_QNAME, String.class, ReleaseJob.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = ReleaseJob.class)
	public JAXBElement<Transaction> createReleaseJobTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, ReleaseJob.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = CloseSpool.class)
	public JAXBElement<Transaction> createCloseSpoolTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, CloseSpool.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = GetJobAds.class)
	public JAXBElement<Transaction> createGetJobAdsTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, GetJobAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "constraint", scope = GetJobAds.class)
	public JAXBElement<String> createGetJobAdsConstraint(String value) {
		return new JAXBElement<String>(_GetJobAdsConstraint_QNAME, String.class, GetJobAds.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = ListSpool.class)
	public JAXBElement<Transaction> createListSpoolTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, ListSpool.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FileInfoArray }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "info", scope = FileInfoArrayAndStatus.class)
	public JAXBElement<FileInfoArray> createFileInfoArrayAndStatusInfo(FileInfoArray value) {
		return new JAXBElement<FileInfoArray>(_FileInfoArrayAndStatusInfo_QNAME, FileInfoArray.class,
				FileInfoArrayAndStatus.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "reason", scope = RemoveCluster.class)
	public JAXBElement<String> createRemoveClusterReason(String value) {
		return new JAXBElement<String>(_ReleaseJobReason_QNAME, String.class, RemoveCluster.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = RemoveCluster.class)
	public JAXBElement<Transaction> createRemoveClusterTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, RemoveCluster.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "data", scope = Base64DataAndStatus.class)
	public JAXBElement<byte[]> createBase64DataAndStatusData(byte[] value) {
		return new JAXBElement<byte[]>(_Base64DataAndStatusData_QNAME, byte[].class, Base64DataAndStatus.class,
				((byte[]) value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ClassAdStruct }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "jobAd", scope = Submit.class)
	public JAXBElement<ClassAdStruct> createSubmitJobAd(ClassAdStruct value) {
		return new JAXBElement<ClassAdStruct>(_SubmitJobAd_QNAME, ClassAdStruct.class, Submit.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Requirements }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "requirements", scope = RequirementsAndStatus.class)
	public JAXBElement<Requirements> createRequirementsAndStatusRequirements(Requirements value) {
		return new JAXBElement<Requirements>(_CreateJobTemplateRequirements_QNAME, Requirements.class,
				RequirementsAndStatus.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "reason", scope = HoldJob.class)
	public JAXBElement<String> createHoldJobReason(String value) {
		return new JAXBElement<String>(_ReleaseJobReason_QNAME, String.class, HoldJob.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = HoldJob.class)
	public JAXBElement<Transaction> createHoldJobTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, HoldJob.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = SendFile.class)
	public JAXBElement<String> createSendFileName(String value) {
		return new JAXBElement<String>(_DeclareFileName_QNAME, String.class, SendFile.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "data", scope = SendFile.class)
	public JAXBElement<byte[]> createSendFileData(byte[] value) {
		return new JAXBElement<byte[]>(_Base64DataAndStatusData_QNAME, byte[].class, SendFile.class, ((byte[]) value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = GetFile.class)
	public JAXBElement<Transaction> createGetFileTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, GetFile.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "name", scope = GetFile.class)
	public JAXBElement<String> createGetFileName(String value) {
		return new JAXBElement<String>(_DeclareFileName_QNAME, String.class, GetFile.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ClassAdStruct }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "jobAd", scope = DiscoverJobRequirements.class)
	public JAXBElement<ClassAdStruct> createDiscoverJobRequirementsJobAd(ClassAdStruct value) {
		return new JAXBElement<ClassAdStruct>(_SubmitJobAd_QNAME, ClassAdStruct.class, DiscoverJobRequirements.class,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "reason", scope = RemoveJob.class)
	public JAXBElement<String> createRemoveJobReason(String value) {
		return new JAXBElement<String>(_ReleaseJobReason_QNAME, String.class, RemoveJob.class, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Transaction }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "transaction", scope = RemoveJob.class)
	public JAXBElement<Transaction> createRemoveJobTransaction(Transaction value) {
		return new JAXBElement<Transaction>(_GetJobAdTransaction_QNAME, Transaction.class, RemoveJob.class, value);
	}

}
