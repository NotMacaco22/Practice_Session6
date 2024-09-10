import university.Coordination;
import university.Faculty;
import university.Teacher;

public class Main {

    public static void main (String[] args){
        Faculty fia = new Faculty();

        fia.setId(01);
        fia.setBuilding("O");
        fia.setFacultyName("FIA");

        Coordination sis = new Coordination();
        sis.setCode(100);
        sis.setName("Systems Engineering");

        Coordination ind = new Coordination();
        ind.setCode(110);
        ind.setName("Industrial Engineering");

//        fia.addCoordinations(sis.getCode(),sis.getName());
//        fia.addCoordinations(ind.getCode(),ind.getName());

        fia.addCoordination(sis);
        fia.addCoordination(ind);

        Teacher duran  = new Teacher();
        duran.setId(10101010);
        duran.setFirstName("Jose");
        duran.setLastName("Duran");
        duran.setDegree("Systems Engineer");
        duran.setCoordination(sis);

        Teacher elias  = new Teacher();
        elias.setId(23020364);
        elias.setFirstName("Elias");
        elias.setLastName("Perez");
        elias.setDegree("Industrial Engineer");
        elias.setCoordination(ind);

        for (Coordination c : fia.getCoordinations()) {
            System.out.println(c.getCode() + " " + c.getName());
        }

        System.out.println("~~~~~~");
        sis.addTeacher(duran);
        sis.addTeacher(elias);

        for (Teacher teacher: sis.showTeachers()){
            System.out.println(teacher.getFirstName() + " " + teacher.getLastName());
        }

    }


}
