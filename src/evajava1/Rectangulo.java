/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evajava1;
import java.util.Scanner;//PASO 1
/**
 *
 * @author LC22
 */
public class Rectangulo 
{
 public static void main(String[] args) 
 {
   float area, base, altura;// PASO 2
   Scanner sc=new Scanner(System.in);//PASO 3
   //PASO 4
   System.out.println("Ingrese la base del rectangulo");
    base =sc.nextFloat();//Leo y guardo los datos de entrada
    
    System.out.println("Ingrese la altura del rectangulo");
        altura =sc.nextFloat(); 
        //PASO 5
        area=base*altura;
        System.out.println(" El area del rectangulo es: "+area+" mts2"); 
 }
    
}
