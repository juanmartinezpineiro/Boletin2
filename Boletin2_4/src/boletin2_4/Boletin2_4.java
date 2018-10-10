/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

/**
 *
 * @author jmartinezpineiro
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer = new Scanner (System.in);
    int cantidadEntera= 0;
    System.out.println("Introduzca la cantidad entera: ");
    cantidadEntera=leer.nextInt();
    int billetes100=0, billetes20=0,billetes5=0,monedas1=0;
    billetes100= cantidadEntera/100;
    billetes20= cantidadEntera%100/20;
    billetes5= cantidadEntera%100/5;
    monedas1= cantidadEntera%100/1;
    System.out.println(""+billetes100+""+billetes20+""+billetes5+""+monedas1);
    
    
    }
    
}
