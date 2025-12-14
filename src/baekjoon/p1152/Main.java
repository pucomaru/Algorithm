package baekjoon.p1152;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().trim();
        // 단어를 구분하기 위한 변수
        int meetChar = 0;
        // 단어 카운트 변수
        int wordCount = 0;

        for (int i=0; i < sentence.length(); i++){
            // 공백만나면 meetChar 초기화
            // 다시 단어를 만날 수 있는 가능성을 알림
            if (sentence.charAt(i) == ' '){
                meetChar = 0;
            }
            if (meetChar == 0 && sentence.charAt(i) != ' '){
                meetChar = 1;
                wordCount ++;
            }
        }

        System.out.println(wordCount);
    }
}
