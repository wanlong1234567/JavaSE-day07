package day07;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java IO����
 * 
 * IO����������д���ݵ�java��׼������
 * ����Ϊ��������:
 * ���������������
 * 
 * ������,InputStream:���ڴ�����Դ��ȡ���ݵ�����
 * �е����������ȡ���ݲ�����
 * 
 * �����,OutputStream:���ڴӳ����н����ݷ��ͳ�ȥ
 * ����������д�����ݲ�����
 * 
 * ���������������ࣺ
 * �ֽ�������������
 * 
 * �ֽ���:��д����һ���ǽ������ֽ����Ļ����ϵģ�
 *       ��ʵ�ʽ���������Դ�������"�ܵ�"������
 *       ʵ�ʰ������ݡ�
 * ������:���������ܶ������ڣ�����˼�壬��������
 *       ������������������������Ŀ����ͨ��������
 *       ���Լ򻯶��䴦�����Ķ�д������������
 *       �ɴ��������ͣ���
 *       
 * �ļ���
 * �ļ�����һ�Եͼ������ļ����������ڶ�ȡ�ļ�����
 * �ļ�������������ļ���д�����ݡ�
 * 
 * 
 * @author adminitartor
 *
 */
public class FileOutputStream_write {
	public static void main(String[] args) throws IOException {
		/*
		 * FileOutputStream֧�����鳣�õĹ���
		 * ����:
		 * FileOutputStream(String path)
		 * FileOutputStream(File file)
		 * �������ָ���ļ����������Ĭ���Ǹ���
		 * ģʽ����:��ָ�����ļ��Ѿ����ڣ��Ὣ��
		 * �ļ��������������Ȼ��ͨ������д����
		 * �������ݻ���Ϊ����ļ������ݱ��档
		 * 
		 * FileOutputStream(String path,boolean append)
		 * FileOutputStream(File file,boolean append)
		 * �ڶ�������Ϊbooleanֵ������ֵΪtrue,������
		 * ��Ϊ׷��ģʽ���������ļ�ԭ�����ݱ�����ͨ����ǰ
		 * ��д�������ݻ�ȫ��׷�ӵ��ļ���ĩβ��
		 */
		FileOutputStream fos
			= new FileOutputStream("fos.txt");
		
		String str = "��˹ְ�������������������";
		byte[] data = str.getBytes("UTF-8");
		fos.write(data);
		
		str = ",����������ʱ��.";
		data = str.getBytes("UTF-8");
		fos.write(data);
		System.out.println("д�����!");
		
		
		
		
		fos.close();
		
		
	}
}








