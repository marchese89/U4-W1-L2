package es3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dammi una stringa");
        String s = sc.nextLine();
        while (!s.equals(":q")){
            System.out.println(suddividi(s));
            s = sc.nextLine();
        }
    }

    public static String suddividi(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length()-1; i++){
            sb.append(s.charAt(i));
            sb.append(",");
        }
        sb.append(s.charAt(s.length()-1));

        return sb.toString();
    }
}
