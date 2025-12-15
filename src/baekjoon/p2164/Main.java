package baekjoon.p2164;

// 카드2 백준 2164 문제
// 배열 선언하고 로직 반복
// 시간 초과..
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String problem = br.readLine();
        int n = Integer.parseInt(problem);

        // N장의 카드 배열 생성 + 1~n 채우기
        int[] numberCard = new int[n];
        for (int i = 0 ; i < n; i++){
            numberCard[i] = i + 1;
        }

        int size = n;
        // 카드가 1장 남을 때까지 반복
        while ( size  > 1 ){
            // 맨 앞 카드 버리기
            for (int i = 0;i < size - 1; i++){
                numberCard[i] = numberCard[i+1];
            }
            size--;
            // 다음 맨 앞 카드 뒤로
            int temp = numberCard[0];

            for (int i = 0 ; i < size - 1; i++){
                numberCard[i] = numberCard[i+1];
            }
            numberCard[size - 1] = temp;
        }

        System.out.println(numberCard[0]);

    }
}
