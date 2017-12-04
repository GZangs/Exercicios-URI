import java.util.Arrays;
import java.util.Scanner;

public class DefinirTriangulo {

    public String verifica(double a, double b , double c){
       double[] numeros = {a, b,c}; 
       for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < i; j++) {
                if (numeros[i] > numeros[j]) {
                    double aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        String texto = "";
        if(numeros[0] >= (numeros[1]+numeros[2])){
            texto+="NAO FORMA UM TRIANGULO";
        }else{
            if((numeros[0]*numeros[0]) == ( (numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                texto+="TRIANGULO RETANGULO";   
            }
            if((numeros[0]*numeros[0]) > (( numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                texto+="TRIANGULO OBTUSANGULO";   
            }
            if((numeros[0]*numeros[0]) < (( numeros[1]*numeros[1])+(numeros[2]*numeros[2]))){
                texto+="TRIANGULO ACUTANGULO";   
            }
            if((numeros[0] == numeros[1])&&(numeros[0] == numeros[2]) && (numeros[1] == numeros[2])){
                texto+="TRIANGULO EQUILATERO";  
            }else{
                if((numeros[0] == numeros[1]) || (numeros[0] == numeros[2]) || (numeros[1] == numeros[2])){
                    texto+="TRIANGULO ISOSCELES";
                }
            }
        }
        return texto;
       
    }
        
}
    
