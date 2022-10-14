//Fazer um programa em JAVA que receba a idade de 10 pessoas
// e ao final mostre a idade da pessoa mais jovem e a idade da pessoal mais velha.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade, cont=0, contId=0, maiorId=0, menorId=200 ;

        while (cont < 10){
            System.out.println("Informe sua idade: ");
            idade = scanner.nextInt();

            if (idade > maiorId) {
                maiorId = idade;
            }
            if (idade < menorId ){
                menorId = idade;
            }

            cont++;
        }

        System.out.println("A maior idade é: "+maiorId);
        System.out.println("A menor idade é: "+menorId);

    }
}