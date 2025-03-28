 abstract class Beverage{
    void pow(int qty){
        System.out.println("Add" + qty + "ml of beverage");
        
    }
    protected abstract void addContiments();
    protected void stir(){}
    private void serve(){
        System.out.println("serve");
        
    }
    public void templateMethod(int qty){
        pow(qty);
        addContiments();
        stir();
        serve();
        
    }
}