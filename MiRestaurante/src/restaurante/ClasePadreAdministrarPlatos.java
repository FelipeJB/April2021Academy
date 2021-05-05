package restaurante;

public class ClasePadreAdministrarPlatos {

    public void AdministrarPlatos(){

        System.out.println(" ***************************");
        System.out.println(" - RESTAURANTE NUTRE BIEN!");
        System.out.println(" ***************************");
        System.out.println(" ");
        //Se declaran las variables que se necesitan
        ClaseHijaCrearPlato[] menu = new ClaseHijaCrearPlato[5];

        //Se itera la creación de objetos para las 5 recetas

        //Assing the data (initialize)
        menu[0] = new ClaseHijaCrearPlato();
        menu[0].name = "1. Fríjoles con pezuña";
        menu[0].description = "Deliciosa comida paisa con arroz pezuña y chicharron";
        menu[0].price = 5000;
        menu[0].fatFree = false;

        //menu[1] = new MenuItem();
        menu[1].name = "2. Sancocho de Res";
        menu[1].description = "Deliciosa comida paisa con gallina y aguacate";
        menu[1].price = 6000;
        menu[1].fatFree = false;

        //menu[2] = new MenuItem();
        menu[2].name = "3. Tortilla de papa";
        menu[2].description = "Deliciosa tortilla con papa huevo y especias";
        menu[2].price = 7000;
        menu[2].fatFree = true;

        //menu[3] = new MenuItem();
        menu[3].name = "4. Salmon ahumado";
        menu[3].description = "Delicioso Salmon ahumado con ensalada cesar";
        menu[3].price = 8000;
        menu[3].fatFree = true;

        //menu[4] = new MenuItem();
        menu[4].name = "5. Pechuga a la plancha";
        menu[4].description = "Pechuga con arroz, papa al vapor y ensalada";
        menu[4].price = 9000;
        menu[4].fatFree = false;

        //Se sobrescribe el vector en la posición 2;
        menu[2].name = "3. Plato Vegano";
        menu[2].description = "Ensalada Vegana";
        menu[2].price = 11000;
        menu[2].fatFree = true;

        System.out.println("La cantidad de platos del menú es: " + menu.length);
        System.out.println(" ");
        System.out.println("*****************************************");
        System.out.println("     LAS DELICIAS DE NUESTRO MENÚ");
        System.out.println("***************************************** ");
        System.out.println(" ");

        //Print out the menu
        for (int i = 0; i< menu.length; i++){
            menu[i].PrintPlato();
        }
    }
}
