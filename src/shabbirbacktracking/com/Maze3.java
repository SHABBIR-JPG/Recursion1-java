package shabbirbacktracking.com;

public class Maze3 {
    static void main(String[] args) {
        boolean[][] board ={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathRestriction("", board,0,0);

    }
    static void pathRestriction(String p,boolean[][] Maze,int r,int c){
        if (r==Maze.length-1 && c==Maze[0].length-1){
            System.out.print(p);
            return;
        }
        if (!Maze[r][c]){
            return;
        }
        if (r < Maze.length-1){
            pathRestriction(p+'D',Maze,r+1,c);
        }
        if (c < Maze[0].length-1){
            pathRestriction(p+'R',Maze,r,c+1);
        }
    }
}
