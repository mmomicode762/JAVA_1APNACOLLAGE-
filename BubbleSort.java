public class BubbleSort {
    //if arr[i]>arr[i+1] swap them.To place the element int their respective position,we have to do following operation
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,8,1,3,2};
        //bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        printArray(arr);
    }
}
