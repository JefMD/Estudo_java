

import java.util.Scanner;



public class Exercicio {

    public static void main( String[] args){

        int num1, num2, resultado;

        Scanner n = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num1 = n.nextInt();
        System.out.println("Digite um segundo numero: ");
        num2 = n.nextInt();
        resultado = num1 + num2;

        System.out.println( "A soma de " +num1+ " e " +num2+ " é igual a "+resultado);

        if (resultado < 0) {
            System.out.println("O numero é negativo");
            
        }
        else{
            System.out.println("O numero é positivo");
        }

        n.close();

        System.out.println("tudo numa boa");



        //testanto branch


    }
    
}
