
/**
 * Write a description of class Exercise1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Exercise2
{
    
    public static void main(String args[]){
        Scanner cs=new Scanner(System.in);
        double tot=0;
        double grade=0;
        System.out.println("Enter total score of the test followed by enter followed by your score: ");
        tot=cs.nextDouble();
        grade=cs.nextDouble();
        double fscore=tot/grade*100;
        int f2=(int) fscore; 
        System.out.println(f2+ "% is your score!");
        if(f2>=86){
            System.out.println("A");
}
        else if(f2>=73 && f2<=85){
            System.out.println("B");
}
        else if(f2>=67 && f2<=72){
            System.out.println("C+");
}
        else if(f2>=60 && f2<=66){
            System.out.println("C");
}
        else if(f2>=50 && f2<=59){
            System.out.println("C-");
}
        else if(f2>=0 && f2<=49){
            System.out.println("F");
}else{
    System.out.println("Please enter valid numbers!");
}
}
}