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
package guia7ejercicio5;

import Entidad.CuentaBancaria;
import ServicioCuenta.ServicioCuenta;
import java.util.Scanner;

public class Guia7Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCuenta srCuenta = new ServicioCuenta();
        CuentaBancaria c1 = srCuenta.crearCuenta1();

        int opcion = 0;
        do {
            System.out.println("¿Qué desea hacer con su cuenta?");
        System.out.println("1: Ingresar monto");
        System.out.println("2: Retirar monto");
        System.out.println("3: Extracción rápida");
        System.out.println("4: Consultar Saldo");
        System.out.println("5: Consultar Datos");
        System.out.println("6: Salir");
        opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    srCuenta.ingresar(c1);
                    break;
                case 2:
                    srCuenta.retirar(c1);
                    break;
                case 3:
                    srCuenta.extraccionRapida(c1);
                    break;
                case 4:
                    srCuenta.consultarSaldo(c1);
                    break;
                case 5:
                    srCuenta.consultarDatos(c1);
                    break;
                case 6:
                    break;
                default:
                    break;
            }
        } while (opcion != 6);
        System.out.println("¡Muchas gracias por usar nuestro sistema!");

    }

}
