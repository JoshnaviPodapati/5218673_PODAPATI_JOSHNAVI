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

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        int arr1[]=new int[value];
        for(int index=0;index<value;index++){
            arr1[index]=sc.nextInt();
        }
        int countPositive = 0;
        int countNegative=0;
        int countZero=0;
        for (int index=0;index<value;index++) {
            if (arr1[index] > 0) {
                countPositive++;
            }
            else if (arr1[index]<0){
                countNegative++;
            }
            else {
                countZero++;
            }
        }
        System.out.println(String.format("%.6f", (double)countPositive / value));
        System.out.println(String.format("%.6f", (double)countNegative / value));
        System.out.println(String.format("%.6f", (double)countZero / value));
    }
}
