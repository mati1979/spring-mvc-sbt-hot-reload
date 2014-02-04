seq(webSettings :_*)

name := "Spring MVC Starter"

version := "1.0.0"

scalaVersion := "2.10.3"

libraryDependencies += "org.eclipse.jetty" % "jetty-webapp"        % "9.1.0.v20131115"  % "container,test"

libraryDependencies += "javax.servlet"     % "javax.servlet-api"   % "3.1.0" % "container,test"

libraryDependencies += "org.eclipse.jetty" % "jetty-jsp" % "9.1.0.v20131115" % "container"

libraryDependencies += "org.glassfish.web" % "javax.servlet.jsp" % "2.3.2"

libraryDependencies += "org.springframework" % "spring-webmvc" % "4.0.1.RELEASE"
