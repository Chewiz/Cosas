
/*
 *@Chwiz 
 * El programa realiza la validacion de una contraseña en un maximo de 3 intentos
 */

import java.util.Scanner;

public class Contrasena
{
    public static void main(String []args){
        
        Scanner leer = new Scanner(System.in);
        String contra="contra", contra1;
        int ban =0;
        boolean a = false;
        System.out.println("________________________________________");
        System.out.println("||USTED CUENTA SOLAMENTE DE 3 INTENTOS||");
        System.out.println("________________________________________");
        for(int i = 0; i < 3; i++){
            
            if(i == 2){
                System.out.println("ULTIMA OPORTUNIDAD");
            }
            
            System.out.println("Introduzca usu contraseña ( "+(i+1)+" )");
            contra1 = leer.nextLine();
            
            
                if(contra.length() == contra1.length()){
                    while(ban < contra.length()){ 
                       if(contra.charAt(ban)!=contra1.charAt(ban)){
                          a =false;
                        }else{
                          a = true;
                        }
                       ban++; 
                   }
                   ban=0;
                }else{
                    a = false;
                }
                
                //System.out.println("\n"+contra1+"\n");
                
                if(a == true){
                    i = 3;
                    System.out.println("Correcto");
                    
                }else{
                    System.out.println("INCORRECTO");
                }
                
         }

    }
}
