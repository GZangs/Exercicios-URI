/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri1151;

import java.util.Scanner;

public class Uri1151 {
    public static void run() {
        Fibonacci fibonacci = new Fibonacci();
        
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        if(numero < 46 && numero > 0){
            fibonacci.gerarFibonacci(numero);
        }else{
            System.out.println("Número inválido (deve ser menor que 46)");
        }
    }
}
