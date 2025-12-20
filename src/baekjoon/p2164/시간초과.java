package baekjoon.p2164;

// 카드2 백준 2164 문제
// 배열 선언하고 로직 반복

//배열 방식은 맨 앞 카드를 버리거나 뒤로 보내기 위해 매번 남은 카드 전체를 한 칸씩 이
//동시키는 작업이 필요하고, 이 과정이 카드 개수만큼 반복되면서 연산량이 크게 증가해
//시간 복잡도가 N²이 되어 시간 초과가 발생한다.

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class 시간초과 {
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

