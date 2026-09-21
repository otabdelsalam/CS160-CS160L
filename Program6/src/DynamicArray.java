import java.util.Arrays;

@SuppressWarnings("unchecked")
public class DynamicArray<E> extends AbstractListADT<E> implements ListADT<E>
{
    protected Object[] array;

    @SuppressWarnings("unchecked")
    public DynamicArray()
    {
        array = (E[]) new Object[10];
        this.size = 0;
    }

    public DynamicArray(int capacity)
    {
        array = (E[]) new Object[capacity];
        this.size = 0;
    }

    public String getIdentificationString()
    {
        return "Program 6, Omar Abdelsalam";
    }

    @Override
    public boolean add(E data) {
        verifyCapacity(size + 1);
        array[size++] = data;
        return true;
    }

    private void verifyCapacity(int need){
        if(need >= array.length){
            resize();
        }
    }

    private void resize()
    {
        try {
            Object[] temp = new Object[array.length*2];
            temp = Arrays.copyOf(array, temp.length);
            this.array = temp;
        }
        catch (ArrayIndexOutOfBoundsException e) {

        }
    }
    @Override
    public boolean add(int index, E data) throws IndexOutOfBoundsException {
        if(index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException();
        }
        verifyCapacity(size + 1);
        for(int i = size-1; i > index; i-- )
        {
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
        return true;
    }

    @Override
    public void clear() {
        for(int i = 0; i < array.length; i++)
        {
            remove(i);
        }
    }

    @Override
    public boolean contains(E data) {
        if(data == null || array == null)
        {
            return false;
        }
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] != null && array[i].equals(data))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        Object data = array[index];
        return (E) data;
    }

    @Override
    public int indexOf(E data) {
        if(data == null)
            return -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i].equals(data))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E data) {
        if(data == null)
            return -1;
        for(int i = array.length - 1; i >= 0; i--) {
            if(array[i].equals(data))
                return i;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        E data = (E) array[index];
        for(int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
        return data;
    }

    @Override
    public void trimToSize() {
        if(size < array.length)
        {
            Arrays.copyOf(array, size, Object[].class);
        }
    }

    @Override
    public String toString()
    {
        trimToSize();
        StringBuilder fin = new StringBuilder("[");
        for(int i = 0; i < size; i++)
        {
            if(i == size-1)
            {
                fin.append(array[i]).append("]");
                break;
            }
            fin.append(array[i]).append(", ");
        }
        return fin.toString();
    }

    public static void main(String[] args) {
        DynamicArray<String> array1 = new DynamicArray<>(10);
        array1.add("alpha");
        array1.add("bravo");
        array1.add("charlie");
        array1.remove(1);
        array1.remove(1);
        array1.remove(1);
    }
}