import java.util.*;
import java.lang.*;
import java.io.*;

public class data_recovery {

    static class Data {
        private String name;
        private int index;


        public Data(final String name, final int index) {
            this.name = name;
            this.index = index;
        }

        public String getName() {
            return name;
        }

        public int getOrderIndex () {
            return index;
        }

        public void setName (String name) {
            this.name = name;
        }

        public void setIndex (int index) {
            this.index = index;
        }
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        String [] a = {"2000", "and", "was", "not", "However",
        "implemented", "1998", "it", "until"};
        int [] order = {9, 8, 3, 4, 1, 5, 7, 2};
        dataRecovery(order, a);
    }

    public static void dataRecovery (int[] order, String[] original)
    {
        List<Data> data_list = new ArrayList<>();
        int i;
        for (i = 0; i < order.length; i++) {
            data_list.add(new Data(original[i], order[i]));
        }

        data_list.add(new Data(original[original.length - 1], check_missing(order)));

        System.out.println("Before Sort based on index \n");
        data_list.forEach(System.out::println);

        System.out.println("After Sort based on index \n");
        Collections.sort(data_list, (data1, data2) -> data1.getOrderIndex() - data2.getOrderIndex());

        data_list.forEach(System.out::println);
    }

    public static int check_missing(int [] order)
    {
        int i, total;

        total = (order.length + 1) * (order.length + 2) / 2;
        for (i = 0; i < order.length; i++ ) {
            total -= order[i];
        }

        return total;
    }
}
