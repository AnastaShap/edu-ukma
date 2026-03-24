package ua.university;

import java.util.Objects;

public class Student{
    private final String id;
    private final String name;
    private final String email;

    public Student(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return name + " (" + id + ", " + email + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Student)) return false;
        Student s = (Student)obj;

        return Objects.equals(id, s.id);

    }
    @Override
    public int hashCode() {
        return Objects.hash(id); // хеш теж базується на айді
    }

}
