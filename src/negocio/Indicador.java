/**
 * Resuelve el examen del módulo 7 "Integración Módulos de Software",
 * Programa CORFO "Mil Programadores".
 *
 * @autor Daniel Zúñiga Correa, 2017-12-29 (yyyy-mm-dd)
 */
package negocio;

import accesodatos.IndicadorDAO;

/**
 * Corresponde a la clase desde la cual se instancian objetos indicador que
 * contienen como atributos los datos del indicador
 *
 * @author Daniel Zúñiga Correa, 2017-12-24 (yyyy-mm-dd)
 */
public class Indicador {
//    Artibutos de la clase

    private String url;
    private String codigo;
    private String nombre;
    private String unidadMedida;
    private String fecha;
    private String valor;

    /**
     * Constructor sin parámetros
     */
    public Indicador() {
    }

    /**
     * Constructor con los parámetros necesarios para instanciarlo, que a su vez
     * ejecuta los métodos que consumen los datos desde el url
     *
     * @param url corresponde al url http://mindicador.cl/api desde el cual se
     * consumiran los datos
     * @param codigo corresponde al indicador específico a consumir
     */
    public Indicador(String url, String codigo) {
        this.setUrl(url);
        this.setCodigo(codigo);
    }

//    Accesadores y Mutadores
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * Método que permite ejecutar el método consumir() de la clase
     * IndicadorDAO, instanciado el actual objeto con los valores consumidos
     */
    public void consumir() {
        IndicadorDAO indicadorJson = new IndicadorDAO(this);
        Indicador indicadorTemp = indicadorJson.consumir();
        this.setNombre(indicadorTemp.getNombre());
        this.setUnidadMedida(indicadorTemp.getUnidadMedida());
        this.setFecha(indicadorTemp.getFecha());
        this.setValor(indicadorTemp.getValor());
    }

    /**
     * Método que permite ejecutar el método conecta() desde la clase
     * IndicadorDao
     *
     * @return retorna true si el indicador específico es accesible para su
     * consumo, y false en caso contrario
     */
    public boolean conecta() {
        IndicadorDAO indjson = new IndicadorDAO(this);
        return indjson.conecta();
    }
}
