/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cola;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author pp
 */
public class Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> p = new PriorityQueue<String>();
        p.add("Akash");
        p.add("Aditya");
    
         for(String s : p)
            System.out.println(s);
         System.out.println("First element: " + p.peek());
    }
    
}
