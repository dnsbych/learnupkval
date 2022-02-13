public class ArrayIndexStorage extends IndexStorage {

    int[] data;

    public ArrayIndexStorage(int[] dataIn) {
        super(dataIn.length);
        this.data = dataIn;
        //System.out.println(Arrays.toString(data));
    }

    @Override
    public int get(int index) {
        return data[index];
    }

    @Override
    protected int[] getData() {
        return data;
    }

}
