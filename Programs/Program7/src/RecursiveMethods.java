public class RecursiveMethods {
    public static void main(String[] args) {
        RecursiveMethods p6 = new RecursiveMethods();
    }

    public int byLeapsAndBounds(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 2;
        }
        else {
            return byLeapsAndBounds(n-1) + byLeapsAndBounds(n-2);
        }
    }

    public int subCount(String str, String subStr)
    {
        if(str.contains(subStr))
        {
            return subCount(str.substring((str.indexOf(subStr) + subStr.length())), subStr) + 1;
        }
        return 0;
    }

    public int binarySearch(int[] array, int target, int left, int right)
    {
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(array[mid] == target)
            {
                return mid;
            }
            else if(array[mid] > target)
            {
                return binarySearch(array, target, left, mid-1);
            }
            else if(array[mid] < target)
            {
                return binarySearch(array, target, mid+1, right);
            }
        }
        return -1;
    }
}