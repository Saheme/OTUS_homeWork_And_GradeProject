package lesson12;

import java.util.Objects;

public class Account {
    int gold;
    int count;

    public Account(int count, int gold) {
        this.count = count;
        this.gold = gold;
    }
    public Account(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return gold == account.gold && count == account.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gold, count);
    }
}
