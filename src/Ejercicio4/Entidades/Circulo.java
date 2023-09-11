package Ejercicio4.Entidades;

import Ejercicio4.Interfaz.CalculosFormas;

public class Circulo implements CalculosFormas {

    public double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*pi*radio;
    }

    @Override
    public double calcularArea() {
        return Math.pow(radio,2)*pi;
    }

    @Override
    public String toString() {
        return "Circulo de radio r = " + radio;
    }
}

