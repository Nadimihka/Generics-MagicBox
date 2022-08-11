import java.util.Random;
import java.lang.RuntimeException;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int maxItemsNum) {
        this.items = (T[]) new Object[maxItemsNum];
        //     this.items = new <T> [maxItemsNum];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println(i + " " + item);
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int num = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                num++;
            }
        }
        if (num != 0) {
            throw new RuntimeException("Коробка не заполнена, пустых ячеек " + num);
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}
