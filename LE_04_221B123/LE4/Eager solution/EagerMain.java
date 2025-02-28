public class EagerMain {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Both same ");
        } else {
            System.out.println("Instances are different");
        }
    }
}
