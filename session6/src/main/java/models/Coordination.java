package models;

public class Coordination {

    private int code;
    private String coordinationName;

    public Coordination() {
    }

    public Coordination(int code, String coordinationName) {
        this.code = code;
        this.coordinationName = coordinationName;
    }

    public int getCode() {
        return code;
    }

    public String getCoordinationName() {
        return coordinationName;
    }

    @Override
    public String toString() {
        return "Coordination{" +
                "code=" + code +
                ", coordinationName='" + coordinationName + '\'' +
                '}';
    }
}

