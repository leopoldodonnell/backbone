environments {
    development {				
				//Completely disable css and/or js processor for development
				grails.resources.mappers.yuicssminify.disable=true
				grails.resources.mappers.yuijsminify.disable=true
    }
		test {
			
		}
    production {
				//Completely enable css and/or js processor
				grails.resources.mappers.yuicssminify.disable=false
				grails.resources.mappers.yuijsminify.disable=false
    }
}
