package Decorator;

public class CalculadoraRecuperacao implements Avaliacao{
    private Avaliacao avaliacaoRec;
    private double notaRecuperacao;
    private double frequencia;

    public CalculadoraRecuperacao(Avaliacao avaliacaoRec, double notaRecuperacao, double frequencia) {
        this.avaliacaoRec = avaliacaoRec;
        this.notaRecuperacao = notaRecuperacao;
        this.frequencia = frequencia;
    }


    @Override
    public Resultado obterResultado() {
        Resultado res = avaliacaoRec.obterResultado();

        if (frequencia >= 75 && res.getMedia() >= 4.0 && res.getMedia() < 6.0)  {
            double maiorNota = Math.max(res.getN1(), res.getN2());
            double novaMedia = (maiorNota + notaRecuperacao) /2;

            return new Resultado(maiorNota, notaRecuperacao, novaMedia);
        }
        return res;
    }
}
