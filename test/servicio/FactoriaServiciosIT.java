/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

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
public class FactoriaServiciosIT {

    public FactoriaServiciosIT() {
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
     * Test of getInstancia method, of class FactoriaServicios.
     */
    @Test
    @Ignore
    public void testGetInstancia() {
        System.out.println("getInstancia");
        FactoriaServicios expResult = null;
        FactoriaServicios result = FactoriaServicios.getInstancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getConexionDb method, of class FactoriaServicios.
     */
    @Test
//    @Ignore
    public void testGetConexionDb() throws Exception {
        System.out.println("getConexionDb");
        Conexion result = FactoriaServicios.getInstancia().getConexionDb();
        result.un_sql = "INSERT INTO producto(pr_id, pr_nombre, pr_moneda,"
                + " pr_valormoneda) VALUES ("
                + 1005 + ",'Producto de Prueba','Moneda de Prueba'," + 784.56
                + ")";
        result.un_st.executeUpdate(result.un_sql);
        result.un_sql = "SELECT count(*) as total FROM producto";
        result.resultado = result.un_st.executeQuery(result.un_sql);
        if (result.resultado != null) {
            result.resultado.next();
            System.out.println("Cantidad de Registros en la BD: "
                    + result.resultado.getInt("total"));
            result.resultado.close();
        }
    }

}
