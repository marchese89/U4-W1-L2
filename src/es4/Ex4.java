package es4;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dammi un numero");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = n; i >= 0; i--){
            System.out.println(i);
        }
        sc.close();
    }
}
