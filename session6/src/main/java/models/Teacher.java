package models;

public class Teacher {

    private String lastName;
    private String id;
    private String firstName;
    private String degree;
    private Coordination coordination;

    public Teacher() {
    }

    public Teacher(String lastName, String id, String firstName, String degree) {
        this.lastName = lastName;
        this.id = id;
        this.firstName = firstName;
        this.degree = degree;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Coordination getCoordination() {
        return coordination;
    }

    public void setCoordination(Coordination coordination) {
        this.coordination = coordination;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", degree='" + degree + '\'' +
                ", coordination=" + coordination +
                '}';
    }
}
