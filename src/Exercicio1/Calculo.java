package Exercicio1;

//Esa classe foi usada para fazer as contas das notas
public class Calculo {

        public static double calucloMediaAritimetica(double nota1 , double nota2){
            return(nota1 + nota2)/2;
        }

        public  static double calcularMeidaPonderada(double nota1 , double nota2, double peso1, double peso2){
            return(nota1 * peso1 + nota2 * peso2)/(peso1 + peso2);
        }



    }
