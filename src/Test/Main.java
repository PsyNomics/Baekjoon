package Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {


		String alp = "abcdefghijklmnopqrstuvwxyz";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String word = br.readLine();
		String[] wordArray = word.split("");
		String[] alpArray = alp.split("");
		boolean check;

		for(int j=0;j<alpArray.length;j++) {
			check = false;
			for(int i=0;i<wordArray.length;i++) {
				if(wordArray[i].equals(alpArray[j])) {
					System.out.print(i+" ");
					check=true;
				}
			}
			if(check != true) {
				System.out.print(-1+" ");
			}
		}
	}
	//baekjoon	
}
