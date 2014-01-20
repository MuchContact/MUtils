package greatmap.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Callable;

public class MTime {
	/**
	 * @param func
	 * @return 执行时间，单位：秒
	 * @throws Exception
	 */
	public double timeAndCompute(Callable<Object> func) throws Exception {
		final long start = System.nanoTime();
		
		func.call();
		
		final long end = System.nanoTime();
		
		//System.out.println("Time (seconds) taken is " + (end - start) / 1.0e9);
		
		return (end - start) / 1.0e9;
	}
	
	/**
	 * @return
	 * @throws Exception
	 */
	public static String getCurrentTime(){
		return new SimpleDateFormat("yyyyMMdd_HH:mm:ss.SSS").format(Calendar.getInstance().getTime()).toString();
	}
	
}
