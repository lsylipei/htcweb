
package condor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "condorScheddPortType", targetNamespace = "urn:condor")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CondorScheddPortType {


    /**
     * Service definition of function condor__getVersionString
     * 
     * @return
     *     returns condor.StringAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getVersionString", targetNamespace = "urn:condor", className = "condor.GetVersionString")
    @ResponseWrapper(localName = "getVersionStringResponse", targetNamespace = "urn:condor", className = "condor.GetVersionStringResponse")
    public StringAndStatus getVersionString();

    /**
     * Service definition of function condor__getPlatformString
     * 
     * @return
     *     returns condor.StringAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getPlatformString", targetNamespace = "urn:condor", className = "condor.GetPlatformString")
    @ResponseWrapper(localName = "getPlatformStringResponse", targetNamespace = "urn:condor", className = "condor.GetPlatformStringResponse")
    public StringAndStatus getPlatformString();

    /**
     * Service definition of function condor__beginTransaction
     * 
     * @param duration
     * @return
     *     returns condor.TransactionAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "beginTransaction", targetNamespace = "urn:condor", className = "condor.BeginTransaction")
    @ResponseWrapper(localName = "beginTransactionResponse", targetNamespace = "urn:condor", className = "condor.BeginTransactionResponse")
    public TransactionAndStatus beginTransaction(
        @WebParam(name = "duration", targetNamespace = "")
        int duration);

    /**
     * Service definition of function condor__commitTransaction
     * 
     * @param transaction
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "commitTransaction", targetNamespace = "urn:condor", className = "condor.CommitTransaction")
    @ResponseWrapper(localName = "commitTransactionResponse", targetNamespace = "urn:condor", className = "condor.CommitTransactionResponse")
    public Status commitTransaction(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction);

    /**
     * Service definition of function condor__abortTransaction
     * 
     * @param transaction
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "abortTransaction", targetNamespace = "urn:condor", className = "condor.AbortTransaction")
    @ResponseWrapper(localName = "abortTransactionResponse", targetNamespace = "urn:condor", className = "condor.AbortTransactionResponse")
    public Status abortTransaction(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction);

    /**
     * Service definition of function condor__extendTransaction
     * 
     * @param duration
     * @param transaction
     * @return
     *     returns condor.TransactionAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "extendTransaction", targetNamespace = "urn:condor", className = "condor.ExtendTransaction")
    @ResponseWrapper(localName = "extendTransactionResponse", targetNamespace = "urn:condor", className = "condor.ExtendTransactionResponse")
    public TransactionAndStatus extendTransaction(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "duration", targetNamespace = "")
        int duration);

    /**
     * Service definition of function condor__newCluster
     * 
     * @param transaction
     * @return
     *     returns condor.IntAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "newCluster", targetNamespace = "urn:condor", className = "condor.NewCluster")
    @ResponseWrapper(localName = "newClusterResponse", targetNamespace = "urn:condor", className = "condor.NewClusterResponse")
    public IntAndStatus newCluster(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction);

    /**
     * Service definition of function condor__removeCluster
     * 
     * @param reason
     * @param transaction
     * @param clusterId
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "removeCluster", targetNamespace = "urn:condor", className = "condor.RemoveCluster")
    @ResponseWrapper(localName = "removeClusterResponse", targetNamespace = "urn:condor", className = "condor.RemoveClusterResponse")
    public Status removeCluster(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "reason", targetNamespace = "")
        String reason);

    /**
     * Service definition of function condor__newJob
     * 
     * @param transaction
     * @param clusterId
     * @return
     *     returns condor.IntAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "newJob", targetNamespace = "urn:condor", className = "condor.NewJob")
    @ResponseWrapper(localName = "newJobResponse", targetNamespace = "urn:condor", className = "condor.NewJobResponse")
    public IntAndStatus newJob(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId);

    /**
     * Service definition of function condor__removeJob
     * 
     * @param jobId
     * @param reason
     * @param transaction
     * @param clusterId
     * @param forceRemoval
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "removeJob", targetNamespace = "urn:condor", className = "condor.RemoveJob")
    @ResponseWrapper(localName = "removeJobResponse", targetNamespace = "urn:condor", className = "condor.RemoveJobResponse")
    public Status removeJob(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "reason", targetNamespace = "")
        String reason,
        @WebParam(name = "force-removal", targetNamespace = "")
        boolean forceRemoval);

    /**
     * Service definition of function condor__holdJob
     * 
     * @param systemHold
     * @param jobId
     * @param reason
     * @param transaction
     * @param emailAdmin
     * @param emailUser
     * @param clusterId
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "holdJob", targetNamespace = "urn:condor", className = "condor.HoldJob")
    @ResponseWrapper(localName = "holdJobResponse", targetNamespace = "urn:condor", className = "condor.HoldJobResponse")
    public Status holdJob(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "reason", targetNamespace = "")
        String reason,
        @WebParam(name = "email-user", targetNamespace = "")
        boolean emailUser,
        @WebParam(name = "email-admin", targetNamespace = "")
        boolean emailAdmin,
        @WebParam(name = "system-hold", targetNamespace = "")
        boolean systemHold);

    /**
     * Service definition of function condor__releaseJob
     * 
     * @param jobId
     * @param reason
     * @param transaction
     * @param emailAdmin
     * @param emailUser
     * @param clusterId
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "releaseJob", targetNamespace = "urn:condor", className = "condor.ReleaseJob")
    @ResponseWrapper(localName = "releaseJobResponse", targetNamespace = "urn:condor", className = "condor.ReleaseJobResponse")
    public Status releaseJob(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "reason", targetNamespace = "")
        String reason,
        @WebParam(name = "email-user", targetNamespace = "")
        boolean emailUser,
        @WebParam(name = "email-admin", targetNamespace = "")
        boolean emailAdmin);

    /**
     * Service definition of function condor__submit
     * 
     * @param jobId
     * @param transaction
     * @param jobAd
     * @param clusterId
     * @return
     *     returns condor.RequirementsAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "submit", targetNamespace = "urn:condor", className = "condor.Submit")
    @ResponseWrapper(localName = "submitResponse", targetNamespace = "urn:condor", className = "condor.SubmitResponse")
    public RequirementsAndStatus submit(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "jobAd", targetNamespace = "")
        ClassAdStruct jobAd);

    /**
     * Service definition of function condor__getJobAds
     * 
     * @param transaction
     * @param constraint
     * @return
     *     returns condor.ClassAdStructArrayAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getJobAds", targetNamespace = "urn:condor", className = "condor.GetJobAds")
    @ResponseWrapper(localName = "getJobAdsResponse", targetNamespace = "urn:condor", className = "condor.GetJobAdsResponse")
    public ClassAdStructArrayAndStatus getJobAds(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "constraint", targetNamespace = "")
        String constraint);

    /**
     * Service definition of function condor__getJobAd
     * 
     * @param jobId
     * @param transaction
     * @param clusterId
     * @return
     *     returns condor.ClassAdStructAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getJobAd", targetNamespace = "urn:condor", className = "condor.GetJobAd")
    @ResponseWrapper(localName = "getJobAdResponse", targetNamespace = "urn:condor", className = "condor.GetJobAdResponse")
    public ClassAdStructAndStatus getJobAd(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId);

    /**
     * Service definition of function condor__declareFile
     * 
     * @param jobId
     * @param hash
     * @param transaction
     * @param hashType
     * @param name
     * @param clusterId
     * @param size
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "declareFile", targetNamespace = "urn:condor", className = "condor.DeclareFile")
    @ResponseWrapper(localName = "declareFileResponse", targetNamespace = "urn:condor", className = "condor.DeclareFileResponse")
    public Status declareFile(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "size", targetNamespace = "")
        int size,
        @WebParam(name = "hashType", targetNamespace = "")
        HashType hashType,
        @WebParam(name = "hash", targetNamespace = "")
        String hash);

    /**
     * Service definition of function condor__sendFile
     * 
     * @param jobId
     * @param transaction
     * @param name
     * @param data
     * @param offset
     * @param clusterId
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "sendFile", targetNamespace = "urn:condor", className = "condor.SendFile")
    @ResponseWrapper(localName = "sendFileResponse", targetNamespace = "urn:condor", className = "condor.SendFileResponse")
    public Status sendFile(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "offset", targetNamespace = "")
        int offset,
        @WebParam(name = "data", targetNamespace = "")
        byte[] data);

    /**
     * Service definition of function condor__getFile
     * 
     * @param jobId
     * @param transaction
     * @param name
     * @param length
     * @param offset
     * @param clusterId
     * @return
     *     returns condor.Base64DataAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "getFile", targetNamespace = "urn:condor", className = "condor.GetFile")
    @ResponseWrapper(localName = "getFileResponse", targetNamespace = "urn:condor", className = "condor.GetFileResponse")
    public Base64DataAndStatus getFile(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "name", targetNamespace = "")
        String name,
        @WebParam(name = "offset", targetNamespace = "")
        int offset,
        @WebParam(name = "length", targetNamespace = "")
        int length);

    /**
     * Service definition of function condor__closeSpool
     * 
     * @param jobId
     * @param transaction
     * @param clusterId
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "closeSpool", targetNamespace = "urn:condor", className = "condor.CloseSpool")
    @ResponseWrapper(localName = "closeSpoolResponse", targetNamespace = "urn:condor", className = "condor.CloseSpoolResponse")
    public Status closeSpool(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId);

    /**
     * Service definition of function condor__listSpool
     * 
     * @param jobId
     * @param transaction
     * @param clusterId
     * @return
     *     returns condor.FileInfoArrayAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "listSpool", targetNamespace = "urn:condor", className = "condor.ListSpool")
    @ResponseWrapper(localName = "listSpoolResponse", targetNamespace = "urn:condor", className = "condor.ListSpoolResponse")
    public FileInfoArrayAndStatus listSpool(
        @WebParam(name = "transaction", targetNamespace = "")
        Transaction transaction,
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId);

    /**
     * Service definition of function condor__requestReschedule
     * 
     * @return
     *     returns condor.Status
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "requestReschedule", targetNamespace = "urn:condor", className = "condor.RequestReschedule")
    @ResponseWrapper(localName = "requestRescheduleResponse", targetNamespace = "urn:condor", className = "condor.RequestRescheduleResponse")
    public Status requestReschedule();

    /**
     * Service definition of function condor__discoverJobRequirements
     * 
     * @param jobAd
     * @return
     *     returns condor.RequirementsAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "discoverJobRequirements", targetNamespace = "urn:condor", className = "condor.DiscoverJobRequirements")
    @ResponseWrapper(localName = "discoverJobRequirementsResponse", targetNamespace = "urn:condor", className = "condor.DiscoverJobRequirementsResponse")
    public RequirementsAndStatus discoverJobRequirements(
        @WebParam(name = "jobAd", targetNamespace = "")
        ClassAdStruct jobAd);

    /**
     * Service definition of function condor__createJobTemplate
     * 
     * @param cmd
     * @param jobId
     * @param args
     * @param owner
     * @param type
     * @param clusterId
     * @param requirements
     * @return
     *     returns condor.ClassAdStructAndStatus
     */
    @WebMethod
    @WebResult(name = "response", targetNamespace = "")
    @RequestWrapper(localName = "createJobTemplate", targetNamespace = "urn:condor", className = "condor.CreateJobTemplate")
    @ResponseWrapper(localName = "createJobTemplateResponse", targetNamespace = "urn:condor", className = "condor.CreateJobTemplateResponse")
    public ClassAdStructAndStatus createJobTemplate(
        @WebParam(name = "clusterId", targetNamespace = "")
        int clusterId,
        @WebParam(name = "jobId", targetNamespace = "")
        int jobId,
        @WebParam(name = "owner", targetNamespace = "")
        String owner,
        @WebParam(name = "type", targetNamespace = "")
        UniverseType type,
        @WebParam(name = "cmd", targetNamespace = "")
        String cmd,
        @WebParam(name = "args", targetNamespace = "")
        String args,
        @WebParam(name = "requirements", targetNamespace = "")
        String requirements);

}
