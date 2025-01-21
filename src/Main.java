import inversionDependency.Application;
import inversionDependency.Database;
import inversionDependency.MySQLDatabase;

public class Main {

    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        Application app = new Application(db);
        app.start();
    }
}