package lesson12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
1 создаем класс bank в нем 2 map 1 (ключ Id клиента и сам клиент) 2 (ключ Id клиента + счет)  ; методы
   создать метод createClient(туда передавать имя, день рождения и он будет возращать созданного клиента )
   сщздать метод с accountom(передаю количество голды
2 после сделать 2 метода поиска 1 по аккаунту искать клиента (в аккаунте должна храниться id  клиента)
3 в классе client  то что есть + id
4 класс account количесто золотых монет и id клиента

 */
public class bank {
    public static void main(String[] args) {
        Client person1 = new Client("Иванов Иван", "20.08.1985");
        Client person2 = new Client("Петров Василий Ксенофонтович", "23.04.1992");
        Client person3 = new Client("Сидорова Драздраперма Кимовна", "10.10.1922");
        Map<Integer, Client> clients = new HashMap<>();
        clients.put(1, person1);
        clients.put(2, person2);
        clients.put(3, person3);
        for (Map.Entry<Integer, Client> entry : clients.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue().name + entry.getValue().dateOfBirth);
        }
        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();
        Map<Integer, List<Account>> accounts = new HashMap<>();
        accounts.put(1, Arrays.asList(new Account(698213, 10), new Account(859674, 15)));
        accounts.put(2, Arrays.asList(new Account(589321, 10), new Account(859781, 15), new Account(589936, 5)));
        accounts.put(3, Arrays.asList(new Account(692783, 10), new Account(587934, 15), new Account(479616, 5)));
        for (Map.Entry<Integer, List<Account>> entry : accounts.entrySet()) {
            System.out.println(entry.getKey());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println(entry.getValue().get(i).count + "\t " + entry.getValue().get(i).gold);

            }

        }
        Client a = findClient(clients, 3);
        System.out.println(a.name + a.dateOfBirth);

        List<Account> b = getAccounts(clients,accounts, 2);
        System.out.println();


    }

    static List<Account> getAccounts(Map<Integer, Client> clients, Map<Integer, List<Account>> accounts, Integer number) {

        return accounts.get(number);
    }

    static Client findClient(Map<Integer, Client> clients, Integer number) {
        return clients.get(number);
    }

}
