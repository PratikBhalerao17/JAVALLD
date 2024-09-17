package org.example.DesignPatterns.Singleton;

public class Jalebi {

    // Eager initialization as we are creating the object before it is called.
    // This is naturally thread safe.
    private static Jalebi jalebi = new Jalebi();

    private Jalebi(){

    }

    public static Jalebi getJalebi(){
        return jalebi;
    }
}
