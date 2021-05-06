package test;

import data.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        List<Glober> globers = new ArrayList<>();

        Junior junior = new Junior(300, true, "Sebas", "Java Basic");
        SemiSenior semiSenior = new SemiSenior(500, false,"Charly", "Dani");
        Senior senior = new Senior(800, true, "Pachi", "QA fundation");
        TeachLead teachLead = new TeachLead(1200, true, "Romi", "Cards");

        globers.add(junior);
        globers.add(semiSenior);
        globers.add(senior);
        globers.add(teachLead);

        for (int i = 0; i < globers.size(); i++) {
            System.out.println("El salario del glober es: "+ globers.get(i).setSalary());
            System.out.println("El glober está asignado a un proyecto: "+ globers.get(i).setProject());
        }

    }
}
