package Exercicio1;
import java.util.Scanner;

//classe para entrada e saida de inputs
//dificuldade neesa classe o melhor seria no main
public class EntradaSaida {
    public static double obterNota(Scanner leitura ,int numero) {
        double nota;

        do {
            System.out.printf("Insira a nota " + numero + ":");
            nota = leitura.nextDouble();
        } while (!Validacao.validarNota(nota));
        return nota;
    }
    public static double obterPeso(Scanner leitura, int numero) {
        System.out.println("Digite o peso para a nota " + numero + ":");
        return leitura.nextDouble();
    }
}
