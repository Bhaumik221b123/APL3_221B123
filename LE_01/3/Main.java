class Main {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // show() of Mother is called

        Child ch = new Child();
        ch.show(); // show() of Child is called

        Mother m1 = new Child();
        m1.show(); 
    }
}

  
