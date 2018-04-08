package day07;

import java.io.Serializable;
import java.util.List;

/**
 * 使用该类的实例测试作为对象来进行对象流的读写
 * 
 * 一个类的实例若希望被对象流读写，那么要求该类
 * 必须实现Serializable接口
 * @author adminitartor
 *
 */
public class Person implements Serializable{
	private String name;
	private int age;
	private String gender;
	private List<String> otherInfo;
	
	public Person(){
		
	}

	public Person(String name, int age, String gender, List<String> otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(List<String> otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return name+","+age+","+gender+","+otherInfo;
	}
}




