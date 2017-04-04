
package identificadorderedes;

import java.util.Scanner;

/**
 *
 * @author Irdevelo
 */
public class IdentificadorDeRedes {

    
    
    
    public static void main(String[] args) {    
        
         String ip, aux;
        int num = 0;
        int[] arregloEnteros = new int[5];
        boolean bandera=true;
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la red que desea identificar ");
        ip = s.nextLine();
        
        String[] particionIp = ip.split("\\.");
        
       for(int i=0; i<particionIp.length;i++){
           
           arregloEnteros[i] = Integer.parseInt(particionIp[i]);
         
       }
       
       if(particionIp.length>4){
           System.out.println("La IP es incorrecta favor de revisar");
       }else{
       
        
        for(int i = 0; i<arregloEnteros.length;i++){
        
        if(arregloEnteros[i]>255){
        
            bandera = false;
        
        }
        }
       
        if(bandera==false){
            System.out.println("La IP es incorrecta debido a que no puede sobrepasar el valor 255");
            
        }else{
        
        if(arregloEnteros[0]<128){
            System.out.println("La clase es A");
            System.out.println("La dirección de Red es: " + arregloEnteros[0]+ ".0" + ".0" + ".0");
            System.out.println("La dirección de Broadcast es: " + arregloEnteros[0]+ ".255" + ".255" + ".255");
            System.out.println("La máscara de Red es: " + "255" + ".0" + ".0" + ".0");
        }  
            
        
        if(arregloEnteros[0]>127 && arregloEnteros[0]<192){
            System.out.println("La clase es B");
            System.out.println("La dirección de Red es: " + arregloEnteros[0]+ "." + arregloEnteros[1] + ".0" + ".0");
            System.out.println("La dirección de Broadcast es: " + arregloEnteros[0]+ "." + arregloEnteros[1] + ".255" + ".255");
            System.out.println("La máscara de Red es: " + "255" + ".255" + ".0" + ".0");
        }  
            
        if(arregloEnteros[0]>191){
            System.out.println("La clase es C");
            System.out.println("La dirección de Red es: " + arregloEnteros[0]+ "." + arregloEnteros[1] + "." + arregloEnteros[2] + ".0");
            System.out.println("La dirección de Broadcast es: " + arregloEnteros[0]+"." + arregloEnteros[1] + "." + arregloEnteros[2] + ".255");
            System.out.println("La máscara de Red es: " + "255" + ".255" + ".255" + ".0");
        }  
            
            
            
        
        }
        
        
        
        
        
       }
       
       
       
       
       
       }
      
       
       
    }







/*
     String colores = "rojo.amarillo.verde.azul.morado.marrón";
String[] arrayColores = colores.split("\\.");
 
// En este momento tenemos un array en el que cada elemento es un color.
for (int i = 0; i < arrayColores.length; i++) {
	System.out.println(arrayColores[0]);
}

*/