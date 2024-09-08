package models;

import com.sun.jdi.ArrayReference;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Faculty {

    private String building;
    private int id;
    private String facultyName;
    private ArrayList<Coordination> coordinations;

    public Faculty() {
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
    public int getId() {
        return id;
    }
    public String getFacultyName() {
        return facultyName;
    }

    public void addCoordination(int code, String coordinationName){
        Coordination coordination = new Coordination(code, coordinationName);
        coordinations.add(coordination);
    }

    public ArrayList<Coordination> getCoordinations() {
        return coordinations;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "building='" + building + '\'' +
                ", id=" + id +
                ", facultyName='" + facultyName + '\'' +
                ", coordinations=" + coordinations +
                '}';
    }
}


