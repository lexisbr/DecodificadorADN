package decodificador;
import java.util.Scanner;

/**
 *
 * @author jalej
 */
public class Decodificador {
   
        
    public static Scanner s = new Scanner(System.in);
    static int contador=0; 
    static StringBuffer respuesta = new StringBuffer();
   
    
    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        String resultadofinal="";
        int contador1=0;
       
        
        System.out.println("Ingrese su primer cadena");
        cadena1 = s.nextLine();
        System.out.println("Ingrese su segunda cadena");
        cadena2 = s.nextLine();
        
        char[] PrimerCadena = cadena1.toCharArray();
        char[] SegundaCadena = cadena2.toCharArray();  
        
        for (int i = 0; i < PrimerCadena.length; i++) {
            for (int j = 0; j < SegundaCadena.length; j++) {
               
                
                if(PrimerCadena[i]==SegundaCadena[j]){
                     
                resultadofinal = Analizador(PrimerCadena,SegundaCadena,i,j).toString();  
             
                    
                }else{
                      if (respuesta.length() > resultadofinal.length()) {
                        resultadofinal = respuesta.toString();
                        }
                        respuesta.delete(0, respuesta.length());
                    
                }
               
            }
        }
       
        
        System.out.println(resultadofinal);
    }
    
    
    public static void limpiar() //Void para limpiar pantalla
    {
        System.out.print("\033[H\033[2J"); //Caracteres por imprimir
        System.out.flush(); //Metodo flush para imprimir los caracteres en pantalla
    }
     public static StringBuffer Analizador(char[] palabra1,char[] palabra2, int i, int j) 
    {
         contador++;
         respuesta = respuesta.append(palabra1[i]);
         if(i<=palabra1.length-1&&j<=palabra2.length-1){
             i++;
             j++;
             if(palabra1[i]==palabra2[j])
                    {
                        System.out.println("="+respuesta);
                        Analizador(palabra1,palabra2,i,j);
                        
                        
                        
                    }
         }
         
          
        
        return respuesta;
    }
}
    

