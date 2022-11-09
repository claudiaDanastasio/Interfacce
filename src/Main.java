import it.ibm.interfacce.domain.Animal;
import it.ibm.interfacce.domain.DbProgrammerRepository;
import it.ibm.interfacce.domain.Programmer;
import it.ibm.interfacce.domain.ProgrammerRepository;

public class Main {
    public static void main(String[] args) {

        //Programmer.minSalary = 2000;
        System.out.println(Math.PI);
        Programmer p = new Programmer("PHP", "Java");
        p.writeCode();
        Programmer.incrementMinSalary(800);
        //Main x = new Main;
        //x.f();
        Main.f();
        ProgrammerRepository pr = new DbProgrammerRepository();
        
    }

    public static void healAnimal(Animal a){
        a.move();
        a.eat();
    }

    public static void f(){}

    public static void startApplications(ProgrammerRepository pr){
        Programmer s = new Programmer("Java", "Python");
        pr.saveProgrammer(s);
        Programmer f = pr.findById(100);

    }
}