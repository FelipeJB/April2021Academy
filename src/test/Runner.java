package test;

import data.Bank;
import data.Account;

import java.util.Scanner;

public class Runner {
    public Bank myBank;
    public static void main(String[] args) {
        Bank myBank = new Bank();
        initializeBank(myBank);



        System.out.println("Ingresar usuario ");
        Scanner scan = new Scanner(System.in);
        myBank.account1.name = scan.next();


        while (myBank.account1.exit == 0){
            System.out.println("Usuario "+ myBank.account1.name);
            System.out.println("Tu saldo actual "+ myBank.getMoney());
            System.out.println("Opciones: ");
            System.out.println("Tipea 1 para Deposito");
            System.out.println("Tipea 2 para Retiro");
            System.out.println("Tipea 3 para Terminar");

            myBank.account1.option = scan.nextInt();
            switch(myBank.account1.option) {
                case 1:
                    System.out.println("Ingrese monto a depositar");
                    myBank.account1.amount = scan.nextFloat();
                    myBank.getAdd(myBank.account1.amount);
                    System.out.println("Deposito exitoso\n");
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    myBank.account1.amount = scan.nextFloat();
                    if (myBank.account1.amount > myBank.getMoney()){
                        System.out.println("Saldo insuficiente\n");
                    }else{
                        myBank.getSub(myBank.account1.amount);
                        System.out.println("Retiro exitoso\n");
                    }
                    break;
                case 3:
                    System.out.println("Gracias por su Preferencia\n");
                    myBank.account1.exit=1;
                    break;
                default:
                    System.out.println("Opcion invalida\n");
            }
        }
    }

    public static void initializeBank(Bank bank){
        Account c1 = new Account();
        c1.name="";
        c1.amount=0;
        c1.exit=0;
        c1.option=0;
        bank.account1 = c1;



    }

}
