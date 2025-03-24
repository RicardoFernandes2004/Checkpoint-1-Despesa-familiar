package br.com.fiap.main;
// Ricardo Fernandes de Aquino (RM 554597)
// Kauã Soares Guimarães – (RM559044)

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DespesaFamiliar despesa = new DespesaFamiliar();
        System.out.println("Qual é sua renda familiar?");
        despesa.rendaFamiliar = sc.nextDouble();
        System.out.println("Qual é o número de moradores?");
        despesa.numeroDeMoradores = sc.nextInt();
        System.out.println("Qual é seu gasto com luz?");
        despesa.gastoComLuz = sc.nextDouble();
        System.out.println("Qual é seu gasto com agua?");
        despesa.gastoComAgua = sc.nextDouble();
        System.out.println("Qual é seu gasto com internet?");
        despesa.gastoComInternet = sc.nextDouble();
        System.out.println("Qual é seu gasto com academia?");
        despesa.valorMensalidadeDaAcademia = sc.nextDouble();

        System.out.printf("Sua renda familiar é %.3f \nCom um numero de moradores de %d \nSeu gasto com luz é %.3f \nSeu gasto com agua é %.3f \nSeu gasto com internet é %.3f \nSeu gasto com academia é %.3f \nO total de despesas é %.3f \nA sua renda liquida é %.3f ",despesa.rendaFamiliar, despesa.numeroDeMoradores, despesa.gastoComLuz, despesa.gastoComAgua, despesa.gastoComInternet, (despesa.valorMensalidadeDaAcademia * despesa.numeroDeMoradores), despesa.calcularTotalDeDespesas(), despesa.calcularRendaLiquida());

    }
}
