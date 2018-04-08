package day07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ������
 * ��������һ�Ը߼��������Է������Ƕ�дjava�е�
 * �κζ���(�������ֽڵ�ת�������ɶ��������)
 * 
 * java.io.ObjectOutputStream
 * ���������������д��java�еĶ���
 * 
 * @author adminitartor
 *
 */
public class ObjectOutputStream_writeObject {
	public static void main(String[] args) throws IOException {
		Person p = new Person();
		p.setName("����ʦ");
		p.setAge(18);
		p.setGender("Ů");
		
		List<String> otherInfo 
			= new ArrayList<String>();
		otherInfo.add("��һ����Ա");
		otherInfo.add("����д����");
		otherInfo.add("�ٽ������Ļ�����");
		otherInfo.add("�����ͬ����������ʦ");
		p.setOtherInfo(otherInfo);
		
		System.out.println(p);
		
		FileOutputStream fos 
			= new FileOutputStream("person.obj");
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		System.out.println("д�����!");
		
		oos.close();
	}
}






