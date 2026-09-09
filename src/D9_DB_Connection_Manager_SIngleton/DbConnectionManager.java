package D9_DB_Connection_Manager_SIngleton;

public class DbConnectionManager {

    private static volatile DbConnectionManager instance;

    private DbConnectionManager() {
        System.out.println("--> Initialising DB Connection Manager.");
    }

    public static DbConnectionManager getInstance() {
        if(instance == null) {
            synchronized (DbConnectionManager.class) {
                if(instance == null) {
                    instance = new DbConnectionManager();
                }
            }
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query + " using connection @" + this.hashCode());
    }
}
