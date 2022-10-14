//Fazer um programa em JAVA que receba um número inteiro e retorne se o mesmo é par ou impar.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num;

        System.out.println("\n\nInforme o número: ");
        num = scanner.nextInt();

        if(num%2 == 0){
            System.out.println("Seu número é par!");
        }
        else{
            System.out.println("Seu número é impar!");
        }
    }
}
