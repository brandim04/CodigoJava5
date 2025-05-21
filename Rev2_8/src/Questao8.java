import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> precos = new ArrayList<>();
        
        System.out.println("Digite os preços dos produtos (digite 0 para parar):");
        
        while (true) {
            System.out.print("Preço: ");
            double preco = scanner.nextDouble();
            
            if (preco == 0) {
                break;
            }
            
            precos.add(preco);
        }
        
        if (precos.isEmpty()) {
            System.out.println("Nenhum preço foi cadastrado.");
        } else {
            double maiorPreco = Collections.max(precos);
            double menorPreco = Collections.min(precos);
            
            System.out.println("\nResultados:");
            System.out.println("Maior preço: R$ " + maiorPreco);
            System.out.println("Menor preço: R$ " + menorPreco);
        }
        
        scanner.close();
    }
}