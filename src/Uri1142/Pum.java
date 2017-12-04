/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1142;

import java.util.Scanner;

public class Pum {
        public void gerarSequencia(int numero){
        int cont = 0;
            for(int j = 1; j <= (numero * 4); j++){
                System.out.print(j+" ");
                cont++;
                if(cont == 3){
                    j++;
                    System.out.println("PUM ");
                    cont = 0;
                }
            }
        }
}
