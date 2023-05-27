public class MyList<T>{
    private int capacity;
    private int size;
    private T[] array;
    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
        this.size = 0;
    }


    private void expandArray() {
        capacity *= 2;
        T[] newArray = (T[]) new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }


    public void add(T data) {
        if (size == capacity) {
            expandArray();
        }
        array[size] = data;
        size++;
    }

    public int size(){
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Aradığınız bulunamadı.!");
            return null;
        }
        return array[index];
    }

    public boolean isEmpty(){
        if (size == 0){
            System.out.println("Dizi boştur");
            return true;
        }else System.out.println("Dizi doludur..");
        return true;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Aradığınız bulunamadı.!");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.print("Başarılı bir şekilde silindi : ");
        array[size - 1] = null;
        size--;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size-1; i >= 0; i--) {
            if (data.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public T set(int index, T data) {
        if (index < 0 || index >= size) {
            System.out.println("Aradığınız bulunamadı.!");
            return null;
        }
        T previousData = array[index];
        array[index] = data;
        return previousData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
