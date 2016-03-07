import java.util.List;

/**
 * Holds the object top-level metadata
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VaultObjectMetadata {

    /**
     * Retrieves the value of the specified metadata field.
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
     * Retrieves the object relationship metadata.
     *
     * @return the object relationship metadata
     */
    public List<VaultObjectRelationshipMetadata> getRelationships()
    {
        return null;
    }

    /**
     * Retrieves the object fields metadata
     *
     * @return the object fields metadata
     */
    public List<VaultObjectFieldMetadata> getFields()
    {
        return null;
    }
}
