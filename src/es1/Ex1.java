package es1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dammi una stringa");
        String s = sc.nextLine();
        if(strigaPariDispari(s)){
            System.out.println("la stringa contiene un numero pari di caratteri");
        }else{
            System.out.println("la stringa contiene un numero dispari di caratteri");
        }
        System.out.println("dammi un anno");
        int anno = Integer.parseInt(sc.nextLine());
        if(annoBisestile(anno)){
            System.out.println("l'anno inserito è bisestile");
        }else{
            System.out.println("l'anno inserito non è bisestile");
        }
        sc.close();
    }

    public static boolean strigaPariDispari(String s){
        if(s.length()%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean annoBisestile(int anno){
        if(anno % 4 == 0 ){
            if(anno % 100 == 0){
                if(anno % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
