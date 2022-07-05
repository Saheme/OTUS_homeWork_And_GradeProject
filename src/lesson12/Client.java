package lesson12;

import java.util.Objects;

public class Client {
    String name;
    String dateOfBirth;
    int id;

    public Client() {
    }

    public Client(int id, String name, String dateOfBirth) {
        this.id=id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && Objects.equals(name, client.name) && Objects.equals(dateOfBirth, client.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, id);
    }
}
