package baekjoon.p1764;

// 백준 1764번 듣보잡

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] peoples = br.readLine().split(" ");
        int N = Integer.parseInt(peoples[0]);
        int M = Integer.parseInt(peoples[1]);

        // N + M 만큼 배열 선언 ! 사람 이름이 다 다를 수도 있으니
        String[] people = new String[N+M-1];

        // 사람 배열에 사람이름 추가
        for(int i = 0; i < N + M - 1 ; i ++){
            String peopleName = br.readLine();
            people[i] = peopleName;
        }

        int duplicatePerson = 0;

        for

    }
}
