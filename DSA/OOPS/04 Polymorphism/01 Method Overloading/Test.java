//diffrent argument
class Test{
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("with argu");
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.show(5);
    }
}