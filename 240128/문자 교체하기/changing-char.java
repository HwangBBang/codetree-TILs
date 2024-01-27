import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] ss = s.split(" ");
        StringBuilder s1 = new StringBuilder(ss[1]);
        String res1 = ss[0].substring(0, 2);

        StringBuilder res2 = s1.replace(0, 2, res1);

        System.out.println(res2);
    }
}