import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Por favor, digite o valor do produto");
    double produto = sc.nextInt(); 

    
    double valorComATaxa1 = 0.07 * produto;
    double valorComATaxa2 = 0.12 * produto;
    double valorComATaxa3 = 0.15 * produto;
    double valorComATaxa4 = 0.08 * produto;
    
    double valorFinal1 = produto - valorComATaxa1;
    double valorFinal2 = produto - valorComATaxa1;
    double valorFinal3 = produto - valorComATaxa1;
    double valorFinal4 = produto - valorComATaxa1;

    System.out.println("Agora por favor, insira o Estado de destino do produto no formato de exemplo: MG, SP, RJ, MS, BA...");
    String estado = sc.next();

    if (estado.equals("MG")) {
      System.out.printf("o valor final do produto acrescido do imposto é: $%.2f%n", valorFinal1);
    }
    else if (estado.equals("SP")) {
      System.out.printf("o valor final do produto acrescido do imposto é: $%.2f%n", valorFinal2);
    }
    else if (estado.equals("RJ")) {
      System.out.printf("o valor final do produto acrescido do imposto é: $ %.2f%n", valorFinal3);
    }
    else if (estado.equals("MS")) {
      System.out.printf("o valor final do produto acrescido do imposto é: $ %.2f%n", valorFinal4);
    }
    else {
      System.out.println("Estas não são entradas válidas");
    }
    
    sc.close();
    
  }
} 
