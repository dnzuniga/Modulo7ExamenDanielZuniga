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
public class IndicadorIT {

    public IndicadorIT() {
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
     * Test of getUrl method, of class Indicador.
     */
    @Test
    @Ignore
    public void testGetUrl() {
        System.out.println("getUrl");
        Indicador instance = new Indicador();
        String expResult = "";
        String result = instance.getUrl();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUrl method, of class Indicador.
     */
    @Test
    @Ignore
    public void testSetUrl() {
        System.out.println("setUrl");
        String url = "";
        Indicador instance = new Indicador();
        instance.setUrl(url);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCodigo method, of class Indicador.
     */
    @Test
    @Ignore
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Indicador instance = new Indicador();
        String expResult = "";
        String result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Indicador.
     */
    @Test
    @Ignore
    public void testSetCodigo() {
        System.out.println("setCodigo");
        String codigo = "";
        Indicador instance = new Indicador();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Indicador.
     */
    @Test
    @Ignore
    public void testGetNombre() {
        System.out.println("getNombre");
        Indicador instance = new Indicador();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Indicador.
     */
    @Test
    @Ignore
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Indicador instance = new Indicador();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnidadMedida method, of class Indicador.
     */
    @Test
    @Ignore
    public void testGetUnidadMedida() {
        System.out.println("getUnidadMedida");
        Indicador instance = new Indicador();
        String expResult = "";
        String result = instance.getUnidadMedida();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUnidadMedida method, of class Indicador.
     */
    @Test
    @Ignore
    public void testSetUnidadMedida() {
        System.out.println("setUnidadMedida");
        String unidadMedida = "";
        Indicador instance = new Indicador();
        instance.setUnidadMedida(unidadMedida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Indicador.
     */
    @Test
    @Ignore
    public void testGetFecha() {
        System.out.println("getFecha");
        Indicador instance = new Indicador();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Indicador.
     */
    @Test
    @Ignore
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Indicador instance = new Indicador();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class Indicador.
     */
    @Test
    @Ignore
    public void testGetValor() {
        System.out.println("getValor");
        Indicador instance = new Indicador();
        String expResult = "";
        String result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class Indicador.
     */
    @Test
    @Ignore
    public void testSetValor() {
        System.out.println("setValor");
        String valor = "";
        Indicador instance = new Indicador();
        instance.setValor(valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consumir method, of class Indicador.
     */
    @Test
//    @Ignore
    public void testConsumir() {
        System.out.println("consumir");
        Indicador instance = new Indicador("http://mindicador.cl/api/"
                , "dolar");
        instance.consumir();
        System.out.println("URL " + instance.getUrl() + "\nCodigo "
                + instance.getCodigo() + "\nNombre "
                + instance.getNombre() + "\nUnidad de Medida "
                + instance.getUnidadMedida() + "\nFecha "
                + instance.getFecha() + "\nValor "
                + instance.getValor());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of conecta method, of class Indicador.
     */
    @Test
//    @Ignore
    public void testConecta() {
        System.out.println("conecta");
        Indicador instance = new Indicador("http://mindicador.cl/api/","dolar");
        boolean expResult = true;
        System.out.println("Se espera resultado "+expResult);
        boolean result = instance.conecta();
        System.out.println("Resultado obtenido: "+result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
