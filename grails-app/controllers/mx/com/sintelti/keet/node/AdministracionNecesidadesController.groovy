package mx.com.sintelti.keet.node

/*
 * author: @Joxebus
 * date: 28/10/2011
 * time: 16:26 hrs
 */

class AdministracionNecesidadesController {
	
	def administracionNecesidadesService

    def index() {
		
		render view:"necesidades"	 
	}
	
	def registrarNecesidad = {
		def resultado = administracionNecesidadesService.agregarNecesidad(params)
		
		if(resultado instanceof Necesidad){			
			render view:"detalleNecesidad", model:[	necesidad : resultado ]
		}else{
			flash.errors = resultado
			render view:"necesidades"					
		}
		
	}
	
	def agregarDatoEnvio = {
		def resultado = administracionNecesidadesService.agregarDatoEnvio(params)
		if(resultado instanceof Necesidad){
			render view:"detalleNecesidad", model:[ necesidad : resultado ]
		}else{
			flash.errors = resultado
			render view:"necesidades"	
		}
	}
	
	def agregarDatoRecepcion = {
		def resultado = administracionNecesidadesService.agregarDatoRecepcion(params)
		if(resultado instanceof Necesidad){
			render view:"detalleNecesidad", model:[ necesidad : resultado ]
		}else{
			flash.errors = resultado
			render view:"necesidades"	
		}
	}
}
