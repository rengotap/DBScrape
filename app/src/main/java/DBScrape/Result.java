package DBScrape;

public class Result {
    private String dbName;
    private String searchParams;
    private String articleName;
    private String author;
    private String score;
    private String description;

    /**
     * Creates a new search result
     * @param dbName database name
     * @param searchParams search parameters used to get result
     * @param articleName name of result
     * @param author name of author
     * @param score reliability score
     * @param description short description of score
     */
    public Result(String dbName, String searchParams, 
        String articleName, String author, String score, String description) {
        this.dbName = dbName;
        this.searchParams = searchParams;
        this.articleName = articleName;
        this.author = author;
        this.score = score;
        this.description = description;
    }

    public String getDataBaseName() {
        return dbName;
    }
    public String getSearchParam() {
        return searchParams;
    }
    public String getArticleName() {
        return articleName;
    }
    public String getAuthor() {
        return author;
    }
    public String getScore() {
        return score;
    }
    public String getDesc() {
        return description;
    }

    public String toString() {
        return "";
    }
}
