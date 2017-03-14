import java.util.*;
import java.lang.*;
import java.io.*;

public static data_recovery {
    public static void main(String[] args) {
        char [] a = {"2000", "and", "was", "not", "However",
        "implemented", "1998", "it", "until"}
        int [] order = {9, 8, 3, 4, 1, 5, 7, 2}
    }

    public static void dataRecovery (int[] order, char[] original)
    {
      Dictionary dict = new Hashtable();

      int total_size = original.length;

      for (int i = 0; i < order.length; i++) {
          dict.put(order[i], original[i]);
      }

      for (i = 1; i < order.length; i++) {
        System.out.println( dict.get(i) + newline);
      }

    }

}
