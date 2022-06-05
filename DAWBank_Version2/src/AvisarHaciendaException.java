/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pp
 */
public class AvisarHaciendaException extends Exception{
    private String iban;
    private String titular;
    
    public AvisarHaciendaException(String iban, String titular){
        this.iban=iban;
        this.titular=titular;
    }
    
    public String toString(){
        return "AVISO: Notificar a hacienda de que el titular "+this.titular+" con IBAN "+this.iban+" a realizado un ingreso de más de 3000€";
    }
}
