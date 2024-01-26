import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = s.length()-1; i >= s.length()-n;i--) {
            System.out.print(s.substring(i-1, i));
        }
    }
}