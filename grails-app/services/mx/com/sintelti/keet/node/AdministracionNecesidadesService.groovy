package mx.com.sintelti.keet.node

class AdministracionNecesidadesService {
	
	def necesidad
		
	def agregarNecesidad(params){
		necesidad = new Necesidad(params)
		necesidad.sistema = Sistema.findByNombreLike(params.sistemaConversacion)
		necesidad.necesidadAnterior = Necesidad.findByTituloLike(params.titulo)
		return necesidad.save(flush:true)?:necesidad.errors			
	}
	
	def agregarDatoEnvio(params){
		def dato = new Datos(params)
		necesidad.addToDatosEnvio(dato)
		return necesidad.save(flush:true)?:necesidad.errors
			
	}
	
	def agregarDatoRecepcion(params){
		def dato = new Datos(params)
		necesidad.addToDatosRecepcion(dato)
		return necesidad.save(flush:true)?:necesidad.errors
	}
	
}
