package meta;

public class MissingRepeat_9 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[2];
        boolean[] seen = new boolean[n * n + 1];
        int actualSum = 0, expectedSum = (n * n) * (n * n + 1) / 2;
        int repeated = -1, missing;

        // Traverse the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                if (seen[num]) {
                    repeated = num;
                }
                seen[num] = true;
                actualSum += num;
            }
        }

        missing = expectedSum + repeated - actualSum;
        ans[0] = repeated;
        ans[1] = missing;

        return ans;
    }

    public static void main(String[] args) {
        MissingRepeat_9 solution = new MissingRepeat_9();

        int[][] grid = {{1, 3}, {2, 2}};

        int[] result = solution.findMissingAndRepeatedValues(grid);

        // Print the output
        System.out.println("Repeated Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
