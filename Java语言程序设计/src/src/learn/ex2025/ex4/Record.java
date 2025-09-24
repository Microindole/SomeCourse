package learn.ex2025.ex4;

public class Record {
    private String date;
    private String name;
    private String type;
    private String title;

    public Record(String date, String name, String type, String title) {
        this.date = date;
        this.name = name;
        this.type = type;
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "[" + date + "] " + name + " " + type + " \"" + title + "\"";
    }
}
