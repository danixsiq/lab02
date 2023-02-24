package br.newtonpaiva.dominio;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Double sacar(Double valor){
        return 0.0;
    }
    public Double depositar (Double valor){
        return 0.0;
    }
    public Integer getNumero (){
        return numero;
    }
    public void setNumero (Integer numero){
        this.numero= numero;
    }

}
