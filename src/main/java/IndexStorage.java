public class IndexStorage {

    protected int size = 0;

    public IndexStorage(int size) {
        this.size = size;
    }

    public int size() {
        if(size == 0){
            throw new IllegalArgumentException("Размер указан неправильно "+size);
        }
        return this.size;
    }

    public int get(int index) {
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("Неправильно указан индекс");
        }
        return index % 2 > 0 ? index : -index;
    }

    public int[] reverse() {
        int[] dataArr = new int[size];

        int i = 0;
        for (int el : getData()) {
            dataArr[size - ++i] = el;
        }

        return dataArr;
    }


    protected int[] getData() {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        return arr;
    }

}
