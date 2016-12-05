package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class ex03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數: ");
		int x = scn.nextInt();
		int count = 0;
		for(int i = 1 ; i <= x ; i++){
			if(x%i==0){
				System.out.print(i+"\t");
				count+=1;
			}
		}
		if(count>2||x==1){								//除了自己跟1還有別的因數就非質數
			System.out.println("非質數");
		}else{
			System.out.println("質數");
		}
	}

}
