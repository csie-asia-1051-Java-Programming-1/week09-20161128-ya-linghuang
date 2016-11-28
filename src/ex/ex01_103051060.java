package ex;
/*
 * Topic: 請設計一樂透亂數選號程式，由 1~42 中選出 6個不重覆的數字組合並輸出。 請使用已下方式,(setSeed就是設定亂數種子，可以使每次跑出的亂數序列，都會是一樣的)
 例如:輸入 23323456會得到 39  17  32  13  41  15 
	Random randnum = new Random();
	randnum.setSeed(23323456)
 * Date: 2016/11/28
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
import java.util.Random;
public class ex01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("請輸入數字: ");
		long x = scn.nextLong();
		rnd.setSeed(x);
		int i = 0;
		int data[]=new int [6];
		while(i<6){
			int con = 0;
			data[i]=rnd.nextInt(42)+1;
			for(int j=0; j<i ; j++){
				if(data[i]!=data[j]){
					con+=0;
				}else{
					con+=1;
				}
			}
			if(con==0){
				System.out.print(data[i]+"\t");
				i+=1;
			}else{
				i+=0;
			}
		}
	}

}
