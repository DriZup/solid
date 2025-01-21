package inversionDependency;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados MySQL...");


    }
}
