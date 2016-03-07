import java.util.List;

/**
 * Provides the API for fetching, saving and deleting data in Vault
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class Vault {

    private Vault()
    {}

    /**
     * Returns a new instance of VaultRecord object.
     *
     * @param   objectName an object name as configured in the metadat
     * @return  the new instance of VaultRecord object
     * @exception   VaultException if an exception occurs while getting an instance of VaultRecord object
     * @see     VaultRecord
     */
    public static VaultRecord makeNew(String objectName) throws VaultException
    {
        return new VaultRecord(objectName);
    }

    /**
     * Saves/Upserts (Creates or Updates) the list of records as a batch
     *
     * @param       records a collection of records which need to be saved/upserted
     * @return      the VaultResponse containing the result of the operation
     * @exception   OperationNotAllowedException if an exception occurs due to business/configuration limitation
     * @exception   InvalidDataException if an exception occurs due to invalid data in the request
     * @exception   InsufficientAccessException if an exception occurs due to access limitation of the caller
     * @see         VaultResponse
     */
    public static VaultResponse save(List<VaultRecord> records) throws
            OperationNotAllowedException, InvalidDataException, InsufficientAccessException
    {
        return null;
    }

    /**
     * Deletes the list of records as a batch
     *
     * @param       records a collection of records which need to be deleted
     * @return      the VaultResponse containing the result of the operation
     * @exception   OperationNotAllowedException if an exception occurs due to business/configuration limitation
     * @exception   InvalidDataException if an exception occurs due to invalid data in the request
     * @exception   InsufficientAccessException if an exception occurs due to access limitation of the caller
     * @see         VaultResponse
     */
    public static VaultResponse delete(List<VaultRecord> records) throws
            OperationNotAllowedException, InvalidDataException, InsufficientAccessException
    {
        return null;
    }

    /**
     * Creates VQLQuery object that can be executed by VQL
     *
     * @param   vqlQuery a string representing VQL statement (query)
     * @return  the VQLQuery containing the result of the operation
     * @exception VQLException if an exception occurs while generating the VQLQuery
     * @see     VQLQuery
     */
    public static VQLQuery createQuery(String vqlQuery) throws VQLException
    {
        return null;
    }

    /**
     * Executes VQL Query
     *
     * @param       vqlQuery a VQL statement (query)
     * @return      the response containing the VQL execution details and the data result set
     * @exception   VQLException if an exception occurs while executing VQL Query
     * @see     VQLQueryResponse
     */
    public static VQLQueryResponse executeQuery(VQLQuery vqlQuery) throws VQLException
    {
        return null;
    }

    /**
     * Retrieves VQL Query results page based on query cursor
     *
     * @param       vqlQueryCursor a query cursor pointing to the pre-fetched result set
     * @param       pageSize a number of records to retrieve from the pre-fetched result set
     * @param       offset a number by which to offset the data before receiving it from the pre-fetched result set
     * @return      the response containing the VQL execution details and the data result set
     * @exception   VQLException if an exception occurs while retrieving the next query results page
     * @see     VQLQueryResponse
     */
    public static VQLQueryResponse queryPage(String vqlQueryCursor, int pageSize, int offset) throws VQLException
    {
        return null;
    }

    /**
     * Retrieves the object metadata for a list of objects
     *
     * @param   objectNames a list of object name for which to retrieve the metadata
     * @param   localized a boolean which, if set to true, will get the localized strings included in the metadata
     * @return  a list of VaultObjectMetadata each containing the detailed metadata for each of the object names
     * @exception   OperationNotAllowedException if an exception occurs due to business/configuration limitation
     * @exception   InvalidDataException if an exception occurs due to invalid data in the request
     * @exception   InsufficientAccessException if an exception occurs due to access limitation of the caller
     * @see     VaultObjectMetadata
     */
    public static List<VaultObjectMetadata> retrieveMetadata(List<String> objectNames, boolean localized) throws
            OperationNotAllowedException, InvalidDataException, InsufficientAccessException
    {
        return null;
    }


}

