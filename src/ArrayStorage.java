import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.SortedMap;


public class ArrayStorage {
    Report[] storage = new Report[10];

    void clear() {
        int i = 0;
        while (storage[i] != null) {
            storage[i] = null;
            i++;
        }
    }

    void save(Report r) {
        int i = 0;
        while (storage[i] != null) {
            i++;
        }
        storage[i] = r;
    }

    Report get(String uuid) {
        int i = 0;
        while (storage[i] != null) {
            if (uuid.equals(storage[i].toString())) {
                return storage[i];
            }
            i++;
        }
        return null;
    }

    void Change(int position) {
        position++;
        Report temp = storage[position];
        while (storage[position] != null) {
            //MainTestArrayStorage.printAll();
            storage[position - 1] = temp;
            position++;
            temp = storage[position];
        }
        storage[position - 1] = temp;
        position++;
        temp = storage[position];
    }

    void delete(String uuid) {
        int i = 0;
        while (storage[i] != null) {
            if (uuid.equals(storage[i].toString())) {
                storage[i] = null;
                Change(i);
            }
            i++;
        }
    }

    Report[] getAll() {
        int n = size();
        int i = 0;
        Report[] timeStorage = new Report[n];
        while (storage[i] != null) {
            timeStorage[i] = storage[i];
            i++;
        }
        return timeStorage;
    }

    int size() {
        int i = 0;
        while (storage[i] != null) {
            i++;
        }
        return i;
    }
}