package com.junit.test;

import com.junit.classes.Person;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPerson {
    Person person;

    @Before
    public void TestPerson(){
        person = new Person("Jan", "Kowalski", 69);
    }

    @Test
    public void checkCredentials(){
        assertEquals(person.getName(),"Jan");
        assertEquals(person.getSurname(),"Kowalski");
        assertEquals(person.getAge(),69);
    }

    @Test
    public void checkIfNotNull(){
        assertNotNull(person);
    }

    @Test
    public void checkIfSameReference(){
        assertSame(person.getName(),person.getName());
    }
}
