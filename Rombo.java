public class Rombo {
    int diagonalMayor;
    int diagonalMenor;

    public Rombo(int diagonalMayor, int diagonalMenor) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    public double calcularPerimetro() {
        double lado = Math.sqrt(Math.pow(diagonalMayor / 2.0, 2) + Math.pow(diagonalMenor / 2.0, 2));
        return 4 * lado;
    }
}
