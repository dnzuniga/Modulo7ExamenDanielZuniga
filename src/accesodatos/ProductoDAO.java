/**
 * Resuelve el examen del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
package accesodatos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import negocio.Producto;
import servicio.Conexion;
import servicio.FactoriaServicios;

/**
 * Clase correspondiente al objeto para conectarse a la base de datos acorde al
 * patron de programación DAO (data access object). Se configuraron los métodos
 * necesarios para agregar, leer, modificar y eliminar registros de la base de
 * datos, acorde a las instrucciones del examen
 *
 * @author Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
public class ProductoDAO {

    private Producto p;

    public ProductoDAO() {
    }

    public ProductoDAO(Producto p) {
        this.p = p;
    }

    /**
     * Método para averiguar la cantidad total de registros existentes en la
     * base de datos
     *
     * @return retorna el número de registros existentes
     */
    public int cantidadProductos() {
        int cantidad = 0;
        try {
            Conexion cdb = FactoriaServicios.getInstancia().getConexionDb();
            cdb.un_sql = "SELECT count(*) as total FROM producto";
            cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
            if (cdb.resultado != null) {
                cdb.resultado.next();
                cantidad = cdb.resultado.getInt("total");
                cdb.resultado.close();
            }
        } catch (SQLException | InstantiationException | IllegalAccessException
                | ClassNotFoundException ex) {
        }
        return cantidad;
    }

    /**
     * Método que permite insertar/actulizar un registro en la tabla de
     * productos en la base de datos.
     */
    public void grabar() {
        try {
            Conexion cdb = FactoriaServicios.getInstancia().getConexionDb();
            cdb.un_sql = "SELECT pr_id FROM producto WHERE pr_id = "
                    + p.getId() + "";
            cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
            if (cdb.resultado != null) {
                if (cdb.resultado.next()) {
                    cdb.un_sql = "UPDATE producto SET pr_nombre ='"
                            + p.getNombre() + "'"
                            + ", pr_moneda='" + p.getMoneda() + "'"
                            + ", pr_valormoneda='" + p.getValorMoneda() + "'"
                            + " WHERE pr_id ="
                            + p.getId() + ";";
                    cdb.un_st.executeUpdate(cdb.un_sql);
                } else {
                    cdb.un_sql = "INSERT INTO producto(pr_id, pr_nombre"
                            + ", pr_moneda, pr_valormoneda) VALUES ("
                            + p.getId() + ",'" + p.getNombre()
                            + "','" + p.getMoneda()
                            + "'," + p.getValorMoneda()
                            + ")";
                    cdb.un_st.executeUpdate(cdb.un_sql);
                }
            } else {
                cdb.un_sql = "INSERT INTO producto(pr_id, pr_nombre, pr_moneda"
                        + ", pr_valormoneda) VALUES ("
                        + p.getId() + ",'" + p.getNombre()
                        + "','" + p.getMoneda()
                        + "'," + p.getValorMoneda()
                        + ")";
                cdb.un_st.executeUpdate(cdb.un_sql);
            }
        } catch (SQLException | InstantiationException | IllegalAccessException
                | ClassNotFoundException ex) {
        }
    }

    /**
     * Método que permite eliminar un registro en la tabla de productos en la
     * base de datos
     *
     * @return retorna true si se eliminó el registro
     */
    public boolean eliminar() {
        boolean exito = false;
        try {
            Conexion cdb;
            cdb = FactoriaServicios.getInstancia().getConexionDb();
            cdb.un_sql = "SELECT pr_id FROM producto WHERE pr_id = " + p.getId();
            cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
            if (cdb.resultado != null) {
                cdb.un_sql = "DELETE FROM producto WHERE pr_id=" + p.getId();
                cdb.un_st.executeUpdate(cdb.un_sql);
                exito = true;
            } else {
                exito = false;
            }
        } catch (SQLException | InstantiationException | IllegalAccessException
                | ClassNotFoundException ex) {
        }
        return exito;
    }

    /**
     * Método que permite leer todos los productos desde la base de datos
     *
     * @return retorna un array de objetos producto leidos desde la base de
     * datos
     */
    public Producto[] obtenerProductos() {
        Producto[] todosProductos = new Producto[1];
        try {
            Conexion cdb = FactoriaServicios.getInstancia().getConexionDb();
            int cantidad, cont = 0;
            cdb.un_sql = "SELECT * FROM producto";
            cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
            if (cdb.resultado != null) {
                cdb.resultado.last();
                cantidad = cdb.resultado.getRow();
                cdb.resultado.beforeFirst();
                todosProductos = new Producto[cantidad];
                while (cdb.resultado.next()) {
                    todosProductos[cont] = new Producto();
                    todosProductos[cont].setId(Integer.parseInt(cdb.resultado
                            .getString("pr_id")));
                    todosProductos[cont].setNombre(cdb.resultado
                            .getString("pr_nombre"));
                    todosProductos[cont].setMoneda(cdb.resultado
                            .getString("pr_moneda"));
                    todosProductos[cont].setValorMoneda(Float.parseFloat(
                            cdb.resultado.getString("pr_valormoneda")));
                    cont++;
                }
            }
        } catch (SQLException | InstantiationException | IllegalAccessException
                | ClassNotFoundException ex) {
        }
        return todosProductos;
    }
}
