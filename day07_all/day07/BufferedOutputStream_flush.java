package day07;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ����������Ļ���������
 * @author adminitartor
 *
 */
public class BufferedOutputStream_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		String str = "��������ݳ��������Ӷ�����.";
		byte[] buf = str.getBytes("UTF-8");
		bos.write(buf);
		/*
		 * void flush()
		 * �����������Ѿ����������һ����д��
		 */
		bos.flush();
		System.out.println("д�����!");
		
		bos.close();
	}
}








