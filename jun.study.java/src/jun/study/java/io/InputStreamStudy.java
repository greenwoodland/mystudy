/**
 * File Name: InputStreamStudy.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 18
 */
package jun.study.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * <p/>
 * @since 2020. 7. 18
 * @author Hyungjun, Jeon
 * <PRE>
 * ------------------------------------------------
 * 수정이력
 * 2020. 7. 18 Hyungjun, Jeon
 * </PRE>
 */
public class InputStreamStudy {

	/**
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 18
	 * @Method Name : main
	 * @return : void
	 * @param args
	 * @see
	 * 
	 */
	public static void main(String[] args) {
		//파일에서 데이터를 읽어온다.
		InputStream is;
		try {
			is = new FileInputStream("d:/temp/20041.csv");
//			readMothodTest(is);
			readbyteMothodTest(is);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}


	/**
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 18
	 * @Method Name : readMothodTest
	 * @return : void
	 * @param is
	 * @see
	 * 
	 */
	private static void readMothodTest(InputStream is) {
		int readByte;
		int cnt = 0;
		try {
			while((readByte = is.read()) != -1) {
				cnt++;
				System.out.println(cnt + "###" + (char)readByte);
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @Author : Hyungjun, Jeon
	 * @since 2020. 7. 18
	 * @Method Name : readbyteMothodTest
	 * @return : void
	 * @param is
	 * @see
	 * 
	 */
	private static void readbyteMothodTest(InputStream is) {
		int readByteNo;
		int cnt = 0;
		byte[] readBytes = new byte[1024];
		try {
			while((readByteNo = is.read(readBytes)) != -1){
				cnt++;
				System.out.println("["+cnt +"]"+ readByteNo + "###" + byteArrayToBinaryString(readBytes));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private static String byteArrayToBinaryString(byte[] b) {
	    StringBuilder sb=new StringBuilder();
	    for(int i=0; i<b.length; ++i){
	        sb.append((char)b[i]);
	    }
	    return sb.toString();
	}
	
	
	
}
