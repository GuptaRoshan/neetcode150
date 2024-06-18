package stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures_739 {

    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Arrays.fill(result, 0);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int stackTop = stack.pop();
                result[stackTop] = i - stackTop;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] temperatures = {89, 62, 70, 58, 47, 47, 46, 76, 100, 70};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures))); // [1,1,4,2,1,1,0,0]
    }
}

