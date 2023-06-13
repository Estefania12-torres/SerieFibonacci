import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Iterator;
public class Serie { //Se usa un almacén de valores para la serie
   
    private Map<Integer, Long> valorList;
    public Serie() {
        this.valorList = new HashMap<>();
    }
    
    public long getFibonacci(int position) { //Permite el calculo del valor de Fibonacci para una posición dada
        if (position == 0 || position == 1) {
            return 1;
        } else { //Al verficarse en el ciclo almacena el valor para la posición dada en valorList
            if (valorList.containsKey(position)) {
                return valorList.get(position);
            }
            // Si el valor no está en "valorList", se calcula el número de "Fibonacci" para la posición dada utilizando 
           
            long resultado = getFibonacci(position - 1) + getFibonacci(position - 2);
            valorList.put(position, resultado);
            return resultado;
            }

        }

    public void calcularFibonacciConScanner() { 
            Scanner scanner = new Scanner(System.in); //Crea una instancia de la clase 

            System.out.print("Ingrese la posición de Fibonacci: ");
            int posicion = scanner.nextInt();

            long fibonacci = getFibonacci(posicion);
            System.out.println("El valor de Fibonacci en la posición " + posicion + " es: " + fibonacci);

            scanner.close();
        }

        public Map<Integer, Long> getValorList() {
            return valorList;
        }

        public void setValorList(Map<Integer, Long> valorList) {
            this.valorList = valorList;
        }

        @Override
        public String toString() {
            return "Serie{valorList=" + valorList + '}';
        }
    }



