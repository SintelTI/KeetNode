package mx.com.sintelti.keet.node

class Datos {

    String nombre
    String tipoDato
    String formato
    String detalle
    String tabla

    static constraints = {
        nombre(blank:false)
    }
}
