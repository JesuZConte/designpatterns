package solid.dependencyinversion;

public class MySQLConnection implements DBConnectionInterface {
    @Override
    public int connect() {
        return 1;
    }
}
