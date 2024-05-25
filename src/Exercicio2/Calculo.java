package Exercicio2;

//CLASSE PARA CALCULAR O SALARIO E OS DESCONTOS
public class Calculo {

    //DECLARACAO DE VARIAVIES
    final Double valorInss = 20.0;
    final Double valorIrpf = 10.0;
    final Double valorPlanoSaude = 5.0;

    double salario;
    double horasExtras;


    // CONSTRUTOR
    public Calculo(double salarioBruto, double horasExtras) {
        this.salario = salarioBruto;
        this.horasExtras = horasExtras;
    }

    //CALCULOS PARA VER OS DESCONTOS
    public double descontarINSS(){
        return (this.salario*(valorInss/100));
    }


    public double descontarIrfp(){
        return (this.salario*(valorIrpf/100));
    }

    public double descontarPlanoSaude(){
        return  (this.salario*(valorPlanoSaude/100));
    }

    public double acrecentarHorasExtras(){
        double horaNormal = this.salario/160;
        double totalHoraExtra = this.horasExtras*(horaNormal*(50.0/100));

        return (this.salario + totalHoraExtra);
    }
    //OBTER O SALARIO LIQUIDO
    public double obterSalarioLiquido( double descontoInss, double descontoIrfp,
                                       double descontoPlano, double valorHorasExtras){

        return (this.salario - descontoInss - descontoIrfp - descontoPlano) + valorHorasExtras;
    }





}
