/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import java.util.ArrayList;


public class Clase2 {
 
    
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> cuentas =new ArrayList<>();
        
        Cliente cliente1 = new Cliente("Juan","457896452","San pedro sacatepequez");
        Cliente cliente2 = new Cliente ("Jorge","789456125","Ciudad capital");
        System.out.println("el nombre del cliente1 es:"+ cliente1.getNombre());
        System.out.println("el dpi del cliente 1 es: " + cliente1.getDpi());
        System.out.println("la direccion del cliente 1 es :" + cliente1.getDireccion());
        System.out.println("Informacion del cliente :"+"  " + "Nombre:"+"  "+cliente2.getNombre()+ "  " + "DPI:" + "  "+ cliente2.getDpi()+"  "+ "Direccion:" + "  " + cliente2.getDireccion());
        CuentaBancaria cuenta1 = new CuentaBancaria("1578465",50,cliente1.getNombre(),10);
         CuentaBancaria cuenta2 = new CuentaBancaria("1578465",50,cliente2.getNombre(),10);        
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        System.out.println("el cliente de la cuenta 1 es :"+cuenta1.getCliente());
        cliente1.mostrarDatos();
        cuenta1.mostrardatosC();
        
     
       
    }
    
}
