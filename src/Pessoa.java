// Localização: listas/lista01/Pessoa.java
package listas.lista01;

public class Pessoa {
    private double peso;   // Peso em Kg
    private double altura; // Altura em metros

    // Construtor
    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Getters e Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
