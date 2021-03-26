import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.SortedMap;

/**
 * Класс хранилища, в котором содержатся отчеты
 */
public class ArrayStorage {
    Report[] storage = new Report[10];

    //TODO: очищает хранилище
    void clear() {
        int i = 0;
        while (storage[i] != null) {
            storage[i] = null;
            i++;
        }
    }


    //TODO: сохраняет новый отчет (объект Report) в хранилище
    void save(Report r) {
        int i = 0;
        while (storage[i] != null) {
            i++;
        }
        storage[i] = r;
    }


    //TODO: возвращается отчет из хранилища
    Report get(String uuid) {
        int i = 0;
        while (storage[i] != null) {
            if (uuid.toString().equals(storage[i].toString())) {
                return storage[i];
            }
            i++;
        }
        return null;
    }


    //TODO: удаляет отчет из хранилища
    void delete(String uuid) {
        int i = 0;
        while (storage[i] != null) {
            if (uuid.toString().equals(storage[i].toString())) {
                storage[i] = null;
            }
            i++;
        }
    }


    //TODO: возвращает из хранилища все отчеты в виде массива

    /**
     * @return array, contains only Reports in storage (without null)
     */
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


    //TODO: возвращает количество отчетов в хранилище
    int size() {
        int i = 0;
        while (storage[i] != null) {
            i++;
        }
        return i;
    }
}