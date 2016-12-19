Jersey Spring Security Injection Integration
============================================

Though this project does show how to use Spring Security with Jersey, it's main purpose is
to show how we can inject Spring Beans into both Spring (Security) components as well as
Jersey components.

This project is based on Stack Overflow question http://stackoverflow.com/q/41215354/2587435

The use case for the OP was that they are using Hibernate and would like to share the same instance
of the `SessionFactory` with both Spring components used for Security Filtering, and also
with Jersey components (resources).

So what this project does is inject the `DemoDao` into both the `SecurityConfig` (where it can be
passed to the security filter) and the `HelloResource`. This will be the same instance. The filter
(DummySecurityFilter) will set a value in the dao, and the Jersey resource will receive it.

### To run the application

    mvn jetty:run

This will (first download deps and build) start a Jetty server through the jetty-maven-plugin.
To test just do (with cURL)

    curl -i http://localhost:8080/api/hello

to see an unauthenticated response, and do

    curl -i http://localhost:8080/api/hello -u Peeskillet:password

to see an authenticated response.
