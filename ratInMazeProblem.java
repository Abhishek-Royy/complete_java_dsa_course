
// GFG very important problem related to backtracking
// the code is doing based on GFG format, 
// it's not run on vs code.


class Solution {

    static boolean isSafeToMove(
        int newX,
        int newY,
        int maze[][],
        int n,
        boolean visited[][]
    ) {

        // Check boundary
        if(newX < 0 || newY < 0 || newX >= n || newY >= n) {
            return false;
        }

        // Already visited
        if(visited[newX][newY]) {
            return false;
        }

        // Blocked cell
        if(maze[newX][newY] == 0) {
            return false;
        }

        return true;
    }


    static void solve(
        int maze[][],
        int srcX,
        int srcY,
        int destX,
        int destY,
        ArrayList<String> ans,
        boolean visited[][],
        String path
    ) {

        // Base case
        if(srcX == destX && srcY == destY) {
            ans.add(path);
            return;
        }

        // Mark current cell as visited
        visited[srcX][srcY] = true;

        int n = maze.length;

        // UP
        int newX = srcX - 1;
        int newY = srcY;

        if(isSafeToMove(newX, newY, maze, n, visited)) {
            solve(
                maze,
                newX,
                newY,
                destX,
                destY,
                ans,
                visited,
                path + "U"
            );
        }


        // DOWN
        newX = srcX + 1;
        newY = srcY;

        if(isSafeToMove(newX, newY, maze, n, visited)) {
            solve(
                maze,
                newX,
                newY,
                destX,
                destY,
                ans,
                visited,
                path + "D"
            );
        }


        // LEFT
        newX = srcX;
        newY = srcY - 1;

        if(isSafeToMove(newX, newY, maze, n, visited)) {
            solve(
                maze,
                newX,
                newY,
                destX,
                destY,
                ans,
                visited,
                path + "L"
            );
        }


        // RIGHT
        newX = srcX;
        newY = srcY + 1;

        if(isSafeToMove(newX, newY, maze, n, visited)) {
            solve(
                maze,
                newX,
                newY,
                destX,
                destY,
                ans,
                visited,
                path + "R"
            );
        }


        // BACKTRACK
        visited[srcX][srcY] = false;
    }


    public ArrayList<String> ratInMaze(int[][] maze) {

        int n = maze.length;

        ArrayList<String> ans = new ArrayList<>();

        int srcX = 0;
        int srcY = 0;

        int destX = n - 1;
        int destY = n - 1;

        String path = "";

        boolean visited[][] = new boolean[n][n];

        // If source or destination is blocked
        if(maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        solve(
            maze,
            srcX,
            srcY,
            destX,
            destY,
            ans,
            visited,
            path
        );

        return ans;
    }
}