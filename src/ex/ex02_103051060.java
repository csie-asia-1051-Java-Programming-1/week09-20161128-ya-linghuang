package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 103051060 黃雅鈴
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ex02_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Student> std = new ArrayList<Student>();
		while(true){
		System.out.print("學號: ");
		String Id = scn.nextLine();
		System.out.print("姓名: ");
		String Name = scn.nextLine();
		System.out.print("國文成績: ");
		int Ch = scn.nextInt();
		System.out.print("英文成績: ");
		int En = scn.nextInt();
		System.out.print("數學成績: ");
		int Ma = scn.nextInt();
		int Avg = (Ch+En+Ma)/3;
		std.add(new Student(Name,Id,Ch,En,Ma,Avg));
		System.out.println("Next(Y/N): ");
		char check = scn.next().charAt(0);
		if(check=='Y'||check=='y'){
			continue;
		}else{break;}
		}
	}

}
class Student{
	private String id,name;
	private int ch,en,ma,avg;
	public Student (String id1,String name1,int ch1,int en1,int ma1,int avg1){
		id=id1;
		name=name1;
		ch=ch1;
		en=en1;
		ma=ma1;
		
	}
	public void Info(){
		
	}
}