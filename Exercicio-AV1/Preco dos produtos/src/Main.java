/*Fazer um programas em JAVA que receba valores de uma quantidade indefinida de produtos (FLAG) e ao final retorne
o valor a ser pago, solicite o valor que o cliente passou e retorne o troco que deve ser devolvido.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valprod, troco, valortotal=0, pago;
        int flag=1;

        while (flag != 0){
            System.out.println("\n0- Para sair");
            System.out.println("1- Para adicionar um produto ");
            flag = scanner.nextInt();

            if(flag != 0){
                System.out.println("Digite o valor do produto: ");
                valprod = scanner.nextFloat();
                valortotal += valprod;
            }


        }
        System.out.println("O valor total é: "+valortotal);
        System.out.println("Quantos reais você pagou?");
        pago = scanner.nextInt();
        troco = pago - valortotal;
        System.out.println("O valor do troco é: "+troco);
    }
}