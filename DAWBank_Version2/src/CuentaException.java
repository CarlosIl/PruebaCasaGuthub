/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pp
 */
public class CuentaException extends Exception{
    private String error;
    
    public CuentaException(String error){
        this.error=error;
    }
    
    public String toString(){
        return this.error;
    }
    
}
