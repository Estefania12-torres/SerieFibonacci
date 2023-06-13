
import java.util.*;

public class Serie {
    //"private Map<Integer, Long> valorList;:" Esta línea declara un campo de clase llamado valorList que es un mapa (HashMap) que se utilizará para almacenar los valores calculados de la serie.
    private Map<Integer, Long> valorList;


    public Serie() {
        this.valorList = new HashMap<>();
    }
    //La declaración "public long getFibonacci(int posicion)" define un método público llamado "getFibonacci" que acepta un parámetro de tipo "int" llamado "posicion".
    public long getFibonacci(int position) {
        //"if (posicion == 0 || posicion == 1):" Esta condición verifica si la posición proporcionada es 0 o 1. Si es así, se trata de los casos base de la secuencia 
        //de Fibonacci, donde el valor es siempre 1. En este caso, se devuelve 1.
        if (position == 0 || position == 1) {
            return 1;
        } else {
            //"if (valorList.containsKey(posicion)):" Verifica si ya se ha calculado y almacena el valor para la posición dada en valorList. valorList es un 
            //mapa donde se almacenan los resultados previamente calculados.
            if (valorList.containsKey(position)) {
                return valorList.get(position);
            }
            long resultado = getFibonacci(position - 1) + getFibonacci(position - 2);
            valorList.put(position, resultado);
            return resultado;
            }

        }

    public Map<Integer, Long> getValorList() {
        return valorList;
    }

    public void setValorList(Map<Integer,Long>valorList){
        this.valorList=valorList;
    }
    private void printValorList() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Integer, Long> entry : valorList.entrySet()) {
            if (builder.length() > 0) {
                builder.append(" , ");
            }
            builder.append(entry.getValue());
        }
        System.out.println(builder.toString());
    }

    public String toString() {
        return "Serie: " + valorList.toString();
    }

}



