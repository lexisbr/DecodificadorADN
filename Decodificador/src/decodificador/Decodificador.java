package decodificador;
import java.util.Scanner;

/**
 *
 * @author jalej
 */
public class Decodificador {
   
        
    public static Scanner s = new Scanner(System.in);
    static int contador=0; 
   static StringBuffer resultadotemp = new StringBuffer();
   public static String resultadofinal = "";
   static int inicio = 0, inicio2 = 0;
   public static String cadena1="";
   public static String cadena2="";
   
  
    
    public static void main(String[] args) {
        DecodifcadorForm ventana =new DecodifcadorForm();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
       
        
    }
    
    
    public static void coincidencias(){
       String resultado="";
       resultadofinal = "";
       inicio = 0;
       inicio2 = 0;
       System.out.println("====Decodificador de ADN====");
       /*
        System.out.println("Ingrese su primer cadena");
        cadena1 = s.nextLine();
        System.out.println("Ingrese su segunda cadena");
        cadena2 = s.nextLine();*/
        
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
         if (resultadotemp.length() > resultadofinal.length()) {
                resultadofinal = resultadotemp.toString();
                System.out.println(resultadofinal);
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
                        resultadotemp = resultadotemp.append(palabra1[i]);
                        inicio = j + 1;
                        i++;
                        j++;
                       // System.out.println("inicio2 "+inicio2);
                       // System.out.println("inicio "+inicio);
                        Analizador(palabra1,palabra2,i,j);
                       
                       
                    } else {
                        comparar();
                      //  System.out.println(resultadofinal);
                        resultadotemp.delete(0, resultadotemp.length());
                        
                        
                    }
        }
        comparar();
        resultadotemp.delete(0, resultadotemp.length());
        return resultadofinal;
    }
}
    

