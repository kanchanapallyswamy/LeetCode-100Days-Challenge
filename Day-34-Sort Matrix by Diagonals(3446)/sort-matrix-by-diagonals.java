class Solution {
    public int[][] sortMatrix(int[][] grid) {
        PriorityQueue<Integer>minpq = new PriorityQueue<>();
        PriorityQueue<Integer>maxpq = new PriorityQueue<>(Collections.reverseOrder());
        int r = grid.length;
        int c = grid[0].length;
        for(int x = r - 1; x >= 0; x--){
            int j = 0 , i = x;
            while(i >= 0 && j >= 0 && i < r && j < c){
                maxpq.add(grid[i][j]);
                i++;j++;
            }
            i = x ; j = 0;
             while(i >= 0 && j >= 0 && i < r && j < c){
                grid[i][j]=maxpq.poll();
                i++;j++;
            }
           maxpq = new PriorityQueue<>(Collections.reverseOrder());
        }
        for(int y = 1; y < c; y++){
            int i = 0, j = y;
             while(i >= 0 && j >= 0 && i < r && j < c){
                minpq.add(grid[i][j]);
                i++;j++;
            }
            i = 0 ; j = y;
             while(i >= 0 && j >= 0 && i < r && j < c){
                grid[i][j]=minpq.poll();
                i++;
                j++;
             }
                
           minpq = new PriorityQueue<>();
        }
        return grid;
    }  
    }
