package com.learning.design.patterns.creational.singleton;

public class Testee {
    public static void main(String[] args) {
        Singleton1 obj1 = Singleton1.getInstance();
        Singleton1 obj2 = Singleton1.getInstance();

        if(compareObjects(obj1, obj2)){
            System.out.println("Singleton1 class objects are equal.");
        }else {
            System.out.println("Singleton1 class object are not equal.");
        }

        Singleton2 obj3 = Singleton2.getInstance();
        Singleton2 obj4 = Singleton2.getInstance();

        if(compareObjects(obj3, obj4)){
            System.out.println("Singleton2 class objects are equal.");
        }else {
            System.out.println("Singleton2 class object are not equal.");
        }

        Singleton3 obj5 = Singleton3.getInstance();
        Singleton3 obj6 = Singleton3.getInstance();

        if(compareObjects(obj5, obj6)){
            System.out.println("Singleton2 class objects are equal.");
        }else {
            System.out.println("Singleton2 class object are not equal.");
        }






    }

    public static boolean compareObjects(Object obj1, Object obj2){
        return obj1.equals(obj2);
    }
}
