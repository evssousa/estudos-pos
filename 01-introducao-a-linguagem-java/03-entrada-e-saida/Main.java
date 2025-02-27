// Para mostrar as entradas
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // SAÍDA DE DADOS, EM JAVA, PODE-SE USAR:
        // System.out.println(); -> tem quebra de linha
        // System.out.print(); -> não pula a linha
        // System.out.printf(); -> 

        // EXEMPLOS: 
        System.out.print("Olá mundo!");
        System.out.printf("Olá mundo mais uma vez!");
        System.out.println("Olá mundo!");

        // A ENTRADA DEVE SER FEITA UTILIZANDO A BIBLIOTECA util.Scanner
        // Criar um objeto Scanner
        // Scanner entrada = new Scanner(System.in);
        // Receber a entrada do usuário
        // in numero = input.nextInt();

        
        System.out.print("Informe seu nome: ");
        
        String palavra;
        Scanner entrada = new Scanner(System.in);
        palavra = entrada.next();

        System.out.println("Palavra: " + palavra);
    }
}