package tengo.spring.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	/*
	 * 将一个用x分隔符隔开的整体字符串通过某个分隔符分隔开来并且把分隔后的字符转化成int 例如 "1,2,3,4" 返回
	 * List<int>{1,2,3,4}
	 */
	public static List<Integer> DivedeStr2Ints(String str, String divider) {
		List result = new ArrayList<Integer>();
		try {
			if (str.isEmpty()) {
				return result;
			}
			String[] arr = str.split(divider);
			for (String s : arr) {
				if (!str.isEmpty()) {
					result.add(Integer.parseInt(s));
				}
			}
		} catch (Exception e) {
		}
		return result;
	}
}
