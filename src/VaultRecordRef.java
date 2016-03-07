/**
 * Holds reference to an object record
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VaultRecordRef {

    private String id;
    private String objectName;

    /**
     * Constructs an instance of VaultRecordRef
     *
     * @param id an ID of an object record
     * @param objectName a name of an object where the referenced record is located
     */
    public VaultRecordRef(String id, String objectName)
    {
        this.id = id;
        this.objectName = objectName;
    }

    /**
     * Returns a record ID
     *
     * @return a record ID
     */
    public String getId()
    {
        return null;
    }

    /**
     * Returns an object name
     *
     * @return an object name
     */
    public String getObjectName()
    {
        return null;
    }
}
