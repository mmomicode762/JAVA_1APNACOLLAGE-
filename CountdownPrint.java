public class CountdownPrint {
    public static void countdownPrint(int n){
        if(n==0){
            System.out.println("HAPPY BIRTHDAY");
            return;
        }
        System.out.println(n);
        countdownPrint(n-1);
    }

    public static void main(String[] args) {
        countdownPrint(10);
    }
}
