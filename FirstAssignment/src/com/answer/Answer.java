package com.answer;
import java.util.Scanner;

public class Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//동전의 종류, 가치의 합
        int N = sc.nextInt(), K = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        int cnt = 0;
        for (int i = N - 1; i >= 0 && K > 0; i--) {
            cnt += K / A[i];
            K = K % A[i];
        }
        System.out.println(cnt);
    }
}
