package ro.teamnet.zth.api.database;

/**
 * Created by Raluca.Russindilar on 02.07.2016.
 */
public interface DBProperties {
    // de inlocuit cu IP-ul din Docker
    String IP = "192.168.99.100";
    String PORT = "49161";
    // de inlocuit cu utilizatorul vostru
    String USER = "system";
    // de inlocuit cu parola voastra
    String PASS = "oracle";
    String SID = "xe";
    String DRIVER_CLASS = "oracle.jdbc.driver.OracleDriver";

}
