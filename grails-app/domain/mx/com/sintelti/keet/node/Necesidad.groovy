package mx.com.sintelti.keet.node

class Necesidad {

    String titulo
    String descripcion
    Sistema sistemaOrigen
    Sistema sistemaDestino
    boolean respuestaRequerida
    String otroSistema
    boolean isConversacion
    Sistema sistemaConversacion
    Necesidad necesidadAnterior
    static hasMany = [datosEnvio: Datos]
    static hasMany = [datosRecepcion: Datos]

    static constraints = {
    }
}
