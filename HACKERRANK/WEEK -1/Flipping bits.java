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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int queries = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < queries; i++) {
            long inputs = sc.nextLong();
            long flippedBits = ~inputs & 0xFFFFFFFFL;
            result.append(flippedBits).append("\n");
        }
        System.out.println(result.toString());
    }
}
    
