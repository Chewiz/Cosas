
    
    import java.util.Scanner;
    
    public class BuscaPaabras
    {
        public static void main(String []args){
            //
            char sr =' ';
            Scanner read = new Scanner(System.in);
            String p[]={"Alla","Detras","Burro","Caldo","Error"};
            System.out.println("Intruduzca una letra");
            sr = read.next().charAt(0);
            sr = Character.toLowerCase(sr);
            for(int i = 0; i < p.length; i++){
                if(Character.toLowerCase(p[i].charAt(0))== sr){
                    System.out.println("La palabra es: "+p[i]);
                    i = p.length;
                }else{
                    System.out.println("La palabra no se encuentra");
                    i = p.length;
                }
            }
        }
    }
