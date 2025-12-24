package baekjoon.p21608;

// 백준 21608 상어 초등학교
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 교실의 크기 N * N / 학생의 수 N^2
        int N = Integer.parseInt(br.readLine());
        int classSize = N*N;
        int students = N*N;
        int[][] classroom = new int[N][N];

        // 각 학생마다 좋아하는 학생의 정보를 담은 2차원 배열 선언
        int[][] like = new int[N+1][4];
        // 자리 선점 순서
        int[] sequence = new int[students];
        for(int i=0;i<students;i++){
            st = new StringTokenizer(br.readLine());
            int who = Integer.parseInt(st.nextToken());
            sequence[i] = who;
            like[who][0] = Integer.parseInt(st.nextToken());
            like[who][1] = Integer.parseInt(st.nextToken());
            like[who][2] = Integer.parseInt(st.nextToken());
            like[who][3] = Integer.parseInt(st.nextToken());
        }

        // 자리 선정 규칙
        // 1. 비어있는 칸 중 좋아하는 학생이 인접한 칸에 가장 많은 칸으로 자리 정함
        // 2. 1을 만족하는 칸 N개면, 인접한 칸 중에서 비어있는 칸이 가장 많은 칸으로 자리 정하기
        // 3. 2을 만족하는 칸 N개면, 행의 번호가 가장 작은칸.. 이러한 칸도 N개면 열의 번호가 가장 적은칸
        for (int i=0; i<students; i++){
            // 현재 차례 학생의 번호
            int now = sequence[i];

            // 조건 1
            // 1. 비어있는 칸 중 좋아하는 학생이 인접한 칸에 가장 많은 칸으로 자리 정함
            int[][] condition1 = new int[N][N];
            for (int r=0; r < N;r++){
                for (int c=0; c<N;c++){
                    // 지금 보고있는 자리가 아무도 앉아있지 않을 경우에만
                    if (classroom[r][c] == 0){
                        int nearCount = 0;
                        // 북방향
                        if (r-1 >= 0){
                            for (int l : like[now]){

                            }
                        }
                        // 동방향
                        // 남방향
                        // 서방향
                    }
                }
            }

            // 조건 2 (조건 1 만족하는 자리가 N개일경우)
            // 2. 1을 만족하는 칸 N개면, 인접한 칸 중에서 비어있는 칸이 가장 많은 칸으로 자리 정하기

            // 조건 3 (조건2 만족하는 자리가 N개일경우)
            // 3. 2을 만족하는 칸 N개면, 행의 번호가 가장 작은칸.. 이러한 칸도 N개면 열의 번호가 가장 적은칸

        }
    }
}
