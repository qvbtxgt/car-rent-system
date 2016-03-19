
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
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+weight+"�֡�");
	}
}
class Zairen extends Car{
	public Zairen(String name,int rent,int person) {
		this.person=person;
		this.name=name;
		this.rent=rent;
	}
	public void print() {
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+person+"�ˡ�");
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
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+person+"�ˣ�"+weight+"�֡�");
	}
}
public class demo_synthesize2 {

	public static void main(String[] args) {
		Object introduce[][]={
				{"���","��������","���","����"},
				{"1","�µ�A4",500,"���ˣ�4��"},
				{"2","���Դ�6",400,"���ˣ�4��"},
				{"3","Ƥ��ѩ6",450,"���ˣ�4�ˣ��ػ���2��"},
				{"4","����",800,"���ˣ�20��"},
				{"5","�ɻ���",400,"���ˣ�4��"},
				{"6","��ά��",1000,"���ˣ�20��"}
				};
		
		while (true) {
			System.out.println("���Ƿ�Ҫ�⳵��1�� 0��");
			Scanner s=new Scanner(System.in);
			//�ж��û��Ƿ���Ҫ�⳵
			if ((int)s.nextInt()==1) {
				//����������������ĳ��͡���������
				for (int i = 0; i < introduce.length; i++) {
					for (int j = 0; j < introduce[i].length; j++) {
						System.out.print(introduce[i][j]+"\t");
					}
				System.out.print("\n");
				}
				System.out.println("��ã���������Ҫ�������ĳ�����ţ�1~6����������1~10�������������1~30����");
				System.out.println("��������֮���ÿո������");
				int a = 0;
				int b = 0;
				int c = 0;
				try {//�����쳣�����������������ָ�ʽ���ԣ�����ʾ��������󡱣�������ͷ��ʼ�⳵����
					a = s.nextInt();
					b = s.nextInt();
					c = s.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("�������");
					continue;
				}
				int money=0;
				money=choose(a, b, c);
				System.out.println("�������Ҫ�������͵��������밴�¡�1������");
				System.out.println("���������Ҫ�������͵��������밴�¡�0������");
				
				//�ж��Ƿ���Ҫ���������͵�����
				while((int) s.nextInt()!=0) {
					money+=choose(s.nextInt(), s.nextInt(), s.nextInt());
					System.out.println("�������Ҫ�������͵��������밴�¡�1������");
					System.out.println("���������Ҫ�������͵��������밴�¡�0������");
				}
				System.out.println("���⳵�����ܼ۸�Ϊ��"+money);
				
			}else {
				continue;
			}
		}
	}
	//ѡ��
	public static int choose(int a,int b,int c) {
		Zairen small1=new Zairen("�µ�A4",500,4);
		Zairen small2=new Zairen("���Դ�6",400,4);
		Pika pika =new Pika("Ƥ��ѩ6",450,4,2d);
		Zairen big=new Zairen("����",800,20);
		Zaihuo light=new Zaihuo("�ɻ���",400,4d);
		Zaihuo heavy=new Zaihuo("��ά��",1000,20d);
		Car car=new Car() {
			public void print() {
			}
		};
		switch (a) {
		case 1:
			car=small1;//���복�����Ϊ1����ѡ�����1�ų�
			small1.print();
			break;
		case 2:
			car=small2;//���복�����Ϊ2����ѡ�����2�ų�
			small2.print();
			break;
		case 3:
			car=pika;//���복�����Ϊ3����ѡ�����3�ų�
			pika.print();
			break;
		case 4:
			car=big;//���복�����Ϊ4����ѡ�����4�ų�
			big.print();
			break;
		case 5:
			car=light;//���복�����Ϊ5����ѡ�����5�ų�
			light.print();
			break;
		case 6:
			car=heavy;//���복�����Ϊ6����ѡ�����6�ų�
			heavy.print();
			break;
		default:
			break;
		}
		int money=a*b*c;//������ÿһ����������Ҫ��Ǯ
		System.out.println("��ѡ����"+b+"��"+a+"�ų�������"+c+"��,�⽫����"+money+"Ԫ");
		a=car.rent;
		return money;
	}
}
