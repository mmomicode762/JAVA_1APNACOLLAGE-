public class array {
    //type[]arrayName=new type[size]
    //int [] marks =new int[3];
    public static void main(String[] args) {
        int [] marks =new int[3];//int marks []=new int[3];
        marks[0]=1;//phy
        marks[1]=2;//che
        marks[2]=3;//math
        // System.out.println(marks[0]);
       // System.out.println(marks[1]);
       // System.out.println(marks[2]);
        //using loop
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
