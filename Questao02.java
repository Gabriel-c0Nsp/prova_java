import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de números que o programa irá calcular");
    int valoresDigitados = sc.nextInt();
    int i;
    double valor;
    double valorResolvido;
    System.out.println("A partir de agora, os valores digitados serão considerados valores cujo você deseja calcular");

    for (i=1; i <= valoresDigitados; i++) {
      valor = sc.nextDouble();
      valorResolvido = valor;
      valorResolvido = Math.pow(valorResolvido, 2);
      System.out.println("quadrado de " + valor + " é: " + valorResolvido);
      valorResolvido = Math.sqrt(valor);
      System.out.println("raiz de " + valor + " é: " + valorResolvido);
      
    }

    sc.close();
    
  }
}

