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
    static hasMany = [datosEnvio: Datos, datosRecepcion: Datos]

    static constraints = {
        titulo                  blank: false, size:5..40
        descripcion             blank: false
        sistemaOrigen           blank: false
        sistemaDestino          blank: false
        
    }
}
