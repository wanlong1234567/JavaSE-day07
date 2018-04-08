package day07;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * BufferedInputStream:�����ֽ�������
 * BufferedOutputStream:�����ֽ������
 * 
 * ��������һ�Ը߼����������Ǽӿ��дЧ�ʡ�
 * 
 * @author adminitartor
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis
			= new FileInputStream("music.mp3");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		
		FileOutputStream fos
			= new FileOutputStream("music_cp5.mp3");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		int d = -1;
		
		long start = System.currentTimeMillis();
		/*
		 * �������ڲ�ά����һ���ֽ����顣
		 * ����ʵ���ϻ��������ǿ���߶�д��������
		 * ����ʵ�ʵĶ�д������ߵĶ�дЧ�ʡ�
		 * bis.read()�����ڵ�һ�ζ�ȡʱʵ�ʶ�ȡ��
		 * һ���ֽڣ�������һ���ֽڷ��ء����ٴ�
		 * ���ø÷�����ȡһ���ֽ�ʱ�Ὣ�ڶ����ֽ�
		 * ֱ�ӷ��ء�ֱ�����е��ֽڶ����ع���Ż�
		 * �ٴ�ʵ�ʶ�ȡһ���ֽڻ�����
		 */
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		long end = System.currentTimeMillis();
		System.out.println("�������!��ʱ:"+(end-start)+"ms");
		
		bis.close();
		bos.close();
	}
}










