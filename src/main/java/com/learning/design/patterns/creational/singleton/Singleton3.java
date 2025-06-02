package com.learning.design.patterns.creational.singleton;

/**
 * This is called <b>Double Checked Locking</b>. This basically allows multiple threads to
 * access the {@code getInstance} method and maintains the singularity of the class.
 * This is the most efficient approach.
 * @author Manoj Langote
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if(instance == null){
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
