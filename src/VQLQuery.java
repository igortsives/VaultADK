/**
 * Used to construct a VQL Query
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VQLQuery {

    String query = null;

    public VQLQuery(String query)
    {
        this.query = query;
    }

    /**
     * Set query parameter to a string value. Takes case sensitivity into account.
     *
     * @param parameter a name of the query parameter
     * @param value a <code>String</code> value of the query parameter
     * @param caseSensitive whether VQL should consider this value as case-sensitive
     */
    public void setParameter(String parameter, String value, boolean caseSensitive)
    {

    }

    /**
     * Set query parameter to a <code>String</code> value. The value is case-sensitive.
     *
     * @param parameter a name of the query parameter
     * @param value a <code>String</code> value of the query parameter
     */
    public void setParameter(String parameter, String value)
    {

    }

    /**
     * Set query parameter to a <code>long</code> value.
     *
     * @param parameter a name of the query parameter
     * @param value a <code>long</code> value of the query parameter
     */
    public void setParameter(String parameter, long value)
    {

    }

    /**
     * Set query parameter to a <code>boolean</code> value.
     *
     * @param parameter a name of the query parameter
     * @param value a <code>boolean</code> value of the query parameter
     */
    public void setParameter(String parameter, boolean value)
    {

    }

    @Override
    public String toString() {
        return "VQLQuery{" +
                "query='" + query + '\'' +
                '}';
    }
}
