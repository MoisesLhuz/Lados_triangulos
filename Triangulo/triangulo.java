package Triangulo;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        //declaração variáveis
        
        double a, b, c;
        
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o Lado A do Triângulo");
        a = teclado.nextDouble();
        System.out.println("Digite o Lado B do Triângulo");
        b = teclado.nextDouble();
        System.out.println("Digite o Lado C do Triângulo");
        c = teclado.nextDouble();
        
        //estrutura de decisão
        if (a == b && a == c) {
            System.out.println("Triângulo Equilátero");
        } else if(((a == b) && (a != c)) || ((a == c) && (a != b))){
            System.out.println("Triângulo Isósceles");
        }else{
            System.out.println("Triângulo Escaleno");
        }
        teclado.close();
    }
}
