package es2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dammi un intero");
        int intero = Integer.parseInt(sc.nextLine());
        switch (intero){
            case 0:{
                System.out.println("zero");
                break;
            }
            case 1:{
                System.out.println("uno");
                break;
            }
            case 2: {
                System.out.println("due");
                break;
            }
            case 3: {
                System.out.println("tre");
                break;
            }
            default:{
                System.out.println("ERRORE!");
            }
        }
        sc.close();
    }
}
