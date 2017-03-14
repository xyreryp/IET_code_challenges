import java.util.*;
import java.lang.*;
import java.io.*;

public class substring_no_rep_chars{
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println("length Of Longest Substring: " + lengthOfLongestSubstring(s));
    }
    
    public static int lengthOfLongestSubstring(String s) {
        int last_index[] = new int[256];
        // init the array
        for(int i = 0; i < 256; i++){
            last_index[i] = -1;
        }

        int max_len = 0, cur_len = 0, start = 0, best_start = 0;
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);

            if (last_index[cur] < start) {
                last_index[cur] = i;
                cur_len ++;

            } else {
                int lastIndex = last_index[cur];
                start = lastIndex + 1;
                cur_len = i - start + 1;
                last_index[cur] = i;
            }

            if(cur_len > max_len) {
                max_len = cur_len;
                best_start = start;
            }
        }
        return max_len;
    }
}
