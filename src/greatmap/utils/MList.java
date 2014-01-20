package greatmap.utils;

import java.util.List;

public class MList {
	/**
	 * 两个List对象间的赋值，直接改变source数组的值，操作成功后将dest置空
	 * @param <T>
	 * @param source
	 * @param dest
	 */
	public static <T> void replace(List<T> source, List<T> dest){
		source.removeAll(source);
		source.addAll(dest);
		dest.removeAll(dest);
	}
}
