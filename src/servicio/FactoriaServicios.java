/**
 * Resuelve el examen del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
package servicio;

/**
 * Clase acorde a los patrones de programación Factory Method y Singleton
 *
 * @author Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd), sobre el trabajo
 * realizado en la guía 2.4 por la docente Yasna Meza Hidalgo
 */
public class FactoriaServicios {

    /**
     * Instancia del servicio a base de datos. este puntero puede aceptar
     * cualquier clase que herede de Conexion, por ejemplo Conexion_MySQL
     */
    private Conexion cdb;

    /**
     * Un atributo compartido para todas las instancias de la clase factoria de
     * servicios
     */
    private static FactoriaServicios instancia;

    /**
     * Creates a new instance of FactoriaServicios
     */
    public FactoriaServicios() {
    }

    /**
     * El constructor se asegura que se cree una sola instancia de la propia
     * factoria
     *
     * @return Referencia a la instancia compartida
     */
    public static synchronized FactoriaServicios getInstancia() {
        if (instancia == null) {
            instancia = new FactoriaServicios();
        }
        return instancia;
    }

    /**
     * Retorna la conexión
     *
     * @return Instancia de la clase Conexion
     * @throws java.lang.ClassNotFoundException exepción de clase no encontrada
     * @throws java.lang.InstantiationException exepción de error de
     * instanciación
     * @throws java.lang.IllegalAccessException exepción de acceso ilegal
     */
    public Conexion getConexionDb() throws java.lang.ClassNotFoundException,
            java.lang.InstantiationException,
            java.lang.IllegalAccessException {
        if (cdb == null) {
            String nombreClase = "servicio.ConexionMySQL";

            /*
                Aqui se crea la instancia de la clase especifica de base
                de datos con la que queremos trabajar (las cuales
                deben heredar de Conexion).
             */
            cdb = (Conexion) Class.forName(nombreClase).newInstance();
        }
        return cdb;
    }

}
