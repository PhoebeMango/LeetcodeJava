package day0901;

//给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。

//你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
import java.util.Arrays;
import java.util.HashMap;
public class twoSum{
	public static int[] twoSum (int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int result[] = new int [2];
		for (int i=0; i<nums.length; i++){
			int num = target - nums[i];
			if (map.containsKey(num)){
				result[0] = map.get(num);
				result[1] = i;
				return result;
			}
			map.put(nums[i],i);
		}
		return result;
	}
	public static void main(String[] args){
		int[] a = {2,7,11,15};
		int[] r = twoSum(a, 9);
		System.out.println(Arrays.toString(r));
	}
}

	
