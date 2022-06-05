
import java.util.ArrayList;

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
    private ArrayList<Movimientos> historial;
    private static int indice_historial = 1;
    
    public CuentaBancaria(String iban, String titular){
        this.iban=iban;
        this.titular=titular;
        this.saldo=0;
        historial=new ArrayList<Movimientos>();
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

    /**
     * @return the indice_historial
     */
    public static int getIndice_historial() {
        return indice_historial;
    }
    
    public void añadir(Movimientos mov){
        historial.add(mov);
    }
    
    protected boolean Ingreso (double dinero) throws AvisarHaciendaException,CuentaException{
        boolean resultado = true;
        if(dinero > 0){
            this.saldo+=dinero;
            if(dinero > 3000){
                throw new AvisarHaciendaException(this.iban,this.titular);
            }
        }else{
            System.out.println("No se puede efectuar esta operación");
            resultado = false;
        }
        return resultado;
    }
    
    protected boolean Retirada(double dinero) throws CuentaException{
        boolean resultado = true;
        if(dinero > 0 && this.saldo > -50){
            this.saldo-=dinero;
            if(this.saldo < 0){
                throw new CuentaException("AVISO: Saldo negativo");
            }
        }else{
            System.out.println("No se puede efectuar esta operación");
            resultado = false;
        }
        return resultado;
    }
    
    protected void Lista_Movimientos(){
        System.out.println("\tLista de movimientos");
        for(int i = 0; i < historial.size(); i++){
            Movimientos mov = historial.get(i);
            System.out.println((i+1)+". "+mov.getTipo()+" de "+mov.getDinero()+"€");
        }
    }
    
}
