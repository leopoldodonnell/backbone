class BackboneGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for

		// @TODO Update this when you update the version of backbone.js
		static BACKBONE_VERSION = "0.5.3"
		
		// @TODO Update this when you update the version of underscore.js
		static UNDERSCORE_VERSION = "1.2.2"
		
    def grailsVersion = "2.0 > *"
    // the other plugins this plugin depends on
    def dependsOn = [jquery:"1.3.2.1 > *"]
		// TODO: update the dependencies once there is a solution in Grails 2.0.
    //def dependsOn = [jquery:"1.3.2.1 > *", 'yui-minify-resources':"0.1.4 > *"]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "Backbone Plugin" // Headline display name of the plugin
    def author = "Leo O\'Donnell"
    def authorEmail = "leopold.odonnell@gmail.com"
    def description = '''\
Simply suppy the necessary resources to use the backbone javascript library. Use this to avoid resource duplication and conflicts.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/backbone"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "GPL3"

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]


    // Online location of the plugin's browseable source code.
    def scm = [ url: "http://github/leopoldodonnell/backbone" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}
