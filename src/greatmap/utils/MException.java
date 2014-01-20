package greatmap.utils;

public class MException {
	public static int getNum(int a) throws Exception{
		if(a>20){
			throw new Exception("无效值异常");
		}else{
			return a;
		}
	}
	public static void main(String arg[]){
		try {
			getNum(38);
		} catch (Exception e) {
			MIO.println(e.getMessage());
		}
	}
}
