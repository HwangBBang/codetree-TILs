import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.replace(2, 3, "a");
        stringBuilder.replace(s.length()-2, s.length()-1, "a");

        System.out.println(stringBuilder);
    }

}