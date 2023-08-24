/*
tienen estructura de matrices filas y columnas
 */
package mis_apuntes;

/**
 *
 * @author 507
 */
public class ArrayMultidmensional {
    public static void main(String[] args) {
        
        int [][]numeros = {{5,2,4},{5,8,3},{2,4,7}};
        System.out.println("El tamano de la matriz es: "+numeros.length);
        
    //para poder acceder  a las pocisiones indicamos la posicion
    //en i y la posicion en j que es el array interno
    //recordar qu la matriz la podemos definir como un arrary de arrays
    
        System.out.println("Posicion 0,2 es: "+numeros[0][2]);
        System.out.println("Posicion 2,1 es: "+numeros[2][1]);
        
        //para rtecorrer la matrices se usa un for anidado: con el externo  recorremos i y con el interno reccorrremos j
        
        for(int i=0;i<numeros.length;i++){
            for(int j=0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j] +"\t");
                
                             }
            System.out.println();
        }
    
}
    
}