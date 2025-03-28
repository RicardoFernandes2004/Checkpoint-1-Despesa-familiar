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
        double totalDespesas = (gastoComAgua + gastoComInternet + gastoComLuz + (valorMensalidadeDaAcademia*numeroDeMoradores));
        return totalDespesas;
    }

    public double calcularRendaLiquida(){
        double rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    }

}
