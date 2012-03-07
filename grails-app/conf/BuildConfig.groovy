grails.project.work.dir = 'target'

grails.project.docs.output.dir = "docs"

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
    }

    plugins {
        runtime ":rest-client-builder:1.0.1"
    }

    dependencies {
        provided "org.apache.ivy:ivy:2.2.0"
        provided("org.apache.maven:maven-ant-tasks:2.1.0",
                 "org.codehaus.groovy.modules.http-builder:http-builder:0.5.0") {
            excludes "commons-logging", "xml-apis", "groovy"
        }
        test("org.gmock:gmock:0.8.0") {
            export = false
        }
    }
}
