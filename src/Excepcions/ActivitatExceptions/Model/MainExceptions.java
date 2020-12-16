package Excepcions.ActivitatExceptions.Model;

import Excepcions.ActivitatExceptions.Control.OperacionsBanc;
import Excepcions.ActivitatExceptions.Exceptions.BankAccountException;
import Excepcions.ActivitatExceptions.Exceptions.ClientAccountException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainExceptions {
    public static void main(String[] args) throws Exception {
        CompteEstalvi compteEstalvi1 = new CompteEstalvi("1234");
        CompteEstalvi compteEstalvi2 = new CompteEstalvi("4321");
        CompteEstalvi compteEstalvi3 = new CompteEstalvi("5678");
        compteEstalvi1.ingressar(200000);
        compteEstalvi2.ingressar(1000);
        Client client1 = null;
        List<CompteEstalvi> comptes = new ArrayList<>(Arrays.asList(compteEstalvi1,compteEstalvi2));
        LlistaDeComptes.llistaDeComptes.addAll(comptes);

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
        //System.out.println(compteEstalvi2.getSaldo());

        //Comprobación de la excepción de cuenta inexistente
        try{
            OperacionsBanc.transferMoney(compteEstalvi1,compteEstalvi3,100);
        }catch (BankAccountException e){
            e.printStackTrace();
        }

        //Comprobación de la excepción de cuenta al descubierto
        try{
            compteEstalvi2.treure(5000);
        } catch (BankAccountException e){
            e.printStackTrace();
        }
    }
}
