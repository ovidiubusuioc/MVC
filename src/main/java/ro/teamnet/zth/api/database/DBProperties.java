package ro.teamnet.zth.api.database;


public interface DBProperties {
    // de inlocuit cu IP-ul din Docker
    String IP = "192.168.99.100";
    String PORT = "49161";
    // de inlocuit 1cu utilizatorul vostru
    String USER = "system";
    // de inlocuit cu parola voastra
    String PASS = "oracle";
    String SID = "xe";
    String SCHEMA = "HR";
    String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

}
