import java.util.HashMap;

public class anagrams {

    public static boolean areAnagrams(String t1,String t2){
        if(t1.length()!=t2.length()) return false;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t1.length();i++){
            char c=t1.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1 );
        }
        for(int i=0;i<t2.length();i++){
            char c=t2.charAt(i);
            if(!map.containsKey(c)) return false;
            map.put(c,map.getOrDefault(c,0)-1 );
            if(map.get(c) < 0) return false;
        }
        for(int count:map.values()){
            if(count !=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
       System.out.println(areAnagrams("s1", "s2"));

        System.out.println(areAnagrams("apple", "paple"));  // true

        System.out.println(areAnagrams("apple", "apply"));  // false

    }
}
