import java.util.*;

public class Permutations {
    /**
     * Problem: Given an array nums of distinct integers, return all the possible permutations.
     * Approach: Backtracking with recursion.
     * T.C: O(n * n!)
     * S.C: O(n) for recursion stack
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        // Base Case: If the temporary list size matches the array length, we found a permutation
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < nums.length; i++) {
                // If the element is already in the list, skip it (since nums are distinct)
                if (tempList.contains(nums[i])) continue;
                
                // Choose the element
                tempList.add(nums[i]);
                
                // Recursively call for the next position
                backtrack(result, tempList, nums);
                
                // Backtrack: remove the last element added
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Permutations sol = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = sol.permute(nums);
        
        System.out.println("Permutations of " + Arrays.toString(nums) + ":");
        for (List<Integer> p : result) {
            System.out.println(p);
        }
    }
}
