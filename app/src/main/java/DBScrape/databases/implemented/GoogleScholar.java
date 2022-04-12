package DBScrape.databases.implemented;

import java.util.HashMap;
import java.util.Map;

import DBScrape.Result;
import DBScrape.databases.Database;

public class GoogleScholar extends Database {
    private final String dbName = "Google Scholar";

    public Result search() {
        super.dbName = "Google Scholar";
        return new Result(dbName, "searchParams", "articleName", "author", "score", "description");
    }
    
    public String getName() {
        return dbName;
    }
/*
    public void test() {
        Map<String, String> parameter = new HashMap<>();

        parameter.put("engine", "google_scholar");
        parameter.put("q", "biology");
        parameter.put("api_key", "68e46f0ad8abae066ddcfb94ed8e053e78225032c78e0c4800b88b2edc7040eb");

        GoogleSearch search = new GoogleSearch(parameter);

        try
        {
        JsonObject results = search.getJson();
        var organic_results = results.get("organic_results");
        }
        catch (SerpApiClientException ex)
        {
        System.out.println("Exception:");
        System.out.println(ex.ToString());
        }
    }*/
}
