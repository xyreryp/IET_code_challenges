import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class sum_of_integers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] a = {-10, 2, 3, -2, 0, 5, -15};
        System.out.println("The sum of integers is " + maxSubArraySum_brutal(a)));
        System.out.println("The sum of integers is " + maxSubArraySum(a));
	}

    public static int maxSubArraySum_brutal(int a[])
    {
        int size = a.length, maximum = 0;

        for (int i = 0; i < size; i++)
        {
            current = 0;

            for (j = i; j < size; j++)
            {
                current += array[j];
                if (current > maximum) {
                    maximum = current;
                }
            }
        }
    }

    // Kadane's algorithm
	public static int maxSubArraySum(int a[])
	{
		int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
	}
}
