package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str2 = br.readLine().toUpperCase();
		String[] arr = str2.split("");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//-------------------------
		char[] alp = new char[26];
		alp[0]=65;
		
		for(int i=0;i<alp.length-1;i++) {
			alp[i+1]= (char)(alp[i]+1);
		}
		
		int[] count = new int[alp.length]; //�ߺ� Ƚ�� ī��Ʈ��
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<alp.length;j++) {// char ���ڰ�
				
				if(arr[i].equals(String.valueOf(alp[j]))) {
					count[j]+=1;
				}
			}
		}
		
		for(int i=0;i<alp.length;i++) {
			System.out.print(count[i]);
		}
		
		//�迭�� ���� ���� ���� ���� ���ϱ� - ������ ������ '?'���
		
	}
}
