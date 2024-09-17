package org.example.DesignPatterns.Singleton.Serialization;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Samosa s1 = Samosa.getSamosa();

        System.out.println(s1.hashCode()); // 1828972342

        //Here all hashcodes are same which reprsents only single object is created.

        //Serialization
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//        oos.writeObject(s1);
//        oos.close();
//
//        //DeSerialization
//        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("abc.ob"));
//        Samosa s2  =(Samosa) ois.readObject();
//        ois.close();
//        System.out.println(s2.hashCode()); // 1793329556
//        //Here we can see after deserialzation a new instance is created.


        //After we implement readResolve method


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);
        oos.close();

        //DeSerialization
        ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2  =(Samosa) ois.readObject();
        ois.close();
        System.out.println(s2.hashCode()); // 1828972342
        //Here we can see after deserialzation we are getting same instance.

    }
}
