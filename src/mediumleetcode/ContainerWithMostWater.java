package mediumleetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea(height)); // 49

	}

	static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;
		int width;
		int area;
		while (left < right) {
			width = right - left;
			if (height[left] < height[right]) {
				area = width * height[left];
			} else {
				area = width * height[right];
			}
			if (area > maxArea) {
				maxArea = area;
			}
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}

}
