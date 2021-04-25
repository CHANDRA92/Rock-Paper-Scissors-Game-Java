package com.company;

import java.util.Random;
import java.util.Scanner;

//import static java.util.Random.*;

public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        System.out.println("PLay Rock paper scissors Game");
        System.out.println("Enter How many Round to WIN");
        int r=1;
        r= sc.nextInt();
        int i=1;
        for (i=1;i<=r;i++) {
            //generate Random no
            int rand = 0;
            while (true){
                rand = random.nextInt(3);
                if(rand !=0) break;
           }
            //System.out.println(rand);

            System.out.println("Enter 1 for Rock");
            System.out.println("Enter 2 for Paper");
            System.out.println("Enter 3 for Scissors");
            System.out.println("ROUND : "+i);
            int u = sc.nextInt();


            if (u == 2 && rand == 1) {
                System.out.println("You win ");
            } else if (u == 1 && rand == 3) {
                System.out.println("You win ");
            } else if (u == 3 && rand == 2) {
                System.out.println("You win ");
            } else if (u == rand) {
                System.out.println("TIE");
            } else {
                System.out.println("You loss ");
            }
            System.out.println("Computer Chose "+rand);
        }


    }
}
