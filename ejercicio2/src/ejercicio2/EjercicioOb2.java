/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author Milzork
 */
public class EjercicioOb2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        String dia;
        int minTotales;
        String hora;
        int minutosdia=0;
        int minSemana=(24*60*4) + (15*60);
        
        System.out.print("Introduce el dia: ");
        dia=sc.next();
        //booleano para que el dia se determine como correcto o incorrecto, con un bucle do while para que te pregunte otra vez.
        boolean diaincorrecto=false;
        do
        {
            
        switch(dia)
        {
            case "Lunes":minutosdia=0;
                break;
            case "Martes":minutosdia=24*60;
                break;
            case "Miercoles":minutosdia=24*60*2;
                break;
            case "Jueves":minutosdia=24*60*3;
                break;
            case "Viernes":minutosdia=24*60*4;
                break;
                
            default: System.out.println("Introduce un dia valido");
                dia=sc.next();
                diaincorrecto=true;
                break;
        }
        }
        while(diaincorrecto==true);
         
        System.out.println("Introduce la hora: ");
        hora=sc.next();
        
        //Array para guardar los caracteres de la hora. Sergio esto ha sido complejo estoy:triste. Te pondria un meme pero no puedo insertar imagenes.
       int horaMin[]=new int[5];
       char horita[] = hora.toCharArray();
       horaMin[0] = Character.getNumericValue(horita[0]);
       horaMin[1] = Character.getNumericValue(horita[1]);
       horaMin[3] = Character.getNumericValue(horita[3]);
       horaMin[4] = Character.getNumericValue(horita[4]);
       
       int minDia = (horaMin[0]*10 + horaMin[1])*60+(horaMin[3]*10+horaMin[4]);
      // System.out.println(minDia);
       
       //Control de error para saber cuando es o no es fin de semana y el calculo necesario para ello. Ayuda sergio estoy sufriendo. :c
       minTotales=minDia+minutosdia;
       if(minTotales<0 || minTotales>minSemana)
       {
           System.out.println("Ya es fin de semana");
           System.exit(0);
       }
        int zanahoria=minSemana-minTotales;
        
        System.out.println("Faltan "+zanahoria+" minutos para el fin de semana");
    }
    
}
