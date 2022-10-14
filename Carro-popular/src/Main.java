import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cont= 0, contOnix= 0, contGol= 0, contPalio= 0, contHb= 0, melhor = 1;

        System.out.println("\n\nEscolha o melhor carro popular \n");

        while (melhor != 0){
            System.out.println("0- Sair da Pesquisa");
            System.out.println("1- Onix");
            System.out.println("2- Gol");
            System.out.println("3- Palio");
            System.out.println("4- HB20");
            melhor = scanner.nextInt();

            if (melhor != 0) {

                if (melhor == 1) {
                    contOnix++;
                }
                if (melhor == 2) {
                    contGol++;
                }
                if (melhor == 3) {
                    contPalio++;
                }
                if (melhor == 4) {
                    contHb++;
                }
                cont++;
            }
        }
        System.out.println("Total de votos: "+cont);
        System.out.printf("\nO Onix recebeu "+contOnix+" votos, que equivale a -> "+((contOnix*100)/cont)+"%% dos votos.");
        System.out.printf("\nO Gol recebeu "+contGol+" votos, que equivale a -> "+((contGol*100)/cont)+"%% dos votos.");
        System.out.printf("\nO Palio recebeu "+contPalio+" votos, que equivale a -> "+((contPalio*100)/cont)+"%% dos votos.");
        System.out.printf("\nO HB20 recebeu "+contHb+" votos, que equivale a -> "+((contHb*100)/cont)+"%% dos votos. \n\n");
    }
}