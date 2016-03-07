/**
 * Holds the Vault error data
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VaultError {
    private VaultErrorType type;
    private String message;
    private String field;

    /**
     * Constructs VaultError object containing type and message
     *
     * @param type an error type enum
     * @param message an error message string
     */
    public VaultError(VaultErrorType type, String message)
    {
        this.type = type;
        this.message = message;
        this.field = null;
    }

    /**
     * Constructs VaultError object containing type and message
     *
     * @param type an error type enum
     * @param message an error message string
     * @param field a field name for which the error is generated
     */
    public VaultError(VaultErrorType type, String message, String field)
    {
        this.type = type;
        this.message = message;
        this.field = field;
    }

    /**
     * Returns the type of response error message
     *
     * @return a type of response error message
     */
    public VaultErrorType getType()
    {
        return type;
    }

    /**
     * Returns a response error message
     *
     * @return a response error message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Returns a field name for which the error was generated, or <code>null</code> if the error is not field-specific.
     *
     * @return a field name
     */
    public String getField()
    {
        return null;
    }

    @Override
    public String toString() {
        return "VaultError{" +
                "type=" + type +
                ", message='" + message + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
