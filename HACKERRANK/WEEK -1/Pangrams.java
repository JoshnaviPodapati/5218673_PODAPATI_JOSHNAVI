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
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        Set<Character> values = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c<= 'z') {
                values.add(c);
            }
        }
        if (values.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }
}