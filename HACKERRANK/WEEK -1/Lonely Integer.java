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
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int s = 0; s < n; s++) {
            arr[s] = sc.nextInt();
        }
        int uniqueElement=0;
        for(int s=0;s<arr.length;s++){
            uniqueElement^=arr[s];
        }
        System.out.println(uniqueElement);
    }
}

  