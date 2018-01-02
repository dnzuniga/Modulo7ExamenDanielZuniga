/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Daniel
 */
public class ProductoIT {

    public ProductoIT() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("INICIANDO LAS PRUEBAS...\n");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("\nTODAS LAS PRUEBAS HAN FINALIZADO...");
    }

    @Before
    public void setUp() {
        System.out.println("<<<Iniciando el caso de prueba>>>");
    }

    @After
    public void tearDown() {
        System.out.println("<<<Caso de prueba finalizado>>>\n");
    }

    /**
     * Test of getId method, of class Producto.
     */
    @Test
    @Ignore
    public void testGetId() {
        System.out.println("getId");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Producto.
     */
    @Test
    @Ignore
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Producto instance = new Producto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Producto.
     */
    @Test
    @Ignore
    public void testGetNombre() {
        System.out.println("getNombre");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Producto.
     */
    @Test
    @Ignore
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Producto instance = new Producto();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoneda method, of class Producto.
     */
    @Test
    @Ignore
    public void testGetMoneda() {
        System.out.println("getMoneda");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getMoneda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoneda method, of class Producto.
     */
    @Test
    @Ignore
    public void testSetMoneda() {
        System.out.println("setMoneda");
        String moneda = "";
        Producto instance = new Producto();
        instance.setMoneda(moneda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorMoneda method, of class Producto.
     */
    @Test
    @Ignore
    public void testGetValorMoneda() {
        System.out.println("getValorMoneda");
        Producto instance = new Producto();
        float expResult = 0.0F;
        float result = instance.getValorMoneda();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorMoneda method, of class Producto.
     */
    @Test
    @Ignore
    public void testSetValorMoneda() {
        System.out.println("setValorMoneda");
        float valorMoneda = 0.0F;
        Producto instance = new Producto();
        instance.setValorMoneda(valorMoneda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantidadProductos method, of class Producto.
     */
    @Test
//    @Ignore
    public void testCantidadProductos() {
        System.out.println("cantidadProductos");
        Producto instance = new Producto();
//        int expResult = 0;
        int result = instance.cantidadProductos();
        System.out.println("Productos existentes: " + result);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of grabar method, of class Producto.
     */
    @Test
//    @Ignore
    public void testGrabar() {
        System.out.println("grabar");
        int producto = 1003;
        testCantidadProductos();
        Producto instance = new Producto(producto, "Producto de prueba 3",
                "dolar", (float) 800);
        System.out.println("Agrega producto " +producto);
        instance.grabar();
        testCantidadProductos();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class Producto.
     */
    @Test
//    @Ignore
    public void testEliminar() {
        System.out.println("eliminar");
        testCantidadProductos();
        int producto = 1003;
        Producto instance = new Producto(producto);
        boolean expResult = true;
        boolean result = instance.eliminar();
        System.out.println("Elimina producto " + instance.getId());
        testCantidadProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerProductos method, of class Producto.
     */
    @Test
//    @Ignore
    public void testObtenerProductos() {
        System.out.println("obtenerProductos");
        Producto instance = new Producto();
//        Producto[] expResult = null;
        Producto[] result = instance.obtenerProductos();
        for (int cont = 0; cont < result.length; cont++) {
            System.out.println("Id " + result[cont].getId() + " Nombre "
                    + result[cont].getNombre() + " Moneda "
                    + result[cont].getMoneda() + " Valor "
                    + result[cont].getValorMoneda());
        }
//        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
