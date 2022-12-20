package in.co.Oops;

public class Calcultorbymethod {
	public static void main(String[] args) {
		Add();
		Sub();
		Multiplication();
		Div();
		}
	
			private static void Add() {
				int a=100;
				int b=20;
				int c=a+b;
			System.out.println("Addition:"+c);
			}
			
			
			private static void Sub() {
				int a=100;
				int b=20;
			    int d=a-b;
			System.out.println("Substraction:"+d);
			}
			
			private static void Multiplication() {
				int a=100;
				int b=20;
				int e=a*b;
			System.out.println("product:"+e);
			}
			
			private static void Div() {
				int a=100;
				int b=20;
			    int f=a/b;
			System.out.println("division:"+f);
		}}
