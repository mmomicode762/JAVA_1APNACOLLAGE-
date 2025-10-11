public class CompareString {
    public static void main(String[] args) {
        String firstName="Momi";
        String SecondName="Momi";
        //1 s1>s2 :+ve value
        //2 s1==s2 :0
        //3 s1<s2 :-ve value

        //hello cello
        if(firstName.compareTo(SecondName) ==0){
           System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(firstName == SecondName){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
