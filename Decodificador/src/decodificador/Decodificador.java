package decodificador;
import java.util.Scanner;

/**
 *
 * @author jalej
 */
public class Decodificador {
   
        
    public static Scanner s = new Scanner(System.in);
    static int contador=0; 
    
    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        String resultado[];
        int contador1=0;
        
        System.out.println("Ingrese su primer cadena");
        cadena1 = s.nextLine();
        System.out.println("Ingrese su segunda cadena");
        cadena2 = s.nextLine();
        
        char[] PrimerCadena = cadena1.toCharArray();
        char[] SegundaCadena = cadena2.toCharArray();  
        
        for (int i = 0; i < PrimerCadena.length; i++) {
            for (int j = 0; j < SegundaCadena.length; j++) {
                System.out.println("1- "+PrimerCadena[i]);
                System.out.println("2- "+SegundaCadena[j]);
                System.out.println("==================");
                if(PrimerCadena[i]==SegundaCadena[j]){
                    System.out.println("i: "+i);
                    System.out.println("j: "+j);
                    if(i<PrimerCadena.length-1&&j<SegundaCadena.length-1)
                    {
                       contador1 = Analizador(PrimerCadena,SegundaCadena,i+1,j+1);  
                    }
                    
                }
               
            }
        }
        resultado = new String [contador1];
        
        System.out.println(contador1);
    }
    
    
    public static void limpiar() //Void para limpiar pantalla
    {
        System.out.print("\033[H\033[2J"); //Caracteres por imprimir
        System.out.flush(); //Metodo flush para imprimir los caracteres en pantalla
    }
     public static int Analizador(char[] palabra1,char[] palabra2, int i, int j) //Void para limpiar pantalla
    {
         System.out.println(palabra1+"/////"+palabra2);
        
         if(palabra1[i]==palabra2[j])
                    {
                        if(i<palabra1.length-1&&j<palabra2.length-1)
                        {
                        Analizador(palabra1,palabra2,i+1,j+1);
                        }
                        contador++;
                    }
          

        return contador;
    }
}
    

