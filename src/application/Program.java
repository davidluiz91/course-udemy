package application;

import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        /**
        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
         válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
        possui a maior área.
        A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
        seguinte (fórmula de Heron):
         **/


        Locale.setDefault(Locale.ENGLISH);
        Scanner scan = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do primeiro triangulo: " );
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Entre com as medidas do segundo triangulo: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("Area do primeiro triangulo: " + areaX);
        System.out.println("Area do segundo triangulo: " + areaY);

        if (areaX > areaY){
            System.out.println("Triangulo um é maior");
        }else if( areaY > areaX) {
            System.out.println("Triangulo dois é maior");
        }else {
            System.out.println("As areas são iguais");
        }

    }
}
