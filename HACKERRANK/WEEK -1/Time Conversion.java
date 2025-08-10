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
class Result{
    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) { 
        int hourValue = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        boolean isPM = (s.charAt(8) == 'P');

        if (isPM && hourValue != 12) {
            hourValue += 12;
        } else if (!isPM && hourValue == 12) {
            hourValue = 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%02d", hourValue));
        for (int i = 2; i < 8; i++) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
