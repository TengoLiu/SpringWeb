package tengo.spring.utils;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	/*
	 * ��һ����x�ָ��������������ַ���ͨ��ĳ���ָ����ָ��������Ұѷָ�����ַ�ת����int ���� "1,2,3,4" ����
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
