# DesignPatternsExperiments

Adapter is applied in Java8: 

Arrays -> Lists

Streams

////////////////////////////////////////

Bridge -> JDBC

Composite pattern -> Map, java.awt.Component, JSF widgets, RESTful service GETs

Composite != Composition

================== Decorator =============
Example: java.io.InputStream

java.util.Collections#checkedList

AWT UI components 
```
File file = new File("./output.txt");

file.createNewFile():

OutputStream oStream = new FileOutputStream(file);

DataOutputStream doStream = new DataOutputStream(oStream);

doStream.writeChars("text");
```

