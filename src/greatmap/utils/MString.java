package greatmap.utils;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * @author lenovo
 *
 */
public class MString {

	/**
	 * 判断字符串是否是null或者""（空值），如果是返回true，否则，返回false
	 * @param str
	 * @return
	 */
	public static Boolean isEmpty(String str){
		return (str==null||str.equals(""))?true:false;
	}
	
	/**
	 * @example replaceSeparator("a,b，c", "#", ",", "，")，结果为a#b#c
	 * @param source 源字符串
	 * @param replacement 用来替换的字符
	 * @param separator 要替换的字符
	 * @return 替换后的字符串，如输入"a,b，c"，要求将所有的中英文逗号都替换为"@"符号，替换后结果为"a@b@c"
	 */
	public static String replaceSeparator(String source, String replacement, String... separator){
		for(int i=0;i<separator.length;i++){
			source = source.replaceAll(separator[i], replacement);	
		}
		
		return source;
	}
	 /** 
     * 将汉字转换成拼音 
     * @param hanzi
     * @return 
     */  
    public static String hanziToPinyin(String hanzi){  
    	MIO.println(hanziToPinyin(hanzi,""));
        return hanziToPinyin(hanzi,"");  
    } 
    /** 
     * 将汉字转换成拼音 
     * @param hanzi 
     * @param separator 
     * @return 
     */  
    public static String hanziToPinyin(String hanzi,String separator){  
            // 创建汉语拼音处理类  
            HanyuPinyinOutputFormat defaultFormat = new HanyuPinyinOutputFormat();  
            // 输出设置，大小写，音标方式  
            defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
            defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  
              
            String pinyingStr="";  
            try {  
                pinyingStr=PinyinHelper.toHanyuPinyinString(hanzi, defaultFormat, separator);  
            } catch (BadHanyuPinyinOutputFormatCombination e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }     
            return pinyingStr;  
    } 
    /**
     * 判断字符编码是否正确
     * @param source 源字串
     * @param type 要判断的编码方式
     * @return 如果源字串的编码和要判断的编码方式一致，返回true,否则返回false;
     */
    public static Boolean isCharTypeRight(String source, String type){
    	try {
			if(source.equals(new String(source.getBytes(type.toLowerCase()),type.toLowerCase()))){
				return true;
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return false;
    }
    /**
     * 字符编码转换
     * @param source 源字串
     * @param type 要转换的字符编码格式
     * @return 目标格式的字符串，如果遇到异常则返回null;
     */
    public static String stringTypeTransfer(String source){
    	try {
			return new String(source.getBytes("ISO-8859-1"),"GBK");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    }
	/**
	 * 判断字符串中是否全部为英文字符
	 * @param source
	 * @return
	 */
	public static Boolean isAllEnglish(String source){
		return source.length()==source.getBytes().length?true:false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s = "测试数值";
//		//得到一个Reader对象
//		Reader r = new StringReader(s);
//		char[] buffer = new char[256];
//		try {
//		//将字符读取为一串串流存入到buffer中
//		int dataLen = r.read(buffer);
//		//可以将字符流再以字符串的形式打印出来
//		System.out.println(new String(buffer, 0, dataLen));
//		} catch (IOException e) {
//		e.printStackTrace();
//		}
		String s = "Hello world";

	      // create a StringReader
	      Reader reader = new StringReader(s);

	      // create a char array to read chars into
	      char cbuf[] = new char[50];

	      try {
	         // read characters into a portion of an array.
	         System.out.println("" + reader.read(cbuf, 10, 5));

	         // print cbuf
	         System.out.println(cbuf);

	         // close the stream 
	         reader.close();

	      } catch (IOException ex) {
	         ex.printStackTrace();
	      }
	}

}
