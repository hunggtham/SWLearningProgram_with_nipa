package org.nipa.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import org.nipa.oop.Calc; //Calc Ŭ������ �ٸ� ���丮(��Ű��)�� �����Ƿ�, �������ش�.
//import java.lang.Integer;

public class CalcTest {

	public CalcTest() {
	}

	public static void main(String[] args) {

		File f = new File("C:\\Temp\test.txt");

		//System.out.println(f.exists());//check file exist or not

		// FileInputStream fis = new FileInputStream(f);

		org.nipa.oop.Calc c = new org.nipa.oop.Calc(); // use directory instead import

		int i = 0;// = 0( if use try catch
		String s = null;
		try {
			i = Integer.parseInt(args[0]);
			s.length();
			System.out.println("end of try");
	} 
			//catch (java.lang.NumberFormatException e) {// if exeption e is number format exeption "type", i will catch
//														// it(e) -> "exception handling"
//			e.printStackTrace();
//		}catch(java.lang.NullPointerException e){
//				e.printStackTrace();
		//}
			catch(Exception e) {
				e.printStackTrace();
		}

	int j = Integer.parseInt(args[1]);System.out.println(c.plus(i,j));

	System.out.println("end of main");
}

}
