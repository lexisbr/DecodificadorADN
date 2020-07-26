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
   static int inicio = 0, inicio2 = 0;
    
    public static void main(String[] args) {
        String cadena1;
        String cadena2;
        String resultado="";
        
        
        System.out.println("====Decodificador de ADN====");
        System.out.println("Ingrese su primer cadena");
        cadena1 = s.nextLine();
        System.out.println("Ingrese su segunda cadena");
        cadena2 = s.nextLine();
        
        char[] PrimerCadena = cadena1.toCharArray();
        char[] SegundaCadena = cadena2.toCharArray();  
        
       while (inicio2 < PrimerCadena.length) {
            inicio = 0;
        for (int i = inicio2; i < PrimerCadena.length; i++) {
                for (int j = inicio; j < SegundaCadena.length; j++) {

                    if (PrimerCadena[i] == SegundaCadena[j]) {
                       resultado = Analizador(PrimerCadena,SegundaCadena,i,j).toString(); 
                       
                }
            }
        }
           // System.out.println("vuelta");
            inicio2++;
       }
       
        System.out.println(">>>La respuesta es " + resultado+"<<<");
        
    }
    
    
   
    
    public static void comparar(){
         if (respuesta.length() > resultadofinal.length()) {
                resultadofinal = respuesta.toString();
            }
    }
    public static String Analizador(char[] palabra1,char[] palabra2, int i, int j) 
    {
        if(i<palabra1.length&&j<palabra2.length)
            {
               // System.out.println("i=="+i);
               //  System.out.println("j=="+j);
            if (palabra1[i] == palabra2[j]) {
                      //  System.out.println("match =>"+palabra1[i]);
                        respuesta = respuesta.append(palabra1[i]);
                        inicio = j + 1;
                        i++;
                        j++;
                       // System.out.println("inicio2 "+inicio2);
                       // System.out.println("inicio "+inicio);
                        Analizador(palabra1,palabra2,i,j);
                       
                       
                    } else {
                        comparar();
                      //  System.out.println(resultadofinal);
                        respuesta.delete(0, respuesta.length());
                        
                        
                    }
        }
        comparar();
        respuesta.delete(0, respuesta.length());
        return resultadofinal;
    }
}
    

