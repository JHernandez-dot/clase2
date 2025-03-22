/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase2;


public class CuentaBancaria  {
    private String numeroCuenta;
    private double saldo;
    private String cliente;
    private double deposito;

    public CuentaBancaria(String numeroCuenta, double saldo, String cliente, double deposito) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
        this.deposito = deposito;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        if (deposito>=0){
           this.saldo =  this.saldo + this.deposito;
       }else{
                  System.out.println("la cantidad de deposito debe ser positiva");
                   }
        this.deposito = deposito;
        
    }
    public void mostrardatosC ( ){
    System.out.println("la cuenta es:"+ getNumeroCuenta()+ "el saldo es:"+ getSaldo()+ "cliente:" + getCliente()+ "deposito " +getDeposito());
    }
    
   
    
}
