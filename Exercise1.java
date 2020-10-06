
/**
 * Write a description of class Exercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Exercise1
{
    
    public static void main(String args[]){
        Scanner cs=new Scanner(System.in);
        System.out.println("What is the password?");
        if("dragon".equals(cs.nextLine())){
            System.out.println("Correct! My secret is: I am Batman.");
        }
        else{
            System.out.println("Incrroect Password! My secret is still safe...");
        
    }
}
}