package Ejercicio2.Entidades;

public final class Lavadora extends Electrodomestico{

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precio, double peso, String color, String consumoEnergetico, double carga) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return  "Carga: " + carga +
                ", Precio: $ " + precio +
                ", Peso: " + peso +
                ", Color: " + color +
                ", Consumo Energetico: " + consumoEnergetico;
    }
}
