import models.Coordination;
import models.Faculty;
import models.Teacher;

public class Main {

    public static void main(String[] args) {

        Faculty facultyA = new Faculty("C", 101, "Engeneering Faculty");

        Coordination coordinationA = new Coordination(100, "Systems Engineering");
        Coordination coordinationB = new Coordination(110, "Testing");

        Teacher teacherA = new Teacher("Duran", "10101010", "Jose", "Software Engineer");
        Teacher teacherB = new Teacher("Silva", "22011275", "Cesar", " Student xdd");

        teacherA.setCoordination(coordinationA);
        teacherB.setCoordination(coordinationB);

        facultyA.addCoordination(coordinationA.getCode(), coordinationA.getCoordinationName());
        facultyA.addCoordination(coordinationB.getCode(), coordinationB.getCoordinationName());

        System.out.println("\n" + facultyA.toString());
        System.out.println("\n" + coordinationA.toString());
        System.out.println(coordinationB.toString());
        System.out.println("\n" + teacherA.toString());
        System.out.println(teacherB.toString());




    }

}
