package vonglap;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int points = 0;
        int in = 0;
        while(in<3){
            int num = random.nextInt(4) + 2;
            int[] add = new int[num];
            for (int i = 0; i < num; i++) {
                add[i] = random.nextInt(30) + 1;
            }
            System.out.print(add[0]);
            for (int i = 1; i < num; i++) {
                System.out.print(" + " + add[i]);
            }
            System.out.print(" = ");
            int user = scanner.nextInt();
            int Answer = 0;
            for (int addend : add) {
                Answer += addend;
            }
            if (user == Answer) {
                System.out.println("Correct!");
                points++;
            } else {
                System.out.println("Wrong! The answer was " +Answer);
                in++;
            }
        }

        System.out.println("You earned " + points + " total points.");
    }
}