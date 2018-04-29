package sample.interfaces;

import sample.objects.Person;

public interface Addressbook {

    // добавить запись
    void add(Person person);

    // внести измененные значения (подтвердить измененные данные)
    void update(Person person);

    // удалить запись
    void delete(Person person);

}
