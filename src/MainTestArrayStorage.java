/**
 * Тестовый класс для проверки реализации ArrayStorage
 */
public class MainTestArrayStorage {
    static final ListStorage ARRAY_STORAGE = new ListStorage();

    public static void main(String[] args) {
        Report r1 = new Report();
        r1.uuid = "uuid1";
        Report r2 = new Report();
        r2.uuid = "uuid2";
        Report r3 = new Report();
        r3.uuid = "uuid3";

        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.uuid));
        System.out.println("Size: " + ARRAY_STORAGE.size());

        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));

        printAll();

        ARRAY_STORAGE.delete(r1.uuid);

        printAll();

        ARRAY_STORAGE.clear();

        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Report r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);
        }
    }
} 