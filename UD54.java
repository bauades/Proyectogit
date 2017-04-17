// Construye y codifica la clase Programa, la cual constará de un método Principal,
// el cual se encargará de preguntar al usuario por 10 valores numéricos enteros,
// que guardará en una tabla unidimensional. Tras ello se mostrará la tabla y a
// continuación desplazaremos cada elemento una posición a la derecha, de tal forma 
// que el primer elemento pase a ser el segundo, el que era el segundo pase a ser el
// tercero y así sucesivamente. El último elemento pasa a ser el primero.
package ud5.pkg4;

/**
 * 01/02/2017
 * Cristina
 */
public class UD54 
{
    public static void main(String[] args)
    {
        // le asignamos a la variable tamaño la longitud
        int tamaño=10;
        //construimos la tabla 
        int [] Valores = new int [tamaño];
        int i;
        int z;// variable que utilizaremos para guardar la ultima posición
        
        try
        {
            //pedimos los datos al usuario
            for (i = 0;i<tamaño; i++)
            {
                System.out.println("Introduzca el valor : ");
                // metemos en valores los datos que teclee el usuario
                Valores[i]= Teclado.entero();     
                
                
            }
                for(i=0;i<tamaño;i++)
                {
                    System.out.print(Valores[i]+" ");
                }
                
                // introducimos dos lineas en blanco
                System.out.println();
                System.out.println();
                
                // a continuación guardamos la ultima posicion en una variable
                // para posteriormente poder recorrer el array con los nuevos valores
                 z = Valores[tamaño-1];
                 
                 //desde la posicion uno hasta el final cambiamos los valores
                 for(i=1;i<tamaño-1;i++)
                 {                  
                     Valores[i]=Valores[i+1];                  
                 }
                  Valores[0]=z;
               
                  for(i=0;i<tamaño-1;i++)
                {
                    System.out.print(Valores[i]+" ");
                }
                
        }
        catch(Exception error)
        {
            System.out.println(error.getMessage());
        }
        
    }
    
}
