package university;

import java.util.ArrayList;

public class Faculty {

    private int id;
    private String building;
    private String facultyName;
    private ArrayList<Coordination> coordinations;

    public Faculty() {
        this.coordinations = new ArrayList<>();
    }

    public Faculty(String building, int id, String facultyName) {
        this.building = building;
        this.id = id;
        this.facultyName = facultyName;
        this.coordinations = new ArrayList<>();
    }

    public String getBuilding() {
        return building;
    }
    public void setBuilding(String building) {
        this.building = building;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

//    public void addCoordinations(int code, String name) {
//        Coordination coordination = new Coordination(code, name);
//        coordinations.add(coordination);
//
//    }

    public void addCoordination(Coordination coordination) {
        this.coordinations.add(coordination);
    }

    public ArrayList<Coordination> getCoordinations() {
        return coordinations;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "id=" + id +
                ", building='" + building + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", coordinations=" + coordinations +
                '}';
    }
}
