package com.learning.design.patterns.creational.singleton;

/**
 * A basic implementation of the Singleton design pattern.
 * <p>
 * This class ensures that only one instance of {@code Singleton1} is created
 * and provides a global point of access to it.
 * </p>
 *
 * <p><b>Important Note:</b> This implementation is not thread-safe.
 * If multiple threads access the {@code getInstance()} method simultaneously,
 * it may lead to the creation of multiple instances of the class.
 * Consider using synchronized blocks, double-checked locking, or an enum-based
 * singleton for thread-safe implementations.
 * </p>
 *
 * @author Manoj Langote
 */
public class Singleton1 {

    // Static reference to the single instance
    private static Singleton1 singleton1;

    // Private constructor to prevent instantiation from outside the class
    private Singleton1() {
    }

    /**
     * Returns the single instance of {@code Singleton1}.
     * If the instance does not exist, it creates a new one.
     *
     * @return the singleton instance of {@code Singleton1}
     */
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}
