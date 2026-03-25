package Decorator;

public class MediaBimestral implements Avaliacao{
    private double n1;
    private double n2;

    public MediaBimestral(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public Resultado obterResultado() {
        double media = (n1 + n2) /2;
        return new Resultado(n1, n2, media);
    }
}
