package com.jk.temp.main;

import java.util.InputMismatchException;
import java.util.Scanner;
//
class Car{
	String name;
	int rent;
	String capacity;
	public void print(){
		
	}
}
class One extends Car{
	@Override
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+capacity);
	
	}
}
class Two extends Car{
	@Override
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+capacity);
	
	}
}
class Three extends Car{
	@Override
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+capacity);
	
	}
}
class Four extends Car{
	@Override
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+capacity);
	
	}
}
class Five extends Car{
	@Override
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+capacity);
	
	}
}
class Six extends Car{
	@Override
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+capacity);
	}
}
public class demo_synthesize {

	public static void main(String[] args) {
		Object introduce[][]={
				{"序号","汽车名称","租金","容量"},
				{"1","奥迪A4",500,"载人：4人"},
				{"2","马自达6",400,"载人：4人"},
				{"3","皮卡雪6",450,"载人：4人，载货：2吨"},
				{"4","金龙",800,"载人：20人"},
				{"5","松花江",400,"载人：4吨"},
				{"6","依维柯",1000,"载人：20吨"}
				};
		
		while (true) {
			System.out.println("您是否要租车：1-是 ，其他-否");
			Scanner s=new Scanner(System.in);
			//判断用户是否需要租车
			if ((int)s.nextInt()==1) {
				//遍历输出所有汽车的车型、租金和载量
				for (int i = 0; i < introduce.length; i++) {
					for (int j = 0; j < introduce[i].length; j++) {
						System.out.print(introduce[i][j]+"\t");
					}
				System.out.print("\n");
				}
				System.out.println("你好，请输入您要租汽车的车型序号（1~6）、数量（1~10）和租的天数（1~30）：");
				System.out.println("三个数字之间用空格隔开！");
				int a = 0;
				int b = 0;
				int c = 0;
				
				try {//捕获异常：如果输入的三个数字格式不对，则提示“输入错误”，并且重头开始租车程序
					a = s.nextInt();
					b = s.nextInt();
					c = s.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("输入格式错误，重新开始！");
					continue;
				}finally {
					System.out.println("输入正确！");
				}
				
				int money=0;
				money=choose(a, b, c);
				System.out.println("如果还需要其他类型的汽车，请按下除“0”外的任意键！");
				System.out.println("如果不再需要其他类型的汽车，请按下“0”键！");
				
				//判断是否还需要租其他类型的汽车
				while((int) s.nextInt()!=0) {
					money+=choose(s.nextInt(), s.nextInt(), s.nextInt());
					System.out.println("如果还需要其他类型的汽车，请按下除“0”外的任意键！");
					System.out.println("如果不再需要其他类型的汽车，请按下“0”键！");
				}
				System.out.println("您租车所需总价格为："+money);
				
			}else {
				continue;
			}
		}
	}
	public static void write(Car car,String name,int rent,String capacity) {
		car.name=name;
		car.rent=rent;
		car.capacity =capacity;
	}
	//选车
	public static int choose(int a,int b,int c) {
		One c1=new One();
		write(c1, "奥迪A4",500,"载人：4人");
		Two c2=new Two();
		write(c2, "马自达6",400,"载人：4人");
		Three c3=new Three();
		write(c3, "皮卡雪6",450,"载人：4人，载货：2吨");
		Car c4=new Four();
		write(c4, "金龙",800,"载人：20人");
		Car c5=new Five();
		write(c5, "松花江",400,"载人：4吨");
		Car c6=new Six();
		write(c6, "依维柯",1000,"载人：20吨");
		Car car=new Car();
		switch (a) {
		case 1:
			car=c1;//输入车型序号为1，则选择的是1号车
			c1.print();
			break;
		case 2:
			car=c2;//输入车型序号为2，则选择的是2号车
			c2.print();
			break;
		case 3:
			car=c3;//输入车型序号为3，则选择的是3号车
			c3.print();
			break;
		case 4:
			car=c4;//输入车型序号为4，则选择的是4号车
			c4.print();
			break;
		case 5:
			car=c5;//输入车型序号为5，则选择的是5号车
			c5.print();
			break;
		case 6:
			car=c6;//输入车型序号为6，则选择的是6号车
			c6.print();
			break;
		default:
			break;
		}
		System.out.println("您选择了b"+"辆"+a+"号车，租用"+c+"天");
		a=car.rent;
		return a*b*c;//计算租每一种类型所需要的钱
	}
}
