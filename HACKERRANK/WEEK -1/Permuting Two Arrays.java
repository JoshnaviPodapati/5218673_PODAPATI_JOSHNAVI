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
public class Result{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        String[] results = new String[q];
        int value=0;
        for(int p=0;p<q;p++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            boolean valid = true;
            for (int i = 0; i < n; i++) {
                if (a[i] + b[n - 1 - i] < k) {
                    valid = false;
                    break;
                }
            } 
            if (valid) {
                results[value++] = "YES";
            } 
            else {
                results[value++] = "NO";
        }
        }
        for (String res : results) {
            System.out.println(res);
        }
    }
}
