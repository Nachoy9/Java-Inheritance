package Ejercicio4.Entidades;

import Ejercicio4.Interfaz.CalculosFormas;

public class Rectangulo implements CalculosFormas {

    public double lado, altura;

    public Rectangulo() {
    }

    public Rectangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(lado + altura);
    }

    @Override
    public double calcularArea() {
        return lado*altura;
    }

    @Override
    public String toString() {
        return "Rectangulo de lado l = " + lado + " y altura h = " + altura;
    }
}
