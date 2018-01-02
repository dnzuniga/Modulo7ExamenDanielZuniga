/**
 * Resuelve el examen del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
package servicio;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Método para ejecutar una conexion a bases de datos MySql, según el patron de
 * programación DAO, heredando desde la clase Conexion
 */
public final class ConexionMySQL extends Conexion {

    private final String opciones;
    private static final String JDBC = "jdbc:mysql://";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String HOST = "localhost:3306";

    /**
     * Creates a new instance of Conexion_MySQL usando un username y password
     *
     * @param database Nombre de la base de datos
     * @param username Nombre del usuario de conexión
     * @param password Password de conexión
     * @throws java.lang.ClassNotFoundException exepción de clase no encontrada 
     * @throws java.lang.InstantiationException exepción de error de
     * instanciación
     * @throws java.lang.IllegalAccessException exepción de acceso ilegal
     * @throws java.sql.SQLException excepción de sentencia SQL errónea
     */
    public ConexionMySQL(String database, String username,
            String password) throws java.lang.ClassNotFoundException,
            java.lang.InstantiationException,
            java.lang.IllegalAccessException,
            java.sql.SQLException {
        super(JDBC, DRIVER, HOST, database, username, password);
        this.opciones = "charSet=LATIN1";
        initdb();
    }

    public ConexionMySQL() throws java.lang.ClassNotFoundException,
            java.lang.InstantiationException,
            java.lang.IllegalAccessException,
            java.sql.SQLException {
        this("modulo7examen", "root", "root");
    }

    public void initdb() throws java.lang.ClassNotFoundException,
            java.lang.InstantiationException,
            java.lang.IllegalAccessException,
            java.sql.SQLException {
        s_conexion = jdbc + host + "/" + database;
        Class.forName(driver).newInstance();

        // Aqui se usan las opciones
        conexion = DriverManager.getConnection(jdbc + host + "/" + database
                + "?" + opciones, username, password);
        dbmd = conexion.getMetaData();
        un_st = conexion.createStatement();

    }
}
