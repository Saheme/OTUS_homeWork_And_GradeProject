package lesson12;


import java.util.*;

public class bank {
    public static void main(String[] args) {
        Client person1 = new Client(1, "Иванов Иван", "20.08.1985");
        Client person2 = new Client(2, "Петров Василий Ксенофонтович", "23.04.1992");
        Client person3 = new Client(3, "Сидорова Драздраперма Кимовна", "10.10.1922");

        Map<Client, List<Account>> exz = new HashMap<>();
        exz.put(person1, Arrays.asList(new Account(698213, 10), new Account(859674, 15)));
        exz.put(person2, Arrays.asList(new Account(589321, 10), new Account(859781, 15), new Account(589936, 5)));
        exz.put(person3, Arrays.asList(new Account(692783, 10), new Account(587934, 15), new Account(479616, 5)));
        for (Map.Entry<Client, List<Account>> entry : exz.entrySet())
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println(entry.getKey().name + "\t" + entry.getValue().get(i).count + " " + entry.getValue().get(i).gold);
            }
        System.out.println();

        Client findClient = findClient(exz, new Account(698213, 10));
        if (findClient != null) {
            System.out.println(findClient.name + " " + findClient.dateOfBirth);
        } else {

        }


        List<Account> valueAccount = getAccounts(exz, person2);
        for (int i = 0; i < valueAccount.size(); i++)
            System.out.println(valueAccount.get(i).count + " \t" + valueAccount.get(i).gold);


    }
    static List<Account> getAccounts(Map<Client, List<Account>> exz, Client persons) {

        return exz.get(persons);
    }


    static Client findClient(Map<Client, List<Account>> exz, Account account) {
        for (Map.Entry<Client, List<Account>> entry : exz.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {

                if (entry.getValue().get(i).equals(account)) {

                    return entry.getKey();
                }

            }
        }
        return null;
    }


    public static void notPerson() {
        System.out.println("Этого человека нет в  базе");
    }
}







   /* static Client findClient(Map<Client, List<Account>> exz, Account account) {
        Client person = new Client();
        for (Map.Entry<Client, List<Account>> entry : exz.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {

                if (entry.getValue().get(i).equals(account)) {

                    return entry.getKey();
                }else if (person.name == null && person.dateOfBirth == null) {
                    notPerson();
                    return person;
                }
            }
        }
        return null;
    }
*/



    /*static Client findClient(Map<Client, List<Account>> exz, Account account) {
        for (Map.Entry<Client, List<Account>> entry : exz.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {

                if (entry.getValue().get(i).equals(account)) {

                    return entry.getKey();
                }
            }
        }
        return null;
    }
}*/

/*
    static Client findClient(Map<Client, List<Account>> exz, Account account) {   // вариант с урока
        for (Map.Entry<Client, List<Account>> entry : exz.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {

                if (entry.getValue().get(i).equals(account)) {

                    return entry.getKey();
                }
            }
        }

        notPerson();
        Client person = new Client();
        return person;
    }*/


  /*  Client person = new Client();
                if (person.name == null | person.dateOfBirth == null) {
                    person.name = "";
                    person.dateOfBirth = "";
                    notPerson();*/