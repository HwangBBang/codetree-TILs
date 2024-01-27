import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(count(s,"ee")+" "+count(s,"eb"));
        
    }

    public static int count(String s, String str) {
        return (s.length() - s.replace("ee", "").length())/2;

    }
}