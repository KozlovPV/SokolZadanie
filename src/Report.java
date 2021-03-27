/**
 * Модель отчета
 */
public class Report {

    // Уникальный идентификатор отчета
    String uuid;

    @Override
    public String toString() {
        return uuid;
    }

    public Report(String uuid) {
        this.uuid = uuid;
    }
    public Report() {

    }
}