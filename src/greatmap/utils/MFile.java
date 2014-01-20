package greatmap.utils;

import java.io.File;

/**
 * @author 柳恒建
 *
 */
public class MFile {

	/**
	  * 判断文件夹（文件）是否存在
	  * @param path 文件夹路径
	  */
	 public static Boolean isExist(String path) {
		  File file = new File(path);
		  //判断文件夹是否存在
		  if (!file.exists()) {
		   return false;
		  }
		  return true;
	 }
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
