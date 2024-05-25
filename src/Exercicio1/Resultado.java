package Exercicio1;
// classe usada para verificar a aprovacao
public class Resultado {
    public static void media(double media){
        System.out.printf("Media:" +media);
        if(media>=7){
            System.out.println("\nAPROVADO!");
        }else{
            System.out.println("\nREPROVADO");
        }
}
}

