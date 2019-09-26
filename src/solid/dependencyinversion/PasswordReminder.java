package solid.dependencyinversion;

public class PasswordReminder {

    // The class depends on an interface, not the concrete MySQLConnection class.
    private DBConnectionInterface dbConnection;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
