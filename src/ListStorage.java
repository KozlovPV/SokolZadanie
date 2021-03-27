import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.concurrent.LinkedBlockingDeque;

public class ListStorage {
    ArrayList<Report> storage = new ArrayList<>();

    void clear() {
        storage.clear();
    }

    void save(Report r) {
        storage.add(r);
    }

    Report get(String uuid) {
        for (Report r : storage) {
            if (r.uuid.equals(uuid)) {
                return r;
            }
        }
        return null;
    }


    void delete(String uuid) {
        storage.remove(index(uuid));
    }

    private int index(String uuid) {
        Report report= new Report(uuid);
        //System.out.println(storage.indexOf(report));
        return storage.indexOf(report);
    }

    Report[] getAll() {
        Report[] timestorage = storage.toArray(new Report[0]);
        return timestorage;
    }

    int size() {
        return storage.size();
    }
}