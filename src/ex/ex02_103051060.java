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
		System.out.println("學號: ");
		String Id = scn.next();
		System.out.println("姓名: ");
		String Name = scn.next();
		std.add(new Student(Id,Name));
		System.out.println("Next(Y/N): ");
		char check = scn.next().charAt(0);
		if(check=='Y'||check=='y'){
			continue;
		}else{break;}
		}
		for(int i = 0 ; i < std.size() ; i++){
			System.out.println("第"+(i+1)+"位\n"+"國文成績: ");
			int Ch = scn.nextInt();
			System.out.println("英文成績: ");
			int En = scn.nextInt();
			System.out.println("數學成績: ");
			int Ma = scn.nextInt();
			std.get(i).addgrades(Ch);
			std.get(i).addgrades(En);
			std.get(i).addgrades(Ma);
		}
		Student space;												//交換
		for(int i = 0 ; i <std.size(); i++){
			for(int j = 0 ; j < std.size(); j++){
				if(std.get(j).Avg()<std.get(i).Avg()){
					space = std.get(i); 								//暫存 i 的東西
					std.set(i, std.get(j));							//i 這格變成 j		(index,elements)
					std.set(j, space);									//j 這格變成 i
				}
			}
		}
		for(int i = 0 ; i < std.size(); i++){
			System.out.print(std.get(i).getid()+"\t"+std.get(i).getname()+"\t");std.get(i).getallscore();
			System.out.println(+std.get(i).Avg());
		}
		}
	}


class Student{
	private String id,name;
	private ArrayList <Grades> grd = new ArrayList <Grades>();
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
	public void getallscore(){
		for(int i = 0 ; i < grd.size(); i++){
			System.out.print(grd.get(i).getscore()+"\t");
		}
	}
	public void addgrades(int score){	
		grd.add(new Grades(score));
	}
	public float Avg(){
		float total = 0;
		for(int i = 0 ; i<grd.size(); i++){
			total=total+grd.get(i).getscore();
		}
		total=total/grd.size();
		return total;
	}
}
class Grades{
	private int Score;
	public Grades(int Score1){
		Score=Score1;
	}
	public int getscore(){
		return Score;
	}
}