/**
 * Resuelve el examen del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
package negocio;

import accesodatos.ProductoDAO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * Corresponde a la clase desde la cual se instancian objetos producto que
 * contienen como atributos los datos del producto
 *
 * @author Daniel Zúñiga Correa, 2017-12-24 (yyyy-mm-dd)
 */
public class Producto {
//    Atributos de clase

    private int id;
    private String nombre, moneda;
    private float valorMoneda;

    /**
     * Constructor sin parámetros
     */
    public Producto() {
    }

    /**
     * Constructor con el parámetro correspondiente al id del objeto
     *
     * @param id corresponde al id del producto
     */
    public Producto(int id) {
        this.id = id;
    }

    /**
     * Constrcutor con todos los parámetros correspondientes a los atributos de
     * la clase
     *
     * @param id corresponde al id de producto
     * @param nombre corresponde al nombre del producto
     * @param moneda corresponde al indicador que se utilizará en el producto
     * @param valorMoneda corresponde al valor que tiene el indicador respectivo
     */
    public Producto(int id, String nombre, String moneda, float valorMoneda) {
        this.id = id;
        this.nombre = nombre;
        this.moneda = moneda;
        this.valorMoneda = valorMoneda;
    }

//    Accesadores y Mutadores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public float getValorMoneda() {
        return valorMoneda;
    }

    public void setValorMoneda(float valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    /**
     * Permite utilizar el método cantidad() desde ProductoDAO
     *
     * @return retorna la cantidad de productos contenidos en la base de datos
     */
    public int cantidadProductos() {
        ProductoDAO pdb = new ProductoDAO(this);
        return pdb.cantidadProductos();
    }

    /**
     * Permite utilizar el método grabar() desde ProductoDAO
     */
    public void grabar() {
        ProductoDAO pdb = new ProductoDAO(this);
        pdb.grabar();
    }

    /**
     * Permite utilizar el método eliminar() desde ProductoDAO
     *
     * @return retorna true si la eliminación fue exitosa, false en caso
     * contrario
     */
    public boolean eliminar() {
        ProductoDAO pdb = new ProductoDAO(this);
        return pdb.eliminar();
    }

    /**
     * Permite utilizar el método todosProductos() desde ProductoDAO
     *
     * @return retorna un array con todos los de Productos leidos desde la base
     * de datos
     */
    public Producto[] obtenerProductos() {
        ProductoDAO pdb = new ProductoDAO(this);
        return pdb.obtenerProductos();
    }
}
