import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class VolumeList {
    public static void main(String[] args) {
    Scanner scan =  new Scanner(System.in) ;     //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text


            List<Double> Dimensoes = new ArrayList<>();
        System.out.println("Vamos calcular o volume");
        System.out.println("Insira a largura:");
        Dimensoes.add(scan.nextDouble());
        System.out.println("Insira a comprimento:");
        Dimensoes.add(scan.nextDouble());
        System.out.println("insira a altura:");
        Dimensoes.add(scan.nextDouble());

        Double volume = Dimensoes.get(0) * Dimensoes.get(1) * Dimensoes.get(2);
        System.out.println("O volume será: " + volume);




    }
}