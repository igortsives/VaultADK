import java.util.List;

/**
 * Holds a response to VQL query execution
 *
 * @author  Igor Tsives
 * @since   2016-03-07
 */
public class VQLQueryResponse extends VaultResponse {

    /**
     * Returns the query cursor pointing to the fetched result set. Query cursor can be used to paginate
     * over the result set. If the result fits into a single page, <code>null</code> is returned.
     *
     * @return a query cursor
     */
    public String getQueryCursor()
    {
        return null;
    }

    /**
     * Returns the offset for the current page. The first page will have offset to 1.
     *
     * @return the offset for the current page
     */
    public int getCurrentOffset()
    {
        return 0;
    }

    /**
     * Returns the size for the current page as requested in the query
     *
     * @return a size of the page
     */
    public int getPageSize()
    {
        return 0;
    }

    /**
     * Returns the total size of the fetched result set (all the pages, not just this one)
     *
     * @return a total number of results fetched by the query
     */
    public int getTotal()
    {
        return 0;
    }

    /**
     * Returns <code>true</code> if the the result can be paginated towards the next page, <code>false</code> otherwise.
     *
     * @return <code>true</code> if the the result can be paginated towards the next page, <code>false</code> otherwise.
     */
    public boolean hasNextPage()
    {
        return true;
    }

    /**
     * Returns <code>true</code> if the the result can be paginated towards the previous page, <code>false</code> otherwise.
     *
     * @return <code>true</code> if the the result can be paginated towards the previous page, <code>false</code> otherwise.
     */
    public boolean hasPreviousPage()
    {
        return true;
    }

    /**
     * Returns the records in the current page
     *
     * @return a list of records in current page
     */
    @Override
    public List<VaultRecord> getData()
    {
        return null;
    }
}
