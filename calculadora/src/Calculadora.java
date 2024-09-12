import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);  

        System.out.print("Digite o primeiro número: ");
        int numero1 = SC.nextInt(); 
        System.out.print("Digite o segundo número: ");
        int numero2 = SC.nextInt();  

        System.out.println("Digite 1 para somar ou 2 para subtrair: ");
        int operacao = SC.nextInt();

        if (operacao == 1) {
            int resultado = numero1 + numero2;
            System.out.println("Resultado: " + resultado);
        } else if (operacao == 2) {
            int resultado = numero1 - numero2;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Operação inválida!");
        }

        SC.close();  // Fechando o Scanner
    }
}
