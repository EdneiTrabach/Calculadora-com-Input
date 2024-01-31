import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner primeiroValor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double primeiroNumero = primeiroValor.nextDouble();

        Scanner segundoValor = new Scanner(System.in);
        System.out.print("Digite o segundo valor: ");
        double segundoNumero = segundoValor.nextDouble();

        double resultado = primeiroNumero + segundoNumero;
        System.out.println("O total é: " + resultado);

        /***
         * PROJETO 1 COM SCANNER
        Scanner primeiroValor = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int primeiroNumero = primeiroValor.nextInt();

        Scanner segundoValor = new Scanner(System.in);
        System.out.print("Digite o segundo valor: ");
        int segundoNumero = segundoValor.nextInt();

        int resultado = primeiroNumero + segundoNumero;
        System.out.println("O total é: " + resultado);
        ***/

        /***
         * UTILIZANDO O SCANNER
        Scanner idadeScanner = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        byte idadeCliente = idadeScanner.nextByte();
        System.out.println("Sua idade é: " + idadeCliente);
        ***/

        /***
         * CRIANDO VARIAVEIS
         byte minhaIdade = 2024-1997;
         String firstName = "Ednei";
         int salarioMensal = 50000;
         long idadeMilisegundos = 78888400000000L;
         double altura = 1.72;
         char initialNome = 'E';
         boolean eMaiorDeIdade = true;
         ***/
    }
}


/***
 " "
 ''
 \n     pular linha
 \t     tab

 byte
 short
 int
 long
 char
 float
 double
 boolean

***/
