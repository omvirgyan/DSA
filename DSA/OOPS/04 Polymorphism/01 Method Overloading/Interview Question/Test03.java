// case 1 Automatic promation

public class Test03 {
    void show(StringBuffer strbuf) {
        System.out.println("StringBuffer");
    }
    void show(Object obj) {
        System.out.println("object");
    }
    void show(int a){
        System.out.println("1");
    }
    void show(String a){
        System.out.println("String");
    }
    public static void main(String[] args) {
       Test03 t=new Test03();   
       t.show("string");      // String
       t.show('a');               //1 automatic pormation
    }  
}
