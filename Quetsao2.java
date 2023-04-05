package Job_rb;

import java.util.Scanner;

public class Job2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int a = 0;
        int b = 1;

        System.out.println("Digite um número : ");
        num = input.nextInt();

        while(b < num){
            int  temp = b;
            b = a+b;
            a = temp;
        }
        if(b == num){
            System.out.println(num + " Está na sequência de Fibonacci.");
        }
        else{
            System.out.println(num + " Não Está na sequência de Fibonacci.");
        }
        }
    }   

