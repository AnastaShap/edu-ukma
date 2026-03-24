package ua.university;

import java.util.*;

public class StudentRegistry {

    private final List<Student> students = new ArrayList<>();
    private final Set<String> emails = new HashSet<>();  // гаранує унікальність
    private final Map<String, Student> idMap = new HashMap<>();  // швидкий пошук O(1)

    public boolean addStudent(Student student){
        if (emails.contains(student.getEmail())) {
            return false; // дублі email відкидаються
        }
        students.add(student);
        emails.add(student.getEmail());
        idMap.put(student.getId(), student);
        return true;
    }

    public Student findById(String id){
        return idMap.get(id);
    }

    public boolean containsEmail(String email) {
        return emails.contains(email);
    }

    public boolean removeById(String id) {

        Student student = idMap.remove(id);
        if(student == null) return false;
        emails.remove(student.getEmail());
        students.remove(student);
        return true;


    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }
}


