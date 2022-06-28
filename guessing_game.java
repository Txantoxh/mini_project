public class guessing_game{
    public static void main(String[]args){
        System.out.println("Enter the alphabts");
        String user =  sc.next().charAT(0);
        if(user=="a" || user=="b" || user== "c"|| user=="o"){
            System.out.println("Character is vowel ="+ user);
        }
        else{
            System.out.println("Character is consonent =" +user);
        }
    }


}