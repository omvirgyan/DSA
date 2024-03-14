class Array{
    void demoArray(){
        int[] age=new int[3];
        float[] weight=new float[2];
        String[] name=new String[1];
        String[] newName={"Ankit","Mohan","Sohan"};
        //assing the value
        age[2]=5;
        age[1]=3;
        age[0]=33;
        weight[1]=3.1f;
        weight[0]=2.0f;
        //name[1]='Shyam';
        name[0]="Ram";
        System.out.println(age[2]);
        System.out.println(weight[1]);
        System.out.println(name[0]);
        System.out.println(newName[1]);
        //travarsal of array by for loop
        for(int i=0; i< age.length; i++){
            System.out.println(age[i]);
        }
        //travarsal of array by for each loop
        for(String newNames:newName){  //newNames is new varaiable in all element of newName store
            System.out.println(newNames);
        }
        //travarsal of array by whileloop
        int i=0;
        while (i<name.length) {
            System.out.println(name[i]);
            ++i;//
        }
    }
public static void main(String[] args){
    Array array=new Array();
    array.demoArray();
}
}