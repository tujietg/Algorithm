package Algorithm.leetcode.String;

public class No58 {
	public int lengthOfLastWord(String s) {
		String[] arr = s.split(" ");
		if (arr == null || arr.length == 0) {
			return 0;
		}
		return arr[arr.length - 1].length();
	}
}
