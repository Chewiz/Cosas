
/**
 * @chewiz
 * El programa determina si un numero es positivo, negativo o igual a cero
 */
import java.util.Scanner;
public class PositivoNetivo
{
    public static void main(String []args){
        //System.out.println("Hola");
        Scanner i = new Scanner(System.in);
        double num;
        
        
        System.out.println("Introduzca un numero");
        num =i.nextDouble();
        
        if(num  > 0){
            System.out.println("El numero es positivo");
        }else if(num < 0){
            System.out.println("El numero es negativo");
        }else if(num ==0){
            System.out.println("El numero es CERO");        
        }
    }
}
