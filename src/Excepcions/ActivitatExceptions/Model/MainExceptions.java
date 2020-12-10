package Excepcions.ActivitatExceptions.Model;

import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;

public class MainExceptions {
    public static void main(String[] args) throws Exception {
        CompteEstalvi compteEstalvi1 = new CompteEstalvi("1234");
        CompteEstalvi compteEstalvi2 = new CompteEstalvi("4321");
        compteEstalvi1.ingressar(200000);
        compteEstalvi2.ingressar(1000);
        Client client1 = null;

        //Comprobación de la excepción de DNI erróneo
        try {
        client1 = new Client("Antonio", "Tomás", "776523437V");
        } catch (ClientAccountException e){
            e.printStackTrace();
        }

        //Comprobación de la excepción de cuenta sin usuarios
        try {
            compteEstalvi1.addUser(client1);
            System.out.println(compteEstalvi1.getLlista_usuaris());
            compteEstalvi1.removeUser("77722537V");
            System.out.println(compteEstalvi1.getLlista_usuaris());
        } catch (BankAccountException e) {
            e.printStackTrace();
        }

        //Comprobación de la excepción de transferencia errónea
        try{
            OperacionsBanc.transferMoney(compteEstalvi1,compteEstalvi2,1000000);
        }catch (BankAccountException e){
            e.printStackTrace();
        }
        System.out.println(compteEstalvi2.getSaldo());

        //Comprobación de la excepción de cuenta al descubierto
        try{
            compteEstalvi2.treure(5000);
        } catch (BankAccountException e){
            e.printStackTrace();
        }
    }
}
