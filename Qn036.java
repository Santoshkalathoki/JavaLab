/*
//private
class Data{
	private int PIN = 4262;
	private void statement(){
		System.out.println("Your statement...");
	}
}

public class Qn036{
	public static void main(String[] args){
		Data obj = new Data();
		System.out.print(obj.PIN); //compile time error
		obj.statement(); //compile time error
	}
}
*/

/*
//Default
package Pack1;
class A{
	void text(){
		System.out.println("Hello from class A");
	}
}

package MainPack;
import Pack1.*;
class B{
	public static void main(String[] args){
		A a = new A(); //compile time error
		a.text(); //compile time error
	}
}
*/