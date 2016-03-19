
import java.util.InputMismatchException;
import java.util.Scanner;
//
abstract class Car{
	String name;
	int rent;
	int person;
	Double weight;
	public abstract void print();
	}
class Zaihuo extends Car{
	public Zaihuo(String name,int rent,Double weight) {
		this.weight=weight;
		this.name=name;
		this.rent=rent;
	}
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+weight+"吨。");
	}
}
class Zairen extends Car{
	public Zairen(String name,int rent,int person) {
		this.person=person;
		this.name=name;
		this.rent=rent;
	}
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+person+"人。");
	}
}
class Pika extends Car{
	public Pika(String name,int rent,int person,Double weight) {
		this.weight=weight;
		this.person=person;
		this.name=name;
		this.rent=rent;
	}
	public void print() {
		System.out.println("您选择了车型为"+name+"，租一天的价格为："+rent+"元，容量为："+person+"人，"+weight+"吨。");
	}
}
public class demo_synthesize2 {

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
			System.out.println("您是否要租车：1是 0否");
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
					System.out.println("输入错误");
					continue;
				}
				int money=0;
				money=choose(a, b, c);
				System.out.println("如果还需要其他类型的汽车，请按下“1”键！");
				System.out.println("如果不再需要其他类型的汽车，请按下“0”键！");
				
				//判断是否还需要租其他类型的汽车
				while((int) s.nextInt()!=0) {
					money+=choose(s.nextInt(), s.nextInt(), s.nextInt());
					System.out.println("如果还需要其他类型的汽车，请按下“1”键！");
					System.out.println("如果不再需要其他类型的汽车，请按下“0”键！");
				}
				System.out.println("您租车所需总价格为："+money);
				
			}else {
				continue;
			}
		}
	}
	//选车
	public static int choose(int a,int b,int c) {
		Zairen small1=new Zairen("奥迪A4",500,4);
		Zairen small2=new Zairen("马自达6",400,4);
		Pika pika =new Pika("皮卡雪6",450,4,2d);
		Zairen big=new Zairen("金龙",800,20);
		Zaihuo light=new Zaihuo("松花江",400,4d);
		Zaihuo heavy=new Zaihuo("依维柯",1000,20d);
		Car car=new Car() {
			public void print() {
			}
		};
		switch (a) {
		case 1:
			car=small1;//输入车型序号为1，则选择的是1号车
			small1.print();
			break;
		case 2:
			car=small2;//输入车型序号为2，则选择的是2号车
			small2.print();
			break;
		case 3:
			car=pika;//输入车型序号为3，则选择的是3号车
			pika.print();
			break;
		case 4:
			car=big;//输入车型序号为4，则选择的是4号车
			big.print();
			break;
		case 5:
			car=light;//输入车型序号为5，则选择的是5号车
			light.print();
			break;
		case 6:
			car=heavy;//输入车型序号为6，则选择的是6号车
			heavy.print();
			break;
		default:
			break;
		}
		int money=a*b*c;//计算租每一种类型所需要的钱
		System.out.println("您选择了"+b+"辆"+a+"号车，租用"+c+"天,这将消费"+money+"元");
		a=car.rent;
		return money;
	}
}
