// Do overriding method must have same return type as method

class Test{
    Object show(){                              //parent class of String
        System.out.println("1");
        return null;
    }
}
class xyz extends Test{                      //child class of Object
    String show(){
        System.out.println("2");
        return "xyz";
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.show();
    }
}