package org.example.DesignPatterns.Singleton.ThreadSafeLazy;

import org.example.DesignPatterns.Singleton.Jalebi;

public class Client {
    public static void main(String[] args) {
        Samosa s1 = Samosa.getSamosa();
        Samosa s2 = Samosa.getSamosa();
        Samosa s3 = Samosa.getSamosa();

        System.out.println(s1.hashCode()); // 1828972342
        System.out.println(s2.hashCode()); // 1828972342
        System.out.println(s3.hashCode()); // 1828972342
        //Here all hashcodes are same which reprsents only single object is created.


//        Jalebi j1 =  Jalebi.getJalebi();
//        Jalebi j2 =  Jalebi.getJalebi();
//        Jalebi j3 =  Jalebi.getJalebi();
//
//        System.out.println(j1.hashCode()); // 931919113
//        System.out.println(j2.hashCode()); // 931919113
//        System.out.println(j3.hashCode()); // 931919113

        //Here all hashcodes are same which reprsents only single object is created by eager initialization

    }
}
