class Test02{
    void show(String a){
        System.out.println("Test class show method");
    }
}
class xyz extends Test{
    void show(String a){
        System.out.println("xyz class show method");
    }
    public static void main(String[] args) {
        Test02 t=new Test02();
        xyz z=new xyz();
        z.show("hello");
        t.show("dk");
    }
}