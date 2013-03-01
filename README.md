foo-commonj
===========

This an implementation of the commonj API, implemented by some application servers - WebSphere and BEA mostly - 
to allow web applications to use application server managed threads.

This implementation allows the same API to be used in servers that do not implement this, like Apache Tomcat.

At [SecondFloor] (www.secondfloor.nl) we use it to setup a lightweight development environment by using a Tomcat with some extra enterprisey frameworks such as this one.   
This makes for a lightweight equivalent of our target deployment environment - typically WebSphere.

## Original work

The original work for this implementation was done at [Foo CommonJ] (http://commonj.myfoo.de/).  

I found a couple of people looking for this, and multiple places that host the same fixes, all looking like an unshared solution, so we decided to share our working solution to promote collaboration.
