import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StorageTest {

    @Test
    public void checkSize1()
    {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * i*10);
        }
        IndexStorage st = new ArrayIndexStorage(arr);

        int expected = 50;
        int actual = st.size();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkSize2()
    {
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * i*10);
        }
        IndexStorage st = new ArrayIndexStorage(arr);

        int expected = 500;
        int actual = st.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGet1()
    {
        IndexStorage st = new IndexStorage(50);

        int expected = -2;
        int actual = st.get(2);

        Assertions.assertEquals(expected, actual);
    }

}
