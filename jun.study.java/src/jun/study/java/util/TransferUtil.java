/**
 * File Name: TransferUtil.java
 * Copyright: Copyright (c) RedRooster Co., Ltd 2020. All rights reserved.
 * Description: 
 * Creator: Hyungjun, Jeon
 * Created Date: 2020. 7. 18
 */
package jun.study.java.util;

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
public class TransferUtil {

	public String byteArrayToBinaryString(byte[] b){
	    StringBuilder sb=new StringBuilder();
	    for(int i=0; i<b.length; ++i){
	        sb.append(byteToBinaryString(b[i]));
	    }
	    return sb.toString();
	}

	public String byteToBinaryString(byte n) {
	    StringBuilder sb = new StringBuilder("00000000");
	    for (int bit = 0; bit < 8; bit++) {
	        if (((n >> bit) & 1) > 0) {
	            sb.setCharAt(7 - bit, '1');
	        }
	    }
	    return sb.toString();
	}

	public byte[] binaryStringToByteArray(String s){
	    int count=s.length()/8;
	    byte[] b=new byte[count];
	    for(int i=1; i<count; ++i){
	        String t=s.substring((i-1)*8, i*8);
	        b[i-1]=binaryStringToByte(t);
	    }
	    return b;
	}

	public byte binaryStringToByte(String s){
	    byte ret=0, total=0;
	    for(int i=0; i<8; ++i){        
	        ret = (s.charAt(7-i)=='1') ? (byte)(1 << i) : 0;
	        total = (byte) (ret|total);
	    }
	    return total;
	}	
}
