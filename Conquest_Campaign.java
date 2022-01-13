package Kattis;
import java.util.*;

/**
 *
 * @author rfalv
 */

public class Conquest_Campaign {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int rows, cols, n;
        rows = stdin.nextInt();
        cols = stdin.nextInt();
        n = stdin.nextInt();
        Square[][] grid = new Square[rows + 1][cols + 1];
        LinkedList<Square> q = new LinkedList<>();
        for(int r = 1; r < rows + 1; r++){
            for(int c = 1; c < cols + 1; c++){
                grid[r][c] = new Square(r, c);
            }
        }
        int x, y;
        for(int i = 0; i < n; i++){
            x = stdin.nextInt();
            y = stdin.nextInt();
            grid[x][y].col = 1;
            grid[x][y].d = 0;
            q.add(grid[x][y]);
        }
        Square u;
        int max = 0;
        int dx[] = {1,0,-1,0};
        int dy[] = {0,1,0,-1};
        while(q.size() > 0){
            u = q.remove();
            for(int i = 0; i < 4; i++){
                x = dx[i] + u.r;
                y = dy[i] + u.c;
                if (x < rows + 1 && y < cols + 1 && x > 0 && y > 0 && grid[x][y].col == 0){
                    grid[x][y].col = 1;
                    grid[x][y].d = u.d + 1;
                    q.add(grid[x][y]);
                    if (grid[x][y].d > max) {
                    max = grid[x][y].d;
                  
                }
              }
            }
            u.col = 2;
        }
        System.out.println(max + 1);
    }
}

class Square{
    int r, c, d, col;
    Square(int x, int y){
        r = x;
        c = y;
        col = 0;
        d = 999999999;
    }
}
