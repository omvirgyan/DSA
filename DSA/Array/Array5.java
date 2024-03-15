//Count the number of occurrence,last occurence 
// and strictly greater than particular element X

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
    int lastIndex =-1;
    for(int i=0;i<arr.length;i++){
    if(arr[i]==X){
        lastIndex=i;
    }
   }
   if(lastIndex==-1){
    System.out.println("Not present");
   }
   else{
    System.out.println(X+" LastOccurence At "+lastIndex+ " Index");
    
   }
}
static void countStricktly(int[] arr,int X){
   int count = -1;
    for(int i=0;i<arr.length;i++){
    if(arr[i]> X){
        count++;
    }
   }
   if(count==-1){
    System.out.println("No element is strictly greater than "+X);
   }
   else{
    System.out.println(count+1+" element is Strictly greater than "+X);
}
}
    public static void main(String[] args) {
        int[] arr = {55,6,77,80,7,6,68,3,5,98};
        occurrence(arr, 95);
        lastOccurence(arr, 0);
        countStricktly(arr, 5);
    }
}
