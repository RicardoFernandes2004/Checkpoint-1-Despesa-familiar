package br.com.fiap.bean;
// Ricardo Fernandes de Aquino (RM 554597)
// Kauã Soares Guimarães – (RM559044)

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
