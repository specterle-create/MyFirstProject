import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    //Random rand = new Random();
    //int soMayMan=rand.nextInt(10)+1;
    int soMayMan=7;
    System.out.print("The range number: (1-10): ");
    int number=sc.nextInt();

    if(number==soMayMan){
        System.out.println("correctly");
    }
    else{
        System.out.println("Wrong number");
    }

    }
}
