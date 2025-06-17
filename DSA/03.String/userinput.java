import java.util.Scanner;

public class userinput{
    public static void main(String[] args) {
        String str="This is String";
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        // String sc=scanner.nextLine();
        // System.out.println(sc);

        char ch=str.charAt(0);      //acces the charter in string
        System.out.println(ch);
        int len=str.length();
        System.err.println(len);  //count the char in string or total length of string

        for(int i=0; i<str.length(); i++) {
             System.out.println(str.charAt(i));
        }
        System.out.println(str.substring(0));//This is String
         System.out.println(str.substring(0, 2)); //Th
    }
}