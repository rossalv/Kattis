#include <iostream>
#include <queue>   //std::queue
using namespace std;
struct Vx {
    int r, c;
    int d, col; //0=white, 1=gray, 2=black
    //no adjlist needed -- just try all 4. is nbr white?  grid of Vx pointers
    Vx(int rr, int cc) { r = rr; c = cc; col = 0; d = 999999999; }
};

Vx*** grid;   //a two dimension array of Vx pointers  !!!!  yes 3 *'s
queue<Vx*> q;  //a queue of Vx pointers

// I made a helper method to update a neighbor if it was white and adding to q

int main() {
    // read in number of rows, cols, and number of starting locations
    int rows, cols, n;
    cin >> rows >> cols >> n;

    // create the grid of Vx*   (see lab for dealing with 2-d arrays in C++)

    grid = new Vx * *[rows + 1];
    for (int r = 1; r < rows + 1; r++) grid[r] = new Vx * [cols + 1];

    for (int r = 1; r < rows + 1; r++) {
        for (int c = 1; c < cols + 1; c++) {
            grid[r][c] = new Vx(r, c);
        }
    }

    // initialize with the first ripple
    int x;
    int y;
    for (int i = 0; i < n; i++) {
        cin >> x >> y;
        grid[x][y]->col = 1;
        grid[x][y]->d = 0;
        q.push(grid[x][y]);
    }

    //breadfirst process until all have been reached
    Vx* u; //Vx* left; Vx* right; Vx* top; Vx* bottom;
    int max = 0;
    int dx[4] = { 1, 0, -1, 0 };
    int dy[4] = { 0, 1, 0, -1 };
    while (q.size() > 0) {
        u = q.front();
        q.pop();
        for (int i = 0; i < 4; i++) {
            x = dx[i] + u->r;
            y = dy[i] + u->c;
            if (x < rows + 1 && y < cols + 1 && x > 0 && y > 0 && grid[x][y]->col == 0) {
                grid[x][y]->col = 1;
                grid[x][y]->d = u->d + 1;
                q.push(grid[x][y]);
                if (grid[x][y]->d > max) {
                    max = grid[x][y]->d;
                }
            }
        }
        u->col = 2;
    }
    //output the answer
    cout << max + 1;
}