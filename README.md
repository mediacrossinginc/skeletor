Skeletor
========

Provides a Scala wrapper for Hector https://github.com/hector-client/hector, a Java client library for Cassandra http://cassandra.apache.org/
Getting Started
---------------

0) Assumptions

* Cassandra 1.0.8 (or up to 1.2.1) is running locally - http://wiki.apache.org/cassandra/GettingStarted

1) Get Skeletor and cd to base directory 

2) Update the schema for Skeletor's Specification Tests

schema/bootstrap.txt contains the schema for Skeletor's Specification Tests

	cassandra-cli -host localhost -port 9160 -f schema/bootstrap.txt

3) Run Skeletor's test
	
	sbt test

How To Use
----------

The tests are also examples of how to use Skeletor.  Take a look at them.

You can package Skeletor as a jar within your project

	sbt package

And in your 
`build.sbt` file add to 
`libraryDependencies ++= Seq` so you get the Hector library and related dependencies

	"me.prettyprint" % "hector-core" % "1.0-5",
	"org.slf4j" % "slf4j-log4j12" % "1.7.2"
	

Thanx =) Joe Stein

http://linkedin.com/in/charmalloc

Updated for MediaCrossing by Gary Malouf 

http://www.linkedin.com/in/garymalouf

