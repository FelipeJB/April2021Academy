package restaurante;

public class ClaseHijaCrearPlato {
    String name;
    String description;
    double price;
    boolean fatFree;
    //Se crea el constructor de ClaseHijaCrearPlato
    public ClaseHijaCrearPlato(String name, String description, double price, boolean fatFree){
        this.name = name;
        this.description = description;
        this.price = price;
        this.fatFree = fatFree;


    }

    public void PrintPlato(){
        System.out.print("Plato: " +name +  "-- Descripción:  " + description + "-- Precio: $  " + price);
        if (fatFree){
            System.out.println(" - (Fat free)");
        }else {
            System.out.println(" ");
        }
        System.out.println("---------------------------------------");
    }



}
