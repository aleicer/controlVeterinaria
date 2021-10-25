package modelo;

public class dbData {

    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3307/mascotafeliz?useServerPrepStmts=true";

    /**
     * @return the driver
     */
    public String getDriver() {
        return driver;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }


}
