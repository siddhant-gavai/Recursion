import java.util.*;

public class Subsets {
    /**
     * Problem: Given an integer array nums of unique elements, return all possible subsets (the power set).
     * Approach: Backtracking / Recursion (Pick or Don't Pick)
     * T.C: O(2^n)
     * S.C: O(n) for recursion stack
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Every state in the recursion tree is a valid subset
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            // Include the element
            current.add(nums[i]);
            
            // Move to the next element
            generateSubsets(i + 1, nums, current, result);
            
            // Backtrack: exclude the element
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Subsets sol = new Subsets();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = sol.subsets(nums);
        
        System.out.println("Subsets of " + Arrays.toString(nums) + ":");
        for (List<Integer> s : result) {
            System.out.println(s);
        }
    }
}
