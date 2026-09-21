import java.util.ArrayList;    
import java.util.Arrays;       // Helpful for sorting
import java.util.Random;
import java.util.Vector;

public class GenMethods {

    /*Write the following method that returns a new ArrayList.
    The new list contains the nonduplicate (i.e., distinct) elements from the original list.
     */
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> newList = new ArrayList<E>();
        for(int i = 0; i < list.size(); i++)
        {
            if(!newList.contains(list.get(i)))
                newList.add(list.get(i));
        }
        return newList;
    }

    /* Write the following method that mixes up the elements of a java.util.Vector object.
    (You'll find the Vector works just like the ArrayList and you can use its add() method to insert elements).
    Randomize the items in the vector by getting two random indexes and swapping the values at those indexes;
    repeat this swapping process exactly 30 times.
    Finally, the method returns a string produced by the Vector class's toString() method.
    */
    public static <E> String randomize(Vector<E> list, long seed)
    {
        Random rand1 = new Random(seed);
        int increment = 0;
        while(increment < 30)
        {
            int first = rand1.nextInt(list.size());
            int second = rand1.nextInt(list.size());
            E f = list.get(first);
            E s = list.get(second);
            list.set(first, s);
            list.set(second, f);
            increment++;
        }
        return list.toString();
    }

    /*Write the following method that returns the second smallest element in an ArrayList.
    Assume the list has a minimum of 3 items.
    For example, if the elements are [1, 2, 3] the method returns 2. If the elements are [1,1,2,3] the method returns 2.
    Solve the case of unique elements and then solve for duplicates if you have time.
    */
    public static <E extends Comparable<E>> E secondMin(ArrayList<E> list)
    {
        ArrayList<E> actual = removeDuplicates(list);
        E min = actual.get(0);
        E med = actual.get(1);
        for(int i = 0; i < actual.size(); i++)
        {
            if(actual.get(i).compareTo(med) < 0)
            {
                if(actual.get(i).compareTo(min) < 0)
                {
                    min = actual.get(i);
                }
                else {
                    med  = actual.get(i);
                }
            }
        }
        return med;
    }

    /*Implement the following generic method for binary search.
    You can assume the parameter list is sorted when its passed in.
    The method returns the index where the key is found or -1 if its not in the array.
    DO NOT USE THE API LIBRARY CALL OR LINEAR SEARCH. YOU MUST IMPLEMENT BINARY SEARCH FROM SCRATCH.
     */
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
    {
        Arrays.sort(list);
        int low = 0;
        int high = list.length - 1;

        while(high >= low)
        {
            int mid = (low + high) / 2;

            if(list[mid].compareTo(key) < 0)
            {
                low = mid + 1;
            }
            else if (list[mid].compareTo(key) > 0)
            {
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    /*Write the following method that returns the second smallest element in an array called list.
    Assume the list has a minimum of 3 items.
    For example, if the elements are [1, 2, 3] the method returns 2. If the elements are [1,1,2,3] the method returns 2.
    Solve the case of unique elements and then solve for duplicates if you have time.
     */
    public static <E extends Comparable<E>> E secondMin(E[] list)
    {
        Arrays.sort(list);
        E min = list[0];
        E med;
        for(int i = 0; i < list.length; i++) {
            if (list[i].compareTo(min) > 0) {
                med = list[i];
                return med;
            }
        }
        return min;
    }

    // Implement a generic method that returns the smallest element in a two-dimensional array.
    public static <E extends Comparable<E>> E min (E[][] list)
    {
        E min = list[0][0];
        for(int i = 0; i < list.length; i++)
        {
            for(int j = 0; j < list[i].length; j++)
            {
                if(list[i][j].compareTo(min) < 0)
                {
                    min = list[i][j];
                }
            }
        }
        return min;
    }

 
}

