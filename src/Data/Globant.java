package Data;

import java.util.ArrayList;
import java.util.List;

public class Globant {
    public ArrayList<Position> positions;

    public Globant(){
        this.positions = new ArrayList<Position>();
    }

    public ArrayList<Position> getPositions() {
        return positions;
    }

    public void setPositions(ArrayList<Position> positions) {
        this.positions = positions;
    }

    public void addPosition(Position pPosition){
        positions.add(pPosition);
    }

    public void displayPosition(){
        for(int i = 0; i < positions.size(); i++){
            System.out.println("Nombre es: " + positions.get(i).getName());
            System.out.println("Salario es: " + positions.get(i).getSalary());
            System.out.println("Esta en un proyecto?: " + positions.get(i).isInAProject());
            System.out.println("Posicion: " + positions.get(i).getClass().getSimpleName());
            System.out.println("Estudio: " + positions.get(i).getStudioName());
            positions.get(i).getResponsabilities(positions.get(i).getStudioName());
            System.out.println("*******************************************");
        }
    }
    }

