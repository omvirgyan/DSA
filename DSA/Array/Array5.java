//Count the number of occurrence and last occurence of particular element X
class Array5 {
   static void occurrence(int[] arr,int X){
    int count = 0; boolean found = false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==X){
            found=true;
            count++;
        }
    }if(found==true){
        System.out.println(X+" Present "+count+" Times");
    }else{
        System.out.println("Not present");
    }
   }
    static void lastOccurence(int[] arr,int X){
    boolean found = false; int foundAt =0;
    for(int i=0;i<arr.length;i++){
    if(arr[i]==X){
        found=true;
        foundAt=i;
    }
   }
   if(found==true){
    System.out.println(X+" LastOccurence At "+foundAt);
   }
   else{
    System.out.println("Not present");
}
static void countStricktly(int[] arr,int X){
    boolean found = false; int foundAt =0;
    for(int i=0;i<arr.length;i++){
    if(arr[i]==X){
        found=true;
        foundAt=i;
    }
   }
   if(found==true){
    System.out.println(X+" LastOccurence At "+foundAt);
   }
   else{
    System.out.println("Not present");
}
}
    public static void main(String[] args) {
        int[] arr = {55,6,77,80,7,6,68,95};
        occurrence(arr, 6);
        lastOccurence(arr, 55);
    }
}
