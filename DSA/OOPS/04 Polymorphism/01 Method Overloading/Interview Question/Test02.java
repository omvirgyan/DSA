//Can we ovrload main method
// ans Yes
public class Test02 {
    void show(int a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("String");
    }
    public static void main(String[] args) {
        System.out.println("1");
        Test02 t = new Test02();
        t.main(8);
    }
    public static void main(int a) {
        System.out.println("Another main Method");
    }
}
