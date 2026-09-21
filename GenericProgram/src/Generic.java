public class Generic <T>{
    private T data;

    public static<T extends Comparable<T>> int checkOrder(T a, T b, T c, T d)
    {
        if(a.compareTo(b) > 0)
        {
            if(b.compareTo(c) > 0)
            {
                if(c.compareTo(d) > 0)
                {
                    return 1;
                }
            }
        }
        if(a.compareTo(b) < 0)
        {
            if(b.compareTo(c) < 0)
            {
                if(c.compareTo(d) < 0)
                {
                    return -1;
                }
            }
        }
        return 0;

    }

}
