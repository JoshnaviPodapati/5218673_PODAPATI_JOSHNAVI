import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // This is the code i have written in my own logic
         int countPositiveValues=0,countNegativeValues=0,countZeroValues=0;
         int n=arr.size();
         for(int numbers:arr){
            if(numbers>0){
                countPositiveValues++;
            }
            else if(numbers<0){
                countNegativeValues++;
            }
            else{
                countZeroValues++;
            }
         }
           System.out.printf("%.6f\n",(double)countPositiveValues/n);
           System.out.printf("%.6f\n",(double)countNegativeValues/n);
           System.out.printf("%.6f\n",(double)countZeroValues/n);     
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
