import java.sql.Timestamp;

public class Person implements Comparable<Person> {
    private static int nextID = 0;
    private int id;
    Timestamp checkinTime;
    Catagories category;

    public Person(Timestamp checkinTime, Catagories category) {
        this.id = nextID++;
        this.checkinTime = checkinTime;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public Catagories getCategory() {
        return category;
    }

    @Override
    public int compareTo(Person other) {
        if (this.category.compareTo(other.category) != 0)
            return this.category.compareTo(other.category);
        return this.checkinTime.compareTo(other.checkinTime);
    }
}

