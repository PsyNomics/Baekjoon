package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = sc.nextInt();
		int[][] arr = new int[N][];
		
		for(int i=0;i<arr.length;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int Num = Integer.parseInt(st.nextToken());
			arr = new int[i][Num];
			
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
			double avg = sum/arr[i][0];
			System.out.println(avg);
		}
	}
}
