//import grails.util.Holders
//
//eventWebXmlStart = {
////    if (!Holders.config.security.cas.bypass) {
//        def tmpWebXml = "${projectWorkDir}/web.xml.tmp"
//        println "[collectory] projectWorkDir = ${projectWorkDir}"
//        ant.replace(file: tmpWebXml, token: "@security.cas.serverName@", value: Holders.config.security.cas.serverName)
//        println "[collectory] Injecting CAS Security Configuration: serverName = ${Holders.config.security.cas.serverName}"
//        ant.replace(file: tmpWebXml, token: "@security.cas.contextPath@", value: Holders.config.security.cas.contextPath)
//        println "[collectory] Injecting CAS Security Configuration: contextPath = ${Holders.config.security.cas.contextPath}"
//        ant.replace(file: tmpWebXml, token: "/substitute-me", value: Holders.config.security.cas.urlPattern)
//        println "[collectory] Injecting CAS Security Configuration: url pattern = ${Holders.config.security.cas.urlPattern}"
////    }
//}
