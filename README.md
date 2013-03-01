foo-commonj
===========

This an implementation of the commonj API, implemented by some application servers - WebSphere and BEA mostly - 
to allow web applications to use application server managed threads.

This implementation allows the same API to be used in servers that do not implement this API, like Apache Tomcat.

At [SecondFloor] (www.secondfloor.nl) we use it to setup a lightweight development environment by using a Tomcat with some extra enterprisey frameworks such as this one.

