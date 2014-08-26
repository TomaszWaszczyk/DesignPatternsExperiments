package com.waszczyk.designpatterns.creational.singleton2;


//Read more: http://javarevisited.blogspot.com/2012/07/why-enum-singleton-are-better-in-java.html#ixzz3BWFpiFT0


public class DoubleCheckedLockingSingleton{
    private volatile DoubleCheckedLockingSingleton INSTANCE;
 
    private DoubleCheckedLockingSingleton(){}
 
    public DoubleCheckedLockingSingleton getInstance(){
        if(INSTANCE == null){
           synchronized(DoubleCheckedLockingSingleton.class){
               //double checking Singleton instance
               if(INSTANCE == null){
                   INSTANCE = new DoubleCheckedLockingSingleton();
               }
           }
        }
        return INSTANCE;
    }
}
