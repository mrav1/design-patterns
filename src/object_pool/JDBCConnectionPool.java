package object_pool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionPool extends ObjectPool<Connection> {
    private String host, user, pass;

    public JDBCConnectionPool(String driverClass, String host, String user, String pass) {
        super();
        try {
            Class.forName(driverClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.host = host;
        this.user = user;
        this.pass = pass;
    }

    @Override
    protected Connection create() {
        try {
            return DriverManager.getConnection(host, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected boolean validate(Connection o) {
        try {
            return o.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    protected void expire(Connection o) {
        try {
            o.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
