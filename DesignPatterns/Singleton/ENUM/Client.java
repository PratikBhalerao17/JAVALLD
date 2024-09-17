package org.example.DesignPatterns.Singleton.ENUM;


public class Client {
    public static void main(String[] args) {
        Samosa samosa = Samosa.Instance;
        Samosa samosa2 = Samosa.Instance;
        System.out.println(samosa.hashCode()); // 1828972342
        System.out.println(samosa2.hashCode()); // 1828972342
    }
}
