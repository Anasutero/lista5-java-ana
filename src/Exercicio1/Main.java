package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        // Declaracao das variaies e chamei ela das outras classes para haver a conexao e poder usar
        double nota1 = EntradaSaida.obterNota(leitura, 1);
        double nota2 = EntradaSaida.obterNota(leitura, 2);

// Input de escolha do meu usuario
        System.out.println("Qual média deseja calcular? (1 para aritmética, 2 para ponderada)");
        int escolhaMedia = leitura.nextInt();

        //verificacaoes
        double media;
        if (escolhaMedia == 1) {
            media = Calculo.calucloMediaAritimetica(nota1, nota2);
        } else {
            double peso1 = EntradaSaida.obterPeso(leitura, 1);
            double peso2 = EntradaSaida.obterPeso(leitura, 2);
            media = Calculo.calcularMeidaPonderada(nota1, nota2, peso1, peso2);
        }

        //resultado que aparecera na tela
        // Resultado
        Resultado.media(media);







    }

}