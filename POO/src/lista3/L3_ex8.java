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
public class L3_ex8 {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
        int n1, n2, soma=0;
        
        System.out.print("N1: ");
        n1 = entrada.nextInt();
        System.out.print("N2: ");
        n2 = entrada.nextInt();
        
        System.out.print("Soma dos números entre "+n1+" e "+n2+": ");
        for (int i=n1+1; i<n2; i++)
            soma = soma+i;
        
        System.out.println(soma);
        entrada.close();
    }
    
}
