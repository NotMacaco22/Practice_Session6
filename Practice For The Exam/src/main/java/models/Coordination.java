package models;

import java.util.ArrayList;

public class Coordination {

    private int code;
    private String name;
    private ArrayList<Teacher> teachers;

    public Coordination() {
        this.teachers = new ArrayList<>();
    }
    public Coordination(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public ArrayList<Teacher> showTeachers() {
        return teachers;
    }

    @Override
    public String toString() {
        return "Coordination{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", teachers=" + teachers +
                '}';
    }
}
