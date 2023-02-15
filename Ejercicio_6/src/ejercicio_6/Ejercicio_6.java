/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import Servicios.serviciosProducto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu=0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String,Float> productos = new HashMap<>();
        serviciosProducto sP = new serviciosProducto();
        
        do{
            System.out.println("..:: MENU ::..");
            System.out.println("1. Registrar Producto.");
            System.out.println("2. Modificar Precio");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Mostrar Productos");
            System.out.println("5. Salir");
            System.out.print("Elija Opción: ");
            menu=leer.nextInt();
            switch (menu) {
                case 1 -> sP.crearProducto(productos);
                case 2 -> sP.modificarPrecio(productos);
                case 3 -> sP.eliminarProducto(productos);  
                case 4 -> System.out.println(productos);
                case 5 -> System.out.println("Gracias....");
                default -> System.out.println("Opcion no Existen, intente nuevamente.");
            }
            
            
        }while(menu<5 && menu>0);
    }
    
}
