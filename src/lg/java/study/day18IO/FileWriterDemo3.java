package lg.java.study.day18IO;
/*
��ʾ�������ļ���������д��
*/
import java.io.*;
class  FileWriterDemo3
{
	public static void main(String[] args) throws IOException
	{

		//����һ��true�����������������е��ļ������������ļ���ĩβ������������д��
		FileWriter fw = new FileWriter("./src/lg/java/study/day18IO/demo.txt",true);

		fw.write("nihao\r\nxiexie");

		fw.close();
	}
}
