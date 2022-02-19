import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StorageTest {

    @Test
    public void checkSize1() {
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * i * 10);
        }
        IndexStorage st = new ArrayIndexStorage(arr);

        int expected = 50;
        int actual = st.size();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void checkSize2() {
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * i * 10);
        }
        IndexStorage st = new ArrayIndexStorage(arr);

        int expected = 500;
        int actual = st.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGet1() {
        IndexStorage st = new IndexStorage(50);

        int expected = -2;
        int actual = st.get(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGet2() {
        IndexStorage st = new IndexStorage(50);

        int expected = 1;
        int actual = st.get(1);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkEGet1() {
        IndexStorage st = new IndexStorage(50);

        Throwable exception = org.junit.jupiter.api.Assertions
                .assertThrows(IndexOutOfBoundsException.class, () -> st.get(50));

        Assertions.assertEquals("Неправильно указан индекс", exception.getMessage());
    }

    @Test
    public void checkEGet2() {
        IndexStorage st = new IndexStorage(50);

        Throwable exception = org.junit.jupiter.api.Assertions
                .assertThrows(IndexOutOfBoundsException.class, () -> st.get(-1));

        Assertions.assertEquals("Неправильно указан индекс", exception.getMessage());
    }


    @Test
    public void checkISSize1() {
        IndexStorage st = new IndexStorage(50);

        int expected = 50;
        int actual = st.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkISSize2() {
        IndexStorage st = new IndexStorage(0);

        Throwable exception = org.junit.jupiter.api.Assertions
                .assertThrows(IllegalArgumentException.class, () -> st.size());

        Assertions.assertEquals("Размер указан неправильно 0", exception.getMessage());
    }

    @Test
    public void checkReverse() {
        IndexStorage st = new IndexStorage(50); // [0,1,2,3,4,5..49]

        // Сравним первый элемент
        int expected = 49;
        int actual = st.reverse()[0]; // [49,48,47,46,45..0]

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkGetData() {
        IndexStorage st = new IndexStorage(50); // [0,1,2,3,4,5..49]

        // Сравним первый элемент
        int expected = 1;
        int actual = st.getData()[1];

        Assertions.assertEquals(expected, actual);
    }

}
