/**
 * Resuelve el taller número 1 del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-24 (yyyy-mm-dd)
 */
package servicio;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Clase padre para ejecutar una conexion a cualquier tipo de base de datos,
 * según el patron de programación DAO
 */
public class Conexion {

    public Connection conexion = null;
    public Statement un_st = null;
    protected DatabaseMetaData dbmd;
    public String s_conexion = null;
    public ResultSet resultado = null;
    public String un_sql = null;

    protected String jdbc;
    protected String driver;
    protected String host;
    protected String database;
    protected String username;
    protected String password;

    /**
     * Creates a new instance of Conexion
     *
     * @param jdbc Controlador del motor de base de datos
     * @param driver Driver de conexión
     * @param host Nombre de la máquina donde se aloja la base de datos
     * @param database Nombre de la base de datos
     * @param username Usuario de conexión
     * @param password Password para la conexión
     *
     */
    public Conexion(String jdbc, String driver, String host, String database,
            String username, String password) {
        this.jdbc = jdbc;
        this.driver = driver;
        this.host = host;
        this.database = database;
        this.username = username;
        this.password = password;
    }

    /**
     * @return string con el driver utilizado
     */
    public String getDriver() {
        return this.driver;
    }
}
