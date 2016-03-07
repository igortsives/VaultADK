import java.util.List;

/**
 * Holds a response to Vault operation
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VaultResponse {

    private VaultResponseStatus status;
    private List<VaultError> errors;

    /**
     * Determines if the operation was successfully processed by Vault. This doesn't mean that all the data was
     * successfully processed. To determine the result of data processing, analyze the data attributes.
     *
     * @return <code>true</code> if the the operation was successfully processed by Vault, <code>false</code> otherwise.
     */
    public boolean isSuccess()
    {
        return status == VaultResponseStatus.SUCCESS;
    }

    /**
     * Returns an error list when operation failed due to an error in user input, business logic or back-end exception.
     *
     * @return an error list one failure, <code>null</code> otherwise
     */
    public List<VaultError> getErrors()
    {
        return null;
    }

    /**
     * Returns the resulting data set
     *
     * @return a list of <code>VaultRecord</code>
     */
    public List<VaultRecord> getData()
    {
        return null;
    }

}
