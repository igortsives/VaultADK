/**
 * Used to construct a VQL Query
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VQLQuery {

    String query = null;

    /**
     * Constructs a VQL query object
     *
     * @param query a VQL query
     */
    private VQLQuery(String query)
    {
        this.query = query;
    }

    /**
     * Constructs a VQL query object which selects all queryable fields
     *
     * @param objectName an object to query
     * @param whereClause a where clause to use
     */
    private VQLQuery(String objectName, String whereClause)
    {
        this.query = null;  // @TODO
    }

    /**
     * Makes and instance of VQLQuery object that can be executed by VQL
     *
     * @param   vqlQuery a string representing VQL statement (query)
     * @return  the VQLQuery containing the result of the operation
     * @exception VQLException if an exception occurs while generating the VQLQuery
     * @see     VQLQuery
     */
    public static VQLQuery makeQuery(String vqlQuery) throws VQLException
    {
        return new VQLQuery(vqlQuery);
    }

    /**
     * Makes and instance of VQLQuery object, selecting all queryable fields, that can be executed by VQL
     *
     * @param   objectName an object to query
     * @param   whereClause a where clause to use
     * @return  the VQLQuery containing the result of the operation
     * @exception VQLException if an exception occurs while generating the VQLQuery
     * @see     VQLQuery
     */
    public static VQLQuery makeSelectAllQuery(String objectName, String whereClause) throws VQLException
    {
        return new VQLQuery(objectName, whereClause);
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
