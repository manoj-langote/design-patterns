package com.learning.design.patterns.creational.singleton;

/**
 * This is implementation of a singleton design pattern having synchronized implementation
 * across multiple threads. Adding {@code synchronized} keyword to {@code getInstance}
 * method restrict it to be accessible by multiple threads at a time.
 * <p>
 *     This implementation can cause the performance issue as {@code getInstance} method
 *     can be accessed by 1 thread at a time and other threads has to wait in order to access it.
 * </p>
 * @author Manoj Langote
 */

public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2(){}

    /**
     * Added synchronized keyword to {@code getInstance} method which make sure thread
     * safety when calling this method. Only one thread can access it at a time.
     * @return {@code Singleton2} class object.
     */
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
