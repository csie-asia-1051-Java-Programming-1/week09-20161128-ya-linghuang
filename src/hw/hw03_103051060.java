package hw;
/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 103051060 黃雅鈴
 */
import java.util.Scanner;
import java.util.ArrayList;
public class hw03_103051060 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Student> std = new ArrayList<Student>();
		while(true){
		System.out.print("學號: ");
		String Id = scn.next();
		System.out.print("姓名: ");
		String Name = scn.next();
		std.add(new Student(Id,Name));
		System.out.print("Next(Y/N): ");
		char check = scn.next().charAt(0);
		if(check=='Y'||check=='y'){
			continue;
		}else{break;}
		}
		for(int i = 0 ; i < std.size() ; i++){
			int j=1;
			while(true){
			System.out.print("第"+(i+1)+"位\n"+"第"+j+"課程名稱: ");
			String CName = scn.next();
			System.out.print("課程代號: ");
			String CId = scn.next();
			System.out.print("課程分數: ");
			int Cgrade = scn.nextInt();
			System.out.print("授謀老師: ");
			String CTeacher = scn.next();
			System.out.print("學分數: ");
			int CCredit = scn.nextInt();
			std.get(i).addcourse(CName,CId,CTeacher,Cgrade,CCredit);
			System.out.print("Next(Y/N): ");
			char check = scn.next().charAt(0);
			if(check=='Y'||check=='y'){
				j++;
				continue;
			}else{break;}
			}
		}
		Student space;
		for(int i = 0 ; i <std.size(); i++){
			for(int j = 0 ; j < std.size(); j++){
				if(std.get(j).Avg()<std.get(i).Avg()){
					space = std.get(i);
					std.set(i, std.get(j));
					std.set(j, space);
				}
			}
		}
		for(int i = 0 ; i < std.size(); i++){
			System.out.println(std.get(i).getid()+"\t"+std.get(i).getname()+"\t"+std.get(i).Avg());
		}
	}

}
class Student{
	private String id,name;
	private ArrayList <Course> cur = new ArrayList <Course>();
	public Student (String id1, String name1){
		id=id1;
		name=name1;
	}
	public String getid(){
		return id;
	}
	public String getname(){
		return name;
	}
	public void addcourse(String Cname2,String Cid2,String Cteacher2, int Cgrade2, int Ccredit2){	
		cur.add(new Course(Cname2,Cid2,Cteacher2,Cgrade2,Ccredit2));
	}
	public float Avg(){
		float avg=0;
		for(int i = 0; i<cur.size(); i++){
			avg=avg+cur.get(i).getgrade();
		}
		avg=avg/cur.size();
		return avg;
	}
}
class Course{
	private String Cname,Cid,Cteacher;
	private int Cgrade,Ccredit;
	public Course(String Cname1,String Cid1,String Cteacher1, int Cgrade1, int Ccredit1){
		Cname=Cname1;
		Cid=Cid1;
		Cteacher=Cteacher1;
		Cgrade=Cgrade1;
		Ccredit=Ccredit1;
	}
	public float getgrade(){
		return Cgrade;
	}
}
