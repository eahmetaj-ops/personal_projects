public class AhmetajProj6
{
    public static void main(String []args)
    {
        //Quesiton 1
        System.out.println("----------------------------------------");
        double[][] mat = {{0.3,  0.7,  0.8},
                          {1.1,  1.4,  0.4},
                          {0.2,  0.5,  0.1},
                          {0.9,  0.6,  1.6}};

        double q1 = minFromSection(mat,3,3,1,2);
        System.out.println("Q1 = "+q1);
        
        //Question 2
        System.out.println("----------------------------------------");
        String[][] t = new String[2][3];
        t = twoCharsTo2D(t, new String[]{"hello", "blah",  "boom", "elephant"});
        printArr2DString(t);
        
        //Question 3
        //Q3A
        System.out.println("----------------------------------------");
        double q3a = findAverage(new int[]{100, 90, 96, 98, 99});
        System.out.println("q3a = "+q3a);
        
        //Q3B
        System.out.println("----------------------------------------");
        int[][] g = {{80, 90, 90, 100, 70},
                     {90, 60, 75, 80, 80},
                     {100, 90, 96, 98, 99}};
        double[] p = rowAvg(g);
        printArrD(p);
        
        //Q3C
        System.out.println("----------------------------------------");
        String[] r = new String[]{"Joe", "Kim", "Chris"};
        int[][] k = {{80, 90, 90, 100, 70},
                     {90, 60, 75, 80, 80},
                     {100, 90, 96, 98, 99}};
        String best = bestAverage(r,k);
        System.out.println("Q3C = "+best);
        
        //Question 4
        //Q4A
        System.out.println("----------------------------------------");
        int[][] g1 ={{9, 8, 7, 6},        
                     {5, 4, 12, 1},
                     {3, 19, 2, 13}};
        int[][] after = removeRow(g1,0);
        printArr2DInt(after);
        
        //Q4B
        System.out.println("----------------------------------------");
        int[][] after2 = removeCol(g1,0);
        printArr2DInt(after2);
        
        //Q4C
        System.out.println("----------------------------------------");
        int[][] after3 = removeRowCol(g1,0,1);
        printArr2DInt(after3);
        
        //Question 5
        //Q5A
        System.out.println("----------------------------------------");
        String[][] table = {{"X", "O", "O", "X"},
                            {"O", "O", "O", "X"},
                            {"O", "X", "O", "O"}};
        boolean q5a = toBeChanged(2,2,table);
        System.out.println("q5 = "+q5a);
        
        //Q5B
        System.out.println("----------------------------------------");
        String[][] q5b = change2DArray(table);
        printArr2DString(q5b);
        
        //Question 6
        System.out.println("----------------------------------------");
        int[][] g2 = {{9, 8, 7, 6},           
                      {5, 4, 2, 1},
                      {3, 9, 2, 3}};
        int[][] q6 = reverseColMajor(g2);
        printArr2DInt(q6);
        
        //Question 7
        System.out.println("----------------------------------------");
        int[][] g3 = {{9, 8, 7, 6, 2, 4, 5},          
                      {5, 4, 2, 1, 9, 3, 1},
                      {3, 9, 2, 3, 5, 1, 2},
                      {8, 7, 6, 3, 2, 5, 5},
                      {1, 2, 3, 3, 2, 1, 4},
                      {9, 8, 7, 6, 7, 8, 9}};
        int[] q7 = get5x5At(g3,1,1);
        printArr(q7);
        
        //Question 8
        int[][] puzzle =  {{4,3,5,2,6,9,7,8,1},
                           {6,8,2,5,7,1,4,9,3},
                           {1,9,7,8,3,4,5,6,2},
                           {8,2,6,1,9,5,3,4,7},
                           {3,7,4,6,8,2,9,1,5},
                           {9,5,1,7,4,3,6,2,8},
                           {5,1,9,3,2,6,8,7,4},
                           {2,4,8,9,5,7,1,3,6},
                           {7,6,3,4,1,8,2,5,9}};

        //Q8A
        System.out.println("----------------------------------------");
        boolean b1 = checkRow(puzzle,0);
        System.out.println("b1 = "+b1);
        
        //Q8B
        System.out.println("----------------------------------------");
        boolean b2 = checkCol(puzzle,0);
        System.out.println("b2 = "+b2);
        
        //Q8C
        System.out.println("----------------------------------------");
        boolean b3 = check3x3(puzzle,0,3);
        System.out.println("b3 = "+b3);
    }
    
    //method to print 1D arrays
    public static void printArr(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i<arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]);
        }
    }
    
    public static void printArrS(String[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i<arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]);
        }
    }
    
    public static void printArrD(double[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if(i<arr.length-1)
                System.out.print(arr[i]+", ");
            else
                System.out.println(arr[i]);
        }
    }
    
    //method to print 2D arrays
    public static void printArr2DString(String[][] arr2D)
    {
        for(int r = 0; r < arr2D.length; r++)
        {
            for(int c = 0; c < arr2D[r].length; c++)
            {
                if(c == arr2D[r].length - 1)
                {
                    System.out.print(arr2D[r][c]);
                }
                else
                {
                    System.out.print(arr2D[r][c] + ", ");
                }
            }
            System.out.println("");
        }
    }
    
        public static void printArr2DInt(int[][] arr2D)
    {
        for(int r = 0; r < arr2D.length; r++)
        {
            for(int c = 0; c < arr2D[r].length; c++)
            {
                if(c == arr2D[r].length - 1)
                {
                    System.out.print(arr2D[r][c]);
                }
                else
                {
                    System.out.print(arr2D[r][c] + ", ");
                }
            }
            System.out.println("");
        }
    }
    
    //Q1
    public static double minFromSection(double[][] nums, int startRow, int endRow, int startCol, int endCol)
    {
        double min = nums[startRow][startCol];
        
        for(int r = startRow; r <= endRow; r++)
        {
            for(int c = startCol; c <= endCol; c++)
            {
                if(nums[r][c] < min)
                {
                    min = nums[r][c];
                }
            }
        }
        return min;
    }
    
    //Q2
    public static String[][] twoCharsTo2D(String[][] table, String[] words)
    {
        int index = 0;
        
        for(int r = 0; r < table.length; r++)
        {
            for(int c = 0; c < table[0].length; c++)
            {
                if(index < words.length)
                {
                    table[r][c] = words[index].substring(0,2);
                    index++;
                }
                else
                {
                    table[r][c] = "$$";
                }
            }
        }
        return table;
    }
    
    //Q3A
    public static double findAverage(int[] nums)
    {
        int count = 0;
        int avg = 0;
        //finding the average 
        for(int i = 0; i<nums.length; i++)
        {
            avg+=nums[i];
            count++;
        }
        return (double)avg/count;
    }
    
    //Q3B
    public static double[] rowAvg(int[][] nums)
    {
        double[] output = new double[nums.length];
        
        for(int i = 0; i<nums.length; i++)
        {
            output[i] = findAverage(nums[i]);
        }
        return output;
    }
    
    //Q3C
    public static String bestAverage(String[] roster, int[][] grades)
    {
        double[] avgs = rowAvg(grades);
        
        int indexH = 0;
        
        for(int i = 0; i < avgs.length; i++)
        {
            if(avgs[i] > avgs[indexH])
            {
                indexH = i;
            }
        }
        return roster[indexH];
    }
    
    //Q4
    //Q4A
    public static int[][] removeRow(int[][] mat, int row)
    {
        int[][] output = new int[mat.length-1][];
        int nR = 0;
        
        for(int i = 0; i < mat.length; i++)
        {
            if(i!=row)
            {
                output[nR] = mat[i];
                nR++;
            }
        }
        
        return output;
    }
    
    //Q4B
    public static int[][] removeCol(int[][] mat, int col)
    {
        int[][] output = new int[mat.length][mat[0].length - 1];
        
        for(int r = 0; r < mat.length; r++)
        {
            int nC = 0;
            for(int c = 0; c < mat[0].length; c++)
            {
                if(c!=col)
                {
                    output[r][nC] = mat[r][c];
                    nC++;
                }
            }
        }
        return output;
    }
    
    //Q4C
    public static int[][] removeRowCol(int[][] mat, int row, int col)
    {
        mat = removeCol(mat,col);
        mat = removeRow(mat,row);
        return mat;
    }
    
    //Q5
    //Q5A
    public static boolean toBeChanged(int r, int c, String[][] grid)
    {
        if(grid[r][c].equals("O") != true)
        {
            return false;
        }
        
        boolean above = (r > 0 && grid[r-1][c].equals("O"));
        boolean left = (c > 0 && grid[r][c-1].equals("O"));
        
        return !above && !left;
    }
    
    //Q5B
    public static String[][] change2DArray(String[][] grid)
    {
        String[][] output = new String[grid.length][grid[0].length];
        
        for(int r = 0; r<grid.length; r++)
        {
            for(int c = 0; c<grid[0].length; c++)
            {
                if(toBeChanged(r,c,grid))
                {
                    output[r][c] = "#";
                }
                else
                {
                    output[r][c] = grid[r][c];
                }
            }
        }
        return output;
    }
    
    //Q6
    public static int[][] reverseColMajor(int[][] mat)
    {
        int[][] output = new int[mat.length][mat[0].length];
        
        int row = 0;
        int col = 0;
        
        for(int c = mat[0].length-1; c>=0; c--)
        {
            for(int r = mat.length-1; r>=0; r--)
            {
                output[row][col] = mat[r][c];
                row++;
            }
            row = 0;
            col++;
        }
        return output;
    }
    
    //Q7
    public static int[] get5x5At(int[][] grid, int row, int col)
    {
        int count = 0;
        
        for(int r = row-2; r<= row+2; r++)
        {
            for(int c = col-2; c<= col+2; c++)
            {
                if((r>=0 && r<grid.length) && (c>=0 && c<grid[0].length))
                {
                    count++;
                }
            }
        }
        
        int[] output = new int[count];
        int index = 0;
        
        for(int r = row-2; r<= row+2; r++)
        {
            for(int c = col-2; c<= col+2; c++)
            {
                if((r>=0 && r<grid.length) && (c>=0 && c<grid[0].length))
                {
                    output[index] = grid[r][c];
                    index++;
                }
            }
        }
        return output;
    }
    
    //Q8
    //Q8A
    public static boolean checkRow(int[][] puzzle, int currRow)
    {
        int sum = 0;
        int product = 1;
        
        for(int c = 0; c<9; c++)
        {
            int num = puzzle[currRow][c];
           
            if(num < 1 || num > 9)
            {
                return false;
            }
            
            //checking to see if everynumber 1-9 is present with sum and product
            //if all numbers are present it will add up to 45 and multiply to 362880
            sum+=num;
            product*=num;
        }
        return sum == 45 && product == 362880;
    }
    
    //Q8B
    public static boolean checkCol(int[][] puzzle, int currCol)
    {
        int sum = 0;
        int product = 1;
        
        for(int r = 0; r<9; r++)
        {
            int num = puzzle[r][currCol];
           
            if(num < 1 || num > 9)
            {
                return false;
            }
            
            //checking to see if everynumber 1-9 is present with sum and product
            //if all numbers are present it will add up to 45 and multiply to 362880
            sum+=num;
            product*=num;
        }
        return sum == 45 && product == 362880; 
    }
    
    //Q8C
    public static boolean check3x3(int[][] puzzle, int currRow, int currCol)
    {
         int sum = 0;
         int product = 1;
         
         for(int r = currRow; r<currRow+3; r++)
         {
             for(int c = currCol; c<currCol+3; c++)
             {
                 int num = puzzle[r][c];
                 
                 if(num < 1 || num > 9)
                 {
                    return false;
                 }
                 
                //checking to see if everynumber 1-9 is present with sum and product
                //if all numbers are present it will add up to 45 and multiply to 362880
                sum+=num;
                product*=num; 
             }
         }
        return sum == 45 && product == 362880; 
    }
}