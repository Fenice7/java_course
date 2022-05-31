package codeWars;

import java.util.Scanner;

public class ForLoops {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // 1
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); //2
            int b = in.nextInt(); //3
            int n = in.nextInt(); //4

            for (int j = 0; j < n; j++) {
                a += b * Math.pow(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();


    }

}
