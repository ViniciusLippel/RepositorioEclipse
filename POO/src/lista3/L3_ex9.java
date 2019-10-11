/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author vinicius.lippel
 */
public class L3_ex9 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        int t;
        
        System.out.println("Número: ");
        t = entrada.nextInt();
        
        System.out.println();
        
        if (t>0 && t<=10){
            System.out.println("Tabuáda de: "+t);
            for (int i=1; i<=10; i++){
                System.out.println(t+" x "+i+" = "+(t*i));
            }
        }
        
        entrada.close();
    }
}
