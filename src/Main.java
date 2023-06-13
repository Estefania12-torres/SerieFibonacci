// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Implementacion de las importaciones 
import java.util.Map;
import java.util.Scanner;

//Creación de la clase Main
public class Main {

    public static void main(String[] args) {
        
        Serie serie = new Serie(); //Está linea de codigo se encarga de crear una instancia de la clase Serie a la variable serie
                                   //Es decir, crea un objeto de la clase Serie y lo asigna a la varible serie
                                   //para accerder a los atributos y método
        
        
        // Se declara la variable posicion con valor de int y que se inicialice con valor de 50
        int posicion = 50;
        long fibonacci = serie.getFibonacci(posicion); //este codigo obtiene el valor de Fibonacci en la posicion 50
                
    }
}
