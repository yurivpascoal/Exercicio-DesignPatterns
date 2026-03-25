public class Resultado {
    private final double n1;
    private final double n2;
    private final double media;

    public Resultado(double n1, double n2, double media) {
        this.n1 = n1;
        this.n2 = n2;
        this.media = media;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getMedia() {
        return media;
    }
}
