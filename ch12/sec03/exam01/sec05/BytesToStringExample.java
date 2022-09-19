package ch12.sec05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args)  {
		
		String data = "a자바";
		
		//예외처리 연산식
		try {
			//인코딩(encoding) <문자열_원래값 -> 바이트코드>
			byte[] arr1 = data.getBytes("EUC-KR"); 
			System.out.println(arr1.length); //7 ( 알파벳1+한글6(한글자당3) )
			System.out.println(Arrays.toString(arr1));
			
			//디코딩(decoding) <바이코드 -> 원래값_문자열>
			String data2 = new String(arr1, "EUC-KR");
			System.out.println(data2);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}

}
