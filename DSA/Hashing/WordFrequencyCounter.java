//Count frequency of each word in a string
// Input: "apple banana apple orange banana apple"
// Output:
// apple → 3  
// banana → 2  
// orange → 1

import java.util.HashMap;


class WordFrequencyCounter{
    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple";
        String[] words = input.split(" ");
        HashMap<String,Integer> freq=new HashMap<>();
       for(int i=0;i<words.length;i++){

           if(freq.containsKey(words[i])){
            freq.put(words[i],freq.getOrDefault(words[i], 0)+1);
           }else{
            freq.put(words[i], 1);
           }
       }
   System.out.println(freq);
    }
}