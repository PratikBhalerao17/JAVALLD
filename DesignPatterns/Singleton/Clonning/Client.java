package org.example.DesignPatterns.Singleton.Clonning;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Samosa s1 = Samosa.getSamosa();
        Samosa s2 = (Samosa) s1.clone();

//        System.out.println(s1.hashCode()); // 1828972342
//        System.out.println(s2.hashCode()); // 1452126962

        //Here we can see that clone method is giving 2 different instances hence breaking the singelton.

        //To avoid it we can override clone method and pass the same object we need or pass the new runtimeException.

        System.out.println(s1.hashCode()); // 1828972342
        System.out.println(s2.hashCode()); // 1828972342

        //After overriding the clone method we are getting the same object.

    }
}
