/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pood2.clase2;

/**
 *
 * @author ALUMNO#
 */
public class Clase2 {

    public static void main(String[] args) {
        
       entrada en = new entrada();
       en.indatos();
       int num1 = en.getnum1();
       int num2 = en.getnum2();
       
       operacion op = new operacion();
       
       int resultado = op.suma(num1, num2);
       System.out.println("el resultado de la suma es: " + resultado );
    }
}
