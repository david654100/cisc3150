public class nQueen {

    final int N=4;

    /**
     * This function prints out the layout of the board and the locations of the queens. It prints o for empty spaces and 1 for locations that contain a Queen.
     * * @param board This is the lay out of the board to be printed
     *
     */
    void printBoard(int board[][]){
        for (int x=0;x<N;x++){
            for (int y=0;y<N;y++){
                System.out.print(" "+board[x][y]+" ");
            }

            System.out.println();
        }
    }

    /**
     *this method check to see if the queen can be placed in that spot
     * @param board this is the lay out of the board including the locations of the previously placed queens
     * @param row this is row that the queens is trying to be placed in
     * @param col this is the column which the queen is trying to placed in
     * @return returns true if it is safe for the queen to be placed there and false if there is a queen in in the same row column or diagonal
     */
    boolean isSafe(int board[][], int row, int col){
        int i,j;
        /*this checks the row for queens starting from the left side it returns false if there is a queen on the same row*/
        for (i=0;i<col;i++){
            if (board[row][i]==1)
                return false;
        }
        /*this checks the upper diagonal for a queen starting from the left side*/
        for(i=row,j=col;i>0 && j>0;i--,j--){
            if (board[i][j]==1)
                return false;
        }

          /* Check lower diagonal on left side */
        for (i=row, j=col; j>=0 && i<N; i++, j--) {
            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    /**
     *this is the recursive method that places the queens
     * @param board  this is the lay out of the board including the locations of the previously placed queens
     * @param col this is the column which the queen is trying to placed in
     * @return return true if all queens are placed returns false if the queen cannot be placed in this col
     */
    boolean solveNQUtil(int board[][], int col)
    {
        /* base case: If all queens are placed
           then return true */
        if (col >= N)
            return true;

      /*tries to place queen is each colum one by one*/
        for (int i = 0; i < N; i++)
        {

            /* Check if queen can be placed on
               board[i][col] */
            if (isSafe(board, i, col))
            {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;

                /* recur to place rest of the queens */
                if (solveNQUtil(board, col + 1) == true)
                    return true;

                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

        /* If queen can not be place in any row in
           this column col, then return false */
        return false;
    }

    /**
     * this method creates the board and prints the board after solved
     * @return r returns true if there is a solution and false if there is none
     */
    boolean solveNQ()
    {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        if (solveNQUtil(board, 0) == false)
        {
            System.out.print("Solution does not exist");
            return false;
        }

        printBoard(board);
        return true;
    }

    public static void main(String args[])
    {
        nQueen Queen = new nQueen();
        Queen.solveNQ();
    }


}

//https://www.geeksforgeeks.org/backtracking-set-3-n-queen-problem/
//https://www.youtube.com/watch?v=xouin83ebxE