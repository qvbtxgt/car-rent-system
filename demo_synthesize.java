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
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+capacity);
	
	}
}
class Two extends Car{
	@Override
	public void print() {
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+capacity);
	
	}
}
class Three extends Car{
	@Override
	public void print() {
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+capacity);
	
	}
}
class Four extends Car{
	@Override
	public void print() {
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+capacity);
	
	}
}
class Five extends Car{
	@Override
	public void print() {
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+capacity);
	
	}
}
class Six extends Car{
	@Override
	public void print() {
		System.out.println("��ѡ���˳���Ϊ"+name+"����һ��ļ۸�Ϊ��"+rent+"Ԫ������Ϊ��"+capacity);
	}
}
public class demo_synthesize {

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
			System.out.println("���Ƿ�Ҫ�⳵��1-�� ������-��");
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
					System.out.println("�����ʽ�������¿�ʼ��");
					continue;
				}finally {
					System.out.println("������ȷ��");
				}
				
				int money=0;
				money=choose(a, b, c);
				System.out.println("�������Ҫ�������͵��������밴�³���0������������");
				System.out.println("���������Ҫ�������͵��������밴�¡�0������");
				
				//�ж��Ƿ���Ҫ���������͵�����
				while((int) s.nextInt()!=0) {
					money+=choose(s.nextInt(), s.nextInt(), s.nextInt());
					System.out.println("�������Ҫ�������͵��������밴�³���0������������");
					System.out.println("���������Ҫ�������͵��������밴�¡�0������");
				}
				System.out.println("���⳵�����ܼ۸�Ϊ��"+money);
				
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
	//ѡ��
	public static int choose(int a,int b,int c) {
		One c1=new One();
		write(c1, "�µ�A4",500,"���ˣ�4��");
		Two c2=new Two();
		write(c2, "���Դ�6",400,"���ˣ�4��");
		Three c3=new Three();
		write(c3, "Ƥ��ѩ6",450,"���ˣ�4�ˣ��ػ���2��");
		Car c4=new Four();
		write(c4, "����",800,"���ˣ�20��");
		Car c5=new Five();
		write(c5, "�ɻ���",400,"���ˣ�4��");
		Car c6=new Six();
		write(c6, "��ά��",1000,"���ˣ�20��");
		Car car=new Car();
		switch (a) {
		case 1:
			car=c1;//���복�����Ϊ1����ѡ�����1�ų�
			c1.print();
			break;
		case 2:
			car=c2;//���복�����Ϊ2����ѡ�����2�ų�
			c2.print();
			break;
		case 3:
			car=c3;//���복�����Ϊ3����ѡ�����3�ų�
			c3.print();
			break;
		case 4:
			car=c4;//���복�����Ϊ4����ѡ�����4�ų�
			c4.print();
			break;
		case 5:
			car=c5;//���복�����Ϊ5����ѡ�����5�ų�
			c5.print();
			break;
		case 6:
			car=c6;//���복�����Ϊ6����ѡ�����6�ų�
			c6.print();
			break;
		default:
			break;
		}
		System.out.println("��ѡ����b"+"��"+a+"�ų�������"+c+"��");
		a=car.rent;
		return a*b*c;//������ÿһ����������Ҫ��Ǯ
	}
}
