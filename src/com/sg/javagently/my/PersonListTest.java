package com.sg.javagently.my;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonListTest {

    @Test
    public void test_find() {
        PersonList list = new PersonList(new PersonList.Node(new Person("Sandro", "Gargano"), null));
        Person p = list.findElement("Sandro");
        assertNotNull(p);
        assertEquals(p.nome, "Sandro");
        assertEquals(2, list.size());
    }

    @Test
    public void test_addLast() {
        PersonList list = new PersonList(new PersonList.Node(new Person("Sandro", "Gargano"), null));
        list.addLast(new Person("Andrea", "Ruggieri"));
        assertEquals(2, list.size());

        list.addLast(new Person("Ermal", "Aliraj"));
        assertEquals(3, list.size());
    }

    @Test
    public void test_removeElement_inTheMiddle() {
        PersonList list = new PersonList(new PersonList.Node(new Person("Sandro", "Gargano"), null));
        list.addLast(new Person("Andrea", "Ruggieri"));
        list.addLast(new Person("Ermal", "Aliraj"));

        list.removeElement("Andrea");
        assertEquals(2, list.size());
    }

    @Test
    public void test_removeElement_last() {
        PersonList list = new PersonList(new PersonList.Node(new Person("Sandro", "Gargano"), null));
        list.addLast(new Person("Andrea", "Ruggieri"));
        list.addLast(new Person("Ermal", "Aliraj"));

        list.removeElement("Ermal");
        assertEquals(2, list.size());
    }

    @Test
    public void test_removeElement_top() {
        PersonList list = new PersonList(new PersonList.Node(new Person("Sandro", "Gargano"), null));
        list.addLast(new Person("Andrea", "Ruggieri"));
        list.addLast(new Person("Ermal", "Aliraj"));

        list.removeElement("Sandro");
        assertEquals(2, list.size());
    }
}
