class Test{
    void show(){
        System.out.println("Test class show method");
    }
}
class xyz extends Test{
    void show(){
        System.out.println("xyz class show method");
    }
    public static void main(String[] args) {
        Test t=new Test();
        xyz z=new xyz();
        z.show();
        t.show();
    }

}