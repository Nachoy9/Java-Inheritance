/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada CalculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */

package Ejercicio4.Principal;

import Ejercicio4.Entidades.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese el radio del circulo (en cm):");
        circulo.setRadio(input.nextDouble());

        System.out.println("Ingrese el lado del rectangulo (en cm):");
        rectangulo.setLado(input.nextDouble());

        System.out.println("Ingrese la altura del rectangulo (en cm):");
        rectangulo.setAltura(input.nextDouble());

        System.out.println("El perimetro del " + circulo.toString() + " es " + circulo.calcularPerimetro() + " cm");
        System.out.println("El perimetro del " + rectangulo.toString() + " es " + rectangulo.calcularPerimetro() + " cm");

        System.out.println("El area del " + circulo.toString() + " es " + circulo.calcularArea() + " cm2");
        System.out.println("El area del " + rectangulo.toString() + " es " + rectangulo.calcularArea() + " cm2");

    }

}
