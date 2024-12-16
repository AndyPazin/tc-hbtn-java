public class Quadrado  extends Retangulo{
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado < 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
        largura = lado;
        altura = lado;
    }

    @Override
    public String toString() {
        return "[Quadrado] " + lado;
    }
}
