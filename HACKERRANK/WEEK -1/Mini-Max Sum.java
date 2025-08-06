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

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];   // here 5 is the fixed size given in problem statement itself
        for (int p = 0; p < 5; p++) {
            arr[p] = sc.nextInt();
        }
        long totalSum = 0;
        for (int p = 0; p < 5; p++) {
            totalSum += arr[p];
        }
        int minVal=arr[0],maxVal=arr[0];
        for(int p=1;p<5;p++){
            if (arr[p]<minVal){
                minVal=arr[p];
            }
            if(arr[p]>maxVal){
                maxVal=arr[p];
            }
        }
        long minimumSum=totalSum-maxVal;
        long maximumSum=totalSum-minVal;
        System.out.println(minimumSum+" "+maximumSum);
    }
}

