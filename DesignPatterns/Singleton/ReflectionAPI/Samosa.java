package org.example.DesignPatterns.Singleton.ReflectionAPI;

public class Samosa {
    //Making it private to avoid changing this var outside the class
    //This is a lazy way of initialization since we are not creating the object at start
    // we create it when we need it or when the getSamosa() method is called.
    // This is not thread safe.
    private static Samosa samosa;

    private Samosa(){
        if (samosa!=null)
            throw new RuntimeException("You are trying to break Singleton");
    }

    // We can make it synchronized either by making the method synchronized
    // or by using synchronized block
//    public synchronized static Samosa getSamosa(){
//        if (samosa == null){
//            samosa = new Samosa();
//        }
//        return samosa;
//    }

    public static Samosa getSamosa(){
        synchronized (Samosa.class){
            if (samosa == null){
                samosa = new Samosa();
            }
        }
        return samosa;
    }
}
