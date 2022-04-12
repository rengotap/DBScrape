package DBScrape.databases;

import DBScrape.Result;

public abstract class Database {
    protected String dbName;

    public abstract Result search();
    public abstract String getName();
    
}
