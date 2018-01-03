/**
 * Resuelve el examen del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
package accesodatos;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import negocio.Indicador;

/**
 * Clase que permite consumir los datos contenidos en http://mindicador.cl/api,
 * acorde al patrón de programación DAO (data access object).
 *
 * @author Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
public class IndicadorDAO {
//    Atributo clase Indicador a usar para instanciar en el los datos consumidos

    private Indicador i;

    /**
     * Constructor sin parámetros
     */
    public IndicadorDAO() {
    }

    /**
     * Constructor que recoge el objeto clase Indicador a utilizar
     *
     * @param i corresponde al objeto clase indicador a instanciar
     */
    public IndicadorDAO(Indicador i) {
        this.i = i;
    }

    /**
     * Método para consumir la información contenida en la api
     * http://mindicador.cl/api
     *
     * @return retorna un objeto clase Indicador que contiene los datos
     * consumidos
     */
    public Indicador consumir() {
        try {
            URL url = new URL(i.getUrl());
            InputStream entrada = url.openStream();
            JsonReader reader = Json.createReader(entrada);
            JsonObject objeto = reader.readObject();
            i.setNombre(String.valueOf(objeto.getJsonObject(i.getCodigo())
                    .get("nombre")).substring(1, objeto.getJsonObject(i.getCodigo())
                    .get("nombre").toString().length() - 1));
            i.setUnidadMedida(String.valueOf(objeto.getJsonObject(i.getCodigo())
                    .get("unidad_medida")).substring(1, objeto
                            .getJsonObject(i.getCodigo()).get("unidad_medida")
                    .toString().length() - 1));
            i.setFecha(String.valueOf(objeto.getJsonObject(i.getCodigo())
                    .get("fecha")).substring(1, 11));
            i.setValor(String.valueOf(objeto.getJsonObject(i.getCodigo())
                    .get("valor")));
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return i;
    }

    /**
     * Método para deteminar si el url está disponible
     *
     * @return retorna true si el url está disponible y false en caso contrario
     */
    public boolean conecta() {
        boolean exito = false;
        try {
            URL urlTemp = new URL(i.getUrl() + i.getCodigo());
            InputStream entrada = urlTemp.openStream();
            exito = true;
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return exito;
    }
}
