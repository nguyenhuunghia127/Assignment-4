
package vonglap;

import java.util.Scanner;
import java.util.Random;

public class Vonglap {
    public static void main(String[] args) {
        System.out.println("Homer says:");
        for (int i = 1; i <= 4; i++) {
            System.out.println("I am so smart");
        }
        System.out.println("S-M-R-T... I mean S-M-A-R-T");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " squared = " + (i * i));
        }
        System.out.println("Whoo!");
        System.out.print("T-minus");
        for(int i=10;i>=1;i--){
            System.out.print(i+", ");
        }
        System.out.println("blastoff");
        System.out.println("the end");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner console = new Scanner(System.in);
        int sum =0;
        int number =1;
        while (number !=0){
            System.out.print("enter a number (0 to quit): ");
            number =console.nextInt();
            sum = sum + number;
        }
        System.out.println("the total is "+sum);
        Random rand =new Random();
        int r = rand.nextInt(3);
        if( r == 0){
            System.out.println("rock");
        }
        else if ( r == 1){
            System.out.println("paper");
        }
        else{
            System.out.println("scissors");
        }
    }
    
}
