package D9_DB_Connection_Manager_SIngleton;

public class App {

    public static void main(String[] args) {

        DbConnectionManager connection1 = DbConnectionManager.getInstance();
        DbConnectionManager connection2 = DbConnectionManager.getInstance();
        DbConnectionManager connection3 = DbConnectionManager.getInstance();

        connection1.executeQuery("Select * from Users;");
        connection2.executeQuery("Select * from Users;");
        connection3.executeQuery("Select * from Users;");

        System.out.println("connection1 == connection2: => " + (connection1 == connection2));

        System.out.println(connection1.hashCode());
        System.out.println(connection2.hashCode());
    }
}
