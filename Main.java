import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //Random rand = new Random();
    //int soMayMan=rand.nextInt(10)+1;
    int soMayMan=7;
    System.out.print("so bi mat ma may da chon la(1-10): ");
    int number=sc.nextInt();

    if(number==soMayMan){
        System.out.println("dung roi thang l");
    }
    else{
        System.out.println("sai roi, bat ngo ch thang l");
    }

    }
}