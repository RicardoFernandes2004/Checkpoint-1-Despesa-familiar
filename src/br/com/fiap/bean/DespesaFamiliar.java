package br.com.fiap.bean;
// Ricardo Fernandes de Aquino (RM 554597)
// Gustavo Jun Irizawa Ikeda (RM 554718)
// Ana Clara Melo de Sousa (RM 559021)
// Kauã Soares Guimarães – (RM559044)
// Yasmin Bezerra Sobral – (RM558757)

public class DespesaFamiliar {
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    public double calcularTotalDeDespesas(){
        return (gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia*numeroDeMoradores));
    }

    public double calcularRendaLiquida(){
        return rendaFamiliar - calcularTotalDeDespesas();
    }

}
