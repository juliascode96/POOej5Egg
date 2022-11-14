/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las 
operaciones asociadas a dicha clase son: 
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar 
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la 
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el 
saldo actual en 0. 
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el 
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ServicioCuenta;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuenta {
    Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuenta1(){

        CuentaBancaria cuenta1 = new CuentaBancaria();
        System.out.println("Ingrese su DNI");
        cuenta1.setDNI(leer.nextInt());
        cuenta1.setNumeroCuenta("39.909.120");
        cuenta1.setSaldoActual(0);
        return cuenta1;
    }
    
    public void ingresar(CuentaBancaria cuenta1){
        System.out.println("Ingrese la cantidad de dinero a acreditar en la cuenta: "+cuenta1.getNumeroCuenta());
        int dinero = leer.nextInt();
        dinero += cuenta1.getSaldoActual();
        cuenta1.setSaldoActual(dinero);
        System.out.println("El saldo de su cuenta es de: "+cuenta1.getSaldoActual());
    }
    
    public void retirar(CuentaBancaria cuenta1){
        System.out.println("¿Cuanto dinero desea retirar?");
        int restar = leer.nextInt();
        restar = cuenta1.getSaldoActual()-restar;
        if(restar <0){
        cuenta1.setSaldoActual(0);
        }else{
            cuenta1.setSaldoActual(restar);
        }
            System.out.println("El saldo actual en su cuenta es de: "+cuenta1.getSaldoActual());

    }
    
    public void extraccionRapida(CuentaBancaria cuenta1){
        System.out.println("Ingrese el monto a extraer, solo puede extraer como máximo el 20% de su saldo actual");
        int extraer;
        
        extraer = leer.nextInt();
        
        while( extraer > cuenta1.getSaldoActual()*0.20){
            System.out.println("Usted no puede retirar esa cantidad, ingrese una menor");
            extraer = leer.nextInt();

        }
        
        extraer = cuenta1.getSaldoActual()-extraer;
        cuenta1.setSaldoActual(extraer);
        System.out.println("Su saldo ha quedado en: "+cuenta1.getSaldoActual());  
    }
    
    public void consultarSaldo(CuentaBancaria cuenta1){
        System.out.println("El saldo de su cuenta es de: "+cuenta1.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta1){
        System.out.println("Su número de cuenta es de: "+cuenta1.getNumeroCuenta());
        System.out.println("Su número de DNI asociado a su cuenta es: "+cuenta1.getDNI());
    }
    
}
