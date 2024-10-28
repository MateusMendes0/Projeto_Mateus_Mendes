public class D {
    
    String D1;
    boolean D2;

    public D(String D1, boolean D2){
        this.D1 = D1;
        this.D2 = D2;
    }

    public void MD1(){
        System.out.printf("D1 : %s \nD2: %b", D1, D2);
    }

    public boolean MD2(){
        return D2;
    }

    public void MD3(){
        System.out.println("MD3");
    }
}
