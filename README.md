# Instructions

1. Install SBT.
2. Clone this project to ~/Development/springmvc-starter
3. cd ~/Development/springmvc-starter
4. Enter the following in your terminal:

<pre>
$ sbt
> container:start
> ~aux-compile
</pre>

The above commands will start the SBT console, download dependencies, compile, and deploy the web app to a running Jetty container.  The last command will run aux-compile as a SBT triggered execution.  This means SBT will poll for code changes, recompile, and deploy to the Jetty container!

# SBT Config
If you keep getting the following exception:

<pre>
java.lang.OutOfMemoryError: PermGen space
Error during sbt execution: java.lang.OutOfMemoryError: PermGen space
</pre>

Then create an SBT config file at ~/.sbtconfig and add the following JVM config:

<pre>
SBT_OPTS="-XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:PermSize=256M -XX:MaxPermSize=512M"
</pre>

