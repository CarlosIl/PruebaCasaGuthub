/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pruebasonidointerface;

/**
 *
 * @author pp
 */
public interface Sonido {
    void voz();
    default void vozDurmiendo(){
        System.out.println("Zzz");
    }
}
