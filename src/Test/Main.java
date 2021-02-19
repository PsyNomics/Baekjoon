package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int Num;
		Num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<Num;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int count = Integer.parseInt(st.nextToken());
			
			
			String alp = st.nextToken();
			StringTokenizer st2 = new StringTokenizer(alp);
			String[] word = new String[st2.countTokens()];
			int j = 0;
			//배열 만들기
			
			while(st2.hasMoreTokens()) {
				word[j] = st2.nextToken();
				
				for(int k=0;k<count;k++) {
					System.out.print(word[j]);
				}
				j++;
			}
			System.out.println();
		}
	}
}
