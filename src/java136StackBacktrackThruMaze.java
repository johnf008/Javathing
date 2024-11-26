//name:programmerJohn
//pgm desc: demonstrate using the stack data structure to backtrack moves in maze
import java.util.Stack;
class Position{
    int x, y;
    int direction;

    //use constructor to initialize object instance variables
    Position(int x, int y){
        this.x = x;
        this.y = y;
        this.direction = 0;
    }
}
public class java136StackBacktrackThruMaze {
    private static final int N = 4;
    private static final int[][] maze = {
            {1, 0, 0, 0},
            {1, 0, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
    };
    private static final boolean[][] visited = new boolean[N][N];
    //keep track of path being explored
    public static boolean solveMaze(){
        //declare stack to store position objects
        Stack<Position> stack = new Stack<>();
        //store initial starting position on Stack
        stack.push(new Position(0, 0));

        //at each iteration, peek at the top of the stack to get current position
        while(!stack.isEmpty()){
            Position current = stack.peek();
            int x = current.x;
            int y = current.y;

            if((x == N - 1) && (y == N - 1)){
                return true; // reached teh destination !
            }

            boolean moved = false;
            //try to move in all 4 directions
            while (current.direction < 4){
                int nextX = x, nextY = y;

                switch (current.direction){
                    case 0:
                        nextX--;
                        break; //UP
                    case 1:
                        nextY++;
                        break; //Right
                    case 2:
                        nextX++;
                        break; //down
                    case 3:
                        nextY--;
                        break; //left
                }
                current.direction++;

                //if a valid move is found, mark it & push onto stack
                if (isValid(nextX, nextY) && maze[nextX][nextY] == 1 && !visited[nextX][nextY]){
                    visited[nextX][nextY] = true;
                    stack.push(new Position(nextX, nextY));
                    moved = true;
                    break;
                }
                }
                //if no valid moves available, backtrack by popping current position off stack
                if (!moved){
                    visited[x][y] = false;
                    stack.pop();
                }

        }
        return false; //no path found

    }

    private static boolean isValid(int x, int y){
        boolean status = (x >= 0) && (x < N) && (y >= 0) && (y < N);

        return status;
    }

    public static void main(String[] args){
        visited[0][0] = true;
        boolean solvable = solveMaze();

        //use ternary operator - if solvable print "solvable else "not solvable"
        System.out.println("Maze is " + (solvable ? "solvable" : "not solvable"));
    }
}
