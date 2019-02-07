/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Fecha2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia;
        int dia1 = 0;
        String hora;
        int hora1;
        String minuto;
        int minutodia;
        int minutofin;
        
        String[] parts;
        String part1;
        String part2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = sc.nextLine().toUpperCase();
        switch(dia){
            case "LUNES":
                dia1 = 0;
                break;
            case "MARTES":
                dia1 = 1;
                break;
            case "MIERCOLES":
                dia1 = 2;
                break;
            case "JUEVES":
                dia1 = 3;
                break;
            case "VIERNES":
                dia1 = 4;
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("Fin de semana");
                break;
            default: 
                System.out.println("Error");
                break;
        }
        do{
        System.out.println("Introduce la hora: ");
        hora = sc.nextLine();
        
        parts = hora.split(":");
        part1 = parts[0];
        part2 = parts[1];
            
        hora1 = Integer.parseInt(part1);
        minutodia = Integer.parseInt(part2);
        }while(hora1 > 23 || hora1 < 0 || minutodia > 23 || minutodia < 0);
        
        hora1 = hora1*60;
        minutofin = (6660 -((dia1*24*60) + (hora1 + minutodia)));
        if (minutofin < 0){
            System.out.println("Ya es fin de semana");
        }else
            System.out.println("Faltan " +minutofin+ " minutos para el fin de semana");
        
    }
    
}