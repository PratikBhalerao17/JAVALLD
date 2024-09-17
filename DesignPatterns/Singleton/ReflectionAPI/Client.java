package org.example.DesignPatterns.Singleton.ReflectionAPI;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception{
        Samosa s1 = Samosa.getSamosa();
        Samosa s2 = Samosa.getSamosa();
        Samosa s3 = Samosa.getSamosa();

        System.out.println(s1.hashCode()); // 1828972342
        System.out.println(s2.hashCode()); // 1828972342
        System.out.println(s3.hashCode()); // 1828972342
        //Here all hashcodes are same which reprsents only single object is created.

        // Gives the constructor object of my class
        // Needs to throw an exception when using Reflection API
//        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//        //Here we are making constructor as accessible or public
//        constructor.setAccessible(true);
//        //Create new instance using this constructor
//        Samosa s4 = constructor.newInstance();
//
//        System.out.println(s4.hashCode()); // 1452126962
//        //Here we can see we are getting diff object using REflection API
//
//        //Again if we try to get the object with old approach we'll get it same object.
//        Samosa s5 = Samosa.getSamosa();
//        System.out.println(s5.hashCode()); // 1828972342


        try{
            Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            Samosa s4 = constructor.newInstance(); // throw exception from here
            System.out.println(s4.hashCode()); // not printed
        }
        catch (Exception e){
            System.out.println(e); // java.lang.reflect.InvocationTargetException
        }


    }
}
