import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sum = 0;

        // 숫자가 아닌 문자를 모두 공백으로 대체
        String[] numbers = input.replaceAll("[^0-9]", " ").split(" ");

        // 분리된 숫자들을 순회하며 합산
        for (String num : numbers) {
            if (!num.isEmpty()) {
                sum += Integer.parseInt(num);
            }
        }

        System.out.println(sum);
    }
}