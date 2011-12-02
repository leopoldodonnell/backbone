// Resource declarations for Resources plugin
// This is a bit ugly, we'll find a way to make this better in future
def appCtx = org.codehaus.groovy.grails.commons.ApplicationHolder.application.mainContext
def plugin = appCtx.pluginManager.getGrailsPlugin('backbone')
def bbvers = plugin.instance.BACKBONE_VERSION
def usvers = plugin.instance.UNDERSCOR_VERSION

modules = {
		'backbone' {
			dependsOn 'jquery', 'underscore'
			
			resource id:'js', url:[plugin: 'backbone', dir:'backbone/js', file:"backbone-${bbvers}.js"],
				disposition: 'head'
		}
		'underscore' {
			dependsOn 'jquery'
			resource id:'js', url:[plugin: 'underscore', dir:'backbone/js', file:"underscore-${bbvers}.js"],
				disposition: 'head'
		}
}