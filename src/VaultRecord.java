/**
 * Holds data of a single row of a particular object type
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VaultRecord {

    private String id;
    private String objectName;

    public VaultRecord(String objectName) {
        this.objectName = objectName;
    }

    public VaultRecord(VaultRecordRef recordRef) {
        this.id = recordRef.getId();
        this.objectName = recordRef.getObjectName();
    }

    /**
     * Retrieves the value of the specified field.
     *
     * @param fieldName name of the field to get value from
     * @param returnType type of data requested
     * @param <T> type of data requested
     * @return the value of the specified field
     */
    public <T> T getValue(String fieldName, Class<T> returnType)
    {
        return null;
    }

    /**
     * Sets value for the specified field
     *
     * @param   fieldName name of the field to set value on
     * @param   value value to set for the field
     * @throws  OperationNotAllowedException in the case that, based on the current event,
     * this record data is immutable
     */
    public void setValue(String fieldName, Object value) throws OperationNotAllowedException
    {

    }

    /**
     * Retrieves the name of the object this record is an instance of
     *
     * @return the name of the object
     */
    public String getObjectName() {
        return null;
    }
}
