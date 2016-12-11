package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int count=1;
		int i = 0;
		while(count<=x){
			count=count+i;
			System.out.print(count+" ");
			i++;
		}
		System.out.println();
		i=0;
		while(i<=x){
			for(int j=0 ; j<i ; j++){
				System.out.print(i+" ");
			}
			i++;
		}
	}

}
