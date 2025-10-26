public class SetBits {
    public static void main(String[] args) {
        int n=5;//set bit a OR operation hoi
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber =bitMask | n;
        System.out.println(newNumber);
    }
}
