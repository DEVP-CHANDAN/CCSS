package test;

class Parent{
	int a;
    Parent(int a){
    	this.a = a;
    }
	public void print() {
		System.out.println(this.a);
	} 
	
	public void print(int a , int b) {
		System.out.println(a+ " " + b);
	}
}

class Child extends Parent{
	Child(int a) {
		super(a);
	}

	@Override
	public void print(int a , int c) {
		int b = a+10;
		System.out.println(b+c);
	}
} 

public class test1 {
    public static void main(String[] args) {
		Parent obj = new Parent(9);
		obj.print();
		obj.print(7,7);
		Child obj1 = new Child(2);
		obj1.print(4,3);
	}
}
