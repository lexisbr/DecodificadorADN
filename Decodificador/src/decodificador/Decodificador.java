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
   static String resultadofinal = "";

    
    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        
        int inicio = 0, inicio2 = 0;
        
        System.out.println("====Decodificador de ADN====");
        System.out.println("Ingrese su primer cadena");
        cadena1 = s.nextLine();
        System.out.println("Ingrese su segunda cadena");
        cadena2 = s.nextLine();
        
        char[] PrimerCadena = cadena1.toCharArray();
        char[] SegundaCadena = cadena2.toCharArray();  
        
        while (inicio2 < PrimerCadena.length) {
            inicio = 0;
           respuesta.delete(0, respuesta.length());
            for (int i = inicio2; i < PrimerCadena.length; i++) {
                for (int j = inicio; j < SegundaCadena.length; j++) {
                    System.out.println("="+inicio);
                    if (PrimerCadena[i] == SegundaCadena[j]) {
                        System.out.println("match");
                        respuesta = respuesta.append(PrimerCadena[i]);
                        inicio = j + 1;
                        break;
                    } else {

                        comparar();
                        System.out.println(resultadofinal);
                        respuesta.delete(0, respuesta.length());
                        
                        
                    }
                }
            }
            System.out.println("vuelta");
            inicio2++;
            comparar();
       }
        System.out.println("La respuesta es " + resultadofinal);
       
        
       
    }
    
    
    public static void limpiar() //Void para limpiar pantalla
    {
        System.out.print("\033[H\033[2J"); //Caracteres por imprimir
        System.out.flush(); //Metodo flush para imprimir los caracteres en pantalla
    }
    
    public static void comparar(){
         if (respuesta.length() > resultadofinal.length()) {
                resultadofinal = respuesta.toString();
            }
    }
     
}
    

