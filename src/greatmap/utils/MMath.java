package greatmap.utils;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;

/**
 * @author 柳恒建
 *
 */
public class MMath {

	/**
	 * 将byte数组转换为16进制数字，数字以字符形式返回
	 * @param b
	 * @return
	 */
	private static String byte2hex(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toUpperCase();
	}
	
	/**
	 * 将字符串转化为16进制数字，数字以字符形式返回
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	public static String string2hex(String str) throws UnsupportedEncodingException {
		byte [] b = null;
		
		b = str.getBytes("utf-8");

		return byte2hex(b);
	}
	/**
	 * 将数字保留指定的位数
	 * @param number 字符型数字，如"25.12536"
	 * @param digitNum 指定保留的小数点位数
	 * @return 返回处理后的数字（字符型）
	 * @throws NumberFormatException
	 */
	public static String decimalFormat(String number,int digitNum) throws NumberFormatException{
		String format="#.";
		int i=0;
		while(i<digitNum){
			format+="0";
			i++;
		}
		DecimalFormat df=new DecimalFormat(format);
		
		return df.format(Double.valueOf(number));
	}
	/**
	 * 将数字保留指定的位数
	 * @param number 字符型数字，如"25.12536"
	 * @param digitNum 指定保留的小数点位数
	 * @return 返回处理后的数字（字符型）
	 * @throws NumberFormatException
	 */
	public static String decimalFormat(double number,int digitNum) throws NumberFormatException{
		String format="#.";
		int i=0;
		while(i<digitNum){
			format+="0";
			i++;
		}
		DecimalFormat df=new DecimalFormat(format);
		
		return df.format(number);
	}
	/**
	 * 将数字保留指定的位数
	 * @param number 字符型数字，如"25.12536"
	 * @param digitNum 指定保留的小数点位数
	 * @return 返回处理后的数字（字符型）
	 * @throws NumberFormatException
	 */
	public static String decimalFormat(long number,int digitNum) throws NumberFormatException{
		String format="#.";
		int i=0;
		while(i<digitNum){
			format+="0";
			i++;
		}
		DecimalFormat df=new DecimalFormat(format);
		
		return df.format(number);
	}
	
	public static void main(String[] argu){
		String res=decimalFormat("0.00",6);
		MIO.print(Double.valueOf(res));
		  
	}
}
