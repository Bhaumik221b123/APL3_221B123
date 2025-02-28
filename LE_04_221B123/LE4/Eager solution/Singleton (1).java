public class Singleton {
    private static Singleton uniqueinstance = new Singleton();
    private Singleton() {
        
    }

    public static Singleton getInstance() {
        return uniqueinstance;
    }
}
