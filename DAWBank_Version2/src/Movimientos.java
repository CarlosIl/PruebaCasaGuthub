/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pp
 */
public class Movimientos {
    private double dinero;
    private String tipo;
    
    public Movimientos(String tipo, double dinero){
        this.tipo=tipo;
        this.dinero=dinero;
    }

    /**
     * @return the dinero
     */
    public double getDinero() {
        return dinero;
    }

    /**
     * @param dinero the dinero to set
     */
    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
