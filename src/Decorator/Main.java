package Decorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Avaliacao boletim = new MediaBimestral(5.0, 4.0);

        boletim = new CalculadoraRecuperacao(boletim, 8, 80);

        Resultado resultadoFinal = boletim.obterResultado();

        System.out.println(resultadoFinal.getMedia());

    }
}