// Can we achieve Method Overloading by changing the return type of method only
// ans no because of ambiguity
class Test01{
    void show(){
        System.out.println("1");
    }
    String show(int a){
        System.out.println("with argu");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show(5);
    }
}