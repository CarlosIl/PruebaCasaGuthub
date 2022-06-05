
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pp
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AvisarHaciendaException, CuentaException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opc = 0;
        double dinero = 0;
        
        System.out.println("Introduce tu nuevo IBAN: ");
        String iban = sc.nextLine();
        System.out.println("Introduce el nuevo titular: ");
        String titular = sc.nextLine();
        CuentaBancaria cb = new CuentaBancaria(iban, titular);
                
        do{
            System.out.println("");
            System.out.println("\tMenú Cuenta Bancaria");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");
            System.out.print("Introduzca una opción: ");
            opc = sc.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("IBAN: "+cb.getIban()+", Titular: "+cb.getTitular()+", Saldo: "+cb.getSaldo());
                    break;
                case 2:
                    System.out.println("IBAN: "+cb.getIban());
                    break;
                case 3:
                    System.out.println("Titular: "+cb.getTitular());
                    break;
                case 4:
                    System.out.println("Saldo restante: "+cb.getSaldo());
                    break;
                case 5:
                    try{
                        System.out.println("Introduzca la cantidad de dinero que quiere ingresar: ");
                        dinero = sc.nextInt();
                        if(cb.Ingreso(dinero) == true){
                            Movimientos mov1 = new Movimientos("Ingreso",dinero);
                            cb.añadir(mov1);
                        }
                    }catch(AvisarHaciendaException e){
                        System.out.println(e);
                        Movimientos mov1 = new Movimientos("Ingreso",dinero);
                        cb.añadir(mov1);
                    }catch(InputMismatchException ex){
                        System.out.println("Valor introducido incorrecto");
                        ex.printStackTrace();
                    }catch(IllegalArgumentException ax){
                        System.out.println("No puede ingresar números negativos");
                        ax.printStackTrace();
                    }catch(CuentaException u){
                        System.out.println(u);
                        u.printStackTrace();
                    }
                    break;
                case 6:
                    try{
                        System.out.println("Introduzca la cantidad de dinero que quiere retirar: ");
                        dinero = sc.nextInt();                 
                        if(cb.Retirada(dinero) == true){
                            Movimientos mov2 = new Movimientos("Retirada",dinero);
                            cb.añadir(mov2);
                        }
                    }catch(InputMismatchException ex){
                        System.out.println("Valor introducido incorrecto");
                        ex.printStackTrace();
                    }catch(IllegalArgumentException ax){
                        System.out.println("No puede ingresar números negativos");
                        ax.printStackTrace();
                    }catch(CuentaException u){
                        System.out.println(u);
                        u.printStackTrace();
                    }
                    break;
                case 7:
                    cb.Lista_Movimientos();
                    break;
                case 8:
                    break;
            }
        
        }while(opc != 8);
        
    }
    
}
