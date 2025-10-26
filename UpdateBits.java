import java.util.Scanner;

public class UpdateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper =sc.nextInt();
        //oper=1 -> set bit ; oper =0 ->clear bit
        int n=5;
        int pos =1;
        int bitMask =1<<pos;
        if(oper==1){
            //set bit
            int newNumber =bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear bit
            int newBitMask=~(bitMask);
            int newNumber =newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
