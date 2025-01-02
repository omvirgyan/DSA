import java.util.*;
public class hash{
    public static void main(String[] args) {
        Map<String,Integer> mp = new HashMap<>();
        mp.put("omvir",50);
        mp.put("Deepak",53);
        mp.put("Pranav",54);
        mp.put("Shubham",55);
        mp.put("Deepak",90);
        mp.remove("Shubham");      //remove key value pair
        System.err.println(mp.get("Pranav"));
        System.err.println(mp.get("Deepak"));
        System.out.println(mp.size());
        System.out.println(mp.containsKey("omvir"));
        System.out.println(mp.values());
        System.out.println(mp.keySet());
        System.out.println(mp.entrySet());

         

    }
}