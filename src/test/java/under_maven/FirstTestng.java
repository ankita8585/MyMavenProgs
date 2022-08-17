package under_maven;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

//first testng program 

public class FirstTestng {
	@Test
	public void display()
	{
		System.out.println("My first TestNG program");
	}
	@Test(enabled = true)
	public void action()
	{
		System.out.println("In TestNG, methods are executing in alphabetical order");
	}
	@Test(description ="it is optional acts as a comment but visible in console" )
	public void show()
	{
		demo();
		System.out.println("by default their(method) value is Zero");
		//demo();
	}
	
	@Test(priority = 2)
	public void priority()
	{
		System.out.println("In TestNG we can run the methods based on their priority");
	}
	//for this ask to run as java app as main() is included o.w. will run as testng app
	public static void main(String[] args) {
		System.out.println("main method in testng considered as simple method");
	}
	
	public void demo()
	{
		System.out.println("Simple method i.e.method within method calling");
	}

}

class TestClass{
	@Test
	public void anothermethod()
	{
		System.out.println("Class within class method");
	}
}
