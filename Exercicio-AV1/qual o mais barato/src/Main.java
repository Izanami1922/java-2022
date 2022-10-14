//Fazer um programa em JAVA que receba o valor de dois produtos e diga qual dos dois é o mais barato.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float prod1, prod2, comp;

        System.out.println("\nInforme o valor do primeiro produto: ");
        prod1 = scanner.nextInt();
        System.out.println("\nInforme o valor do segundo produto: ");
        prod2 = scanner.nextInt();

        if(prod1 < prod2){
            System.out.println("O primeiro produto é mais barato!");
        }
        if(prod1 > prod2){
            System.out.println("O segundo produto é mais barato!");
        }
    }
}