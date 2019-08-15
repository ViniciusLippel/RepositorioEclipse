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
public class L3_ex10 {
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
        int base, exp, result=1;
        
        System.out.print("Base: ");
        base = entrada.nextInt();
        System.out.print("Expoente: ");
        exp = entrada.nextInt();
        
        if(exp<0)
            System.out.println("Expoente não deve ser negativo");
        else{
            for (int i=0; i<=exp; i++)
                if(i==1)
                    result = base;
                else if (result>1)
                    result = result*base;
        
            System.out.println("Resultado: "+result);
        }
        
        entrada.close();
    }
}
