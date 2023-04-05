package Job_rb;

import java.util.Scanner;

public class Quetsão5 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String naoInvertida = input.nextLine();
        String invertida = "";

        for(int i = naoInvertida.length() -1; i >= 0; i--){
            invertida += naoInvertida.charAt(i);

        }
        System.out.println("iventando a string temos: " + invertida);
    }
}
