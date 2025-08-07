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

public class result{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int a[][] = new int[total][total];
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int primaryDiagonalSum=0,secondaryDiagonalSum=0;
        for(int i=0;i<total;i++){
                primaryDiagonalSum += a[i][i];
                secondaryDiagonalSum += a[i][total - 1 - i];
            }
        int absoluteDifference=primaryDiagonalSum-secondaryDiagonalSum;
        System.out.println(Math.abs(absoluteDifference));
    }
}