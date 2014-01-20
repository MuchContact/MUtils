package greatmap.utils;

public class MGeo {
	
	public static Boolean lon1Ok(Object lo) throws Exception{
		double lon = Double.valueOf(lo.toString());
		if(lon<-180||lon>180){
			throw new Exception("经度范围在-180~180之间");
		}
		
		return true;
	}
	
	/**
	 * 经度校验
	 * @param lon
	 * @return
	 * @throws Exception
	 */
	public static Boolean lonOk(double lon) throws Exception{
		
		if(lon<-180||lon>180){
			throw new Exception("经度范围在-180~180之间");
		}
		
		return true;
	}
	/**
	 * 纬度校验
	 * @param lat
	 * @return
	 * @throws Exception
	 */
	public static Boolean latOk(double lat) throws Exception{
		
		if(lat<-90||lat>90){
			throw new Exception("纬度范围在-90~90之间");
		}
		
		return true;
	}
	public static void main(String arg[]){
		try {
			if(lon1Ok(200)){
				MIO.print("true");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
