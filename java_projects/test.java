public class test
{
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
    
    public static int[] rowSums(int[][] arr2D)
    {
        int[] output = new int[arr2D.length];
        
        for(int i = 0; i < arr2D.length; i++)
        {
            output[i] = arraySum(arr2D[i]);
        }
        return output;
    }
    
    public static boolean isDiverse(int[][] arr2D)
    {
        int[] temp = rowSums(arr2D);
        for(int i = 0; i<temp.length; i++)
        {
            if(temp[i] == temp[i+1])
                return false;
        }
        return true;
    }
    
    
    public int getValueAt(int row, int col)
    {
        for(SparseArrayEntry entry: entries)
        {
            if(entry.getRow() == row && entry.getCol() == col)
            {
                return entry.getValue();
            }
        }
        return 0;
    }
    
    public void removeColumn(int col)
    {
            for (int i = entries.size() - 1; i >= 0; i--)
        {
            SparseArrayEntry entry = entries.get(i);
            if (entry.getCol() == col)
            {
                entries.remove(i);
            }
            else if (entry.getCol() > col)
            {
                entries.set(i, new SparseArrayEntry(entry.getRow(), entry.getCol() - 1, entry.getValue()));
            }
        }
            numCols--;
    }
}