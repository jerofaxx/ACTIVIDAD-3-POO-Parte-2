public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;

    public Trapecio(int baseMayor, int baseMenor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularArea() {
        return (baseMayor + baseMenor) * altura / 2.0;
    }

    public double calcularPerimetro() {
        double lado1 = Math.sqrt(Math.pow(baseMayor - baseMenor, 2) + Math.pow(altura, 2));
        return baseMayor + baseMenor + 2 * lado1;
    }
}
