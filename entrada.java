/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pood2.clase2;
import java.util.Scanner;
/**
 *
 * @author ALUMNO#
 */
public class entrada {
    Scanner sc = new Scanner(System.in);
     public int num1;
    public int num2;
    
    public entrada(){
        this.num1=num1;
        this.num2=num2;     
    }
    
    public void indatos(){
    System.out.println("ingrese el primer numero: ");
    num1 = sc.nextInt(); 
    System.out.println("ingrese el segund0 numero: ");
    num2 = sc.nextInt(); 
    }
    public int getnum1(){
        return(num1);
    }
    public int getnum2(){
        return(num2);
}
}
