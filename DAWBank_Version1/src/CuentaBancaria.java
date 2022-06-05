/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pp
 */
public class CuentaBancaria {
    private String iban;
    private String titular;
    private double saldo;
    private String[] historial = new String[100];
    private static int indice_historial = 1;
    
    public CuentaBancaria(String iban, String titular){
        this.iban=iban;
        this.titular=titular;
        this.saldo=0;
    }

    /**
     * @return the iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * @param iban the iban to set
     */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the historial
     */
    public String[] getHistorial() {
        return historial;
    }

    /**
     * @return the indice_historial
     */
    public static int getIndice_historial() {
        return indice_historial;
    }
    
    protected void Ingreso(double dinero){
        if(dinero > 0){
            this.saldo+=dinero;
            if(dinero > 3000){
                System.out.println("AVISO: Notificar a hacienda");
            }
        }else{
            System.out.println("No se puede efectuar esta operación");
        }
        
        this.historial[this.getIndice_historial()]="Ingreso de "+dinero+"€";
        ++this.indice_historial;
    }
    
    protected void Retirada(double dinero){
        if(dinero > 0 && this.saldo > -50){
            this.saldo-=dinero;
            if(this.saldo < 0){
                 System.out.println("AVISO: Saldo negativo");
            }
        }else{
            System.out.println("No se puede efectuar esta operación");
        }
        
        this.historial[this.getIndice_historial()]="Retirada de "+dinero+"€";
        ++this.indice_historial;
    }
    
    protected void Movimientos(){
        System.out.println("\tLista de movimientos");
        for(int i = 1; i < this.getIndice_historial(); i++){
            System.out.println(i+". "+this.historial[i]);
        }
    }
    
}
