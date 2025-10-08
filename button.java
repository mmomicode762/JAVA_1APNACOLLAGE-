import java.util.Scanner;

public class button {
    //condition statement (if,else if)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        if(button==1){
            System.out.println("Hello");
        }else if(button==2){
            System.out.println("Welcome");
        }else if(button==3){
            System.out.println("Goodbye");
        }else{
            System.out.println("Invalid button");
        }
    }
}
