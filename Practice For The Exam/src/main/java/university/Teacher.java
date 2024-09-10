package university;

public class Teacher {

    private int id;
    private String firstName;
    private String lastName;
    private String degree;
    private Coordination coordination;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, String degree, Coordination coordination) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
        this.coordination = coordination;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", degree='" + degree + '\'' +
                ", coordination=" + coordination +
                '}';
    }
}
