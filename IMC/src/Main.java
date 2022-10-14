import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{

    public static void main(String[] args) {
        try{
            Thread.sleep(500);
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch(Exception e){
            e.printStackTrace();
        }

        Scanner teste = new Scanner(System.in);
        float altura, peso, IMC;

        altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura:" ));
        peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso:" ));

        IMC = peso/(altura * altura);

        JOptionPane.showMessageDialog(null, "Seu IMC é: " + IMC);

        if(IMC < 17) {
            JOptionPane.showMessageDialog(null,"Você está muito abaixo do peso.");
        }
        if((IMC >= 17) && (IMC <= 18.49)) {
            JOptionPane.showMessageDialog(null,"Você está abaixo do peso.");
        }
        if((IMC >= 18.5) && (IMC <= 24.99)) {
            JOptionPane.showMessageDialog(null,"Seu peso está normal.");
        }
        if((IMC >= 25) && (IMC <= 29.99)) {
            JOptionPane.showMessageDialog(null,"Você está acima do peso.");
        }
        if((IMC >= 30) && (IMC <= 34.99)) {
            JOptionPane.showMessageDialog(null,"Você está com Obesidade I.");
        }
        if((IMC >= 35) && (IMC <= 39.99)) {
            JOptionPane.showMessageDialog(null,"Você está com Obesidade II(severa).");
        }
        if(IMC >= 40) {
            JOptionPane.showMessageDialog(null,"Você está com Obesidade III(mórbida!).");
        }
    }
}