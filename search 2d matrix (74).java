class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int low = 0, high = row * col - 1;
        while (low <= high) 
            int mid = low + (high - low) / 2;
            int row_idx = mid / col, col_idx = mid % col;
            if (matrix[row_idx][col_idx] == target)
                return true;
            else if (matrix[row_idx][col_idx] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
