
import java.util.*;

public class Serie {

    private Map<Integer, Long> valorList;


    public Serie() {
        this.valorList = new HashMap<>();
    }

    public long getFibonacci(int position) {
        if (position == 0 || position == 1) {
            return 1;
        } else {
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



