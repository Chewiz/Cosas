

import java.util.Scanner;
public class NumOpten
{
    //
    public static void main(String[]args){
        //
        Scanner read = new Scanner(System.in);
        int po=0, cont =0;
        
        String nu="";
        String num="";
        System.out.print("Ingrese un numero: ");
        nu = read.nextLine();
        char array[]= nu.toCharArray();
        
        System.out.print("Posicion del numero deseado: ");
        po = read.nextInt();
        int po1 = array.length-po;

        for(int i =0; i<=po1; i++){
            if(i == 0){
                num+=array[po-1];
            }else{
                num+="0";
            }
            
        }
        System.out.println("El numero es: ");
        System.out.println(num);
    }
}
