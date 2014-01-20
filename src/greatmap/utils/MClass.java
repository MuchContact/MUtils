package greatmap.utils;

/**
 * @author 柳恒建
 *
 */
public class MClass {
	
	public static boolean isInterface(Class c, String szInterface)
	{
		Class[] face = c.getInterfaces();
		for (int i = 0, j = face.length; i < j; i++) 
		{
			if(face[i].getName().equals(szInterface))
			{
				return true;
			}
			else
			{ 
				Class[] face1 = face[i].getInterfaces();
				for(int x = 0; x < face1.length; x++)
				{
						if(face1[x].getName().equals(szInterface))
						{
								return true;
						}
						else if(isInterface(face1[x], szInterface))
						{
								return true;
						}
				}
			}
		}
		if (null != c.getSuperclass())
		{
			return isInterface(c.getSuperclass(), szInterface);
		}
		return false;
	}
	
	public static boolean isSubClass(Class a, Class b){
//		Class cla=a.getClass();
//		Class clb=b.getClass();
//		if(clb.getSuperclass().getName().equals(cla.getName())||cla.);
//		cla.getSuperclass().getName();
		return true;
	}
	/**
	 * 获得类c的绝对路径
	 * @param c
	 * @return
	 */
	public static String getClassAbsolutePath(Object obj){
		//return obj.getClass().getResource("/").getPath();
		return "none";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
