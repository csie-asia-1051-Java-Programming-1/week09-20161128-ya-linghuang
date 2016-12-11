package hw;
/*
 * Topic: 讓使用者輸入一正整數，利用函式呼叫找出一連續整數數列讓該數列的和為此一正整數，有些正整數並不能找出連續整數，若找不到時，請印出「No」。
 例如: 15 =1+2+3+4+5 =4+5+6=7+8
 * Date: 2016/11/28
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
public class hw01_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int X = scn.nextInt();
		Fin(X);
	}
	public static void Fin(int x){
		int check=0;
		for(int i =1 ; i <= x/2 ; i++){
			int num = i;
			for(int j=i+1 ; j<=x/2+1 ; j++){
				num=num+j;
				if(num==x){
					check+=1;
					System.out.print("=");
					for(int k =i ; k<=j ; k++){
						if(k==j){
							System.out.print(k);
						}else{
							System.out.print(k+"+");
						}
					}
				}
			}
		}
		if(check==0){
			System.out.print("No");
		}
	}

}
