package com.junit.test;

import com.junit.classes.CarList;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestList {
    CarList list;

    @Before
    public void initalizeLists(){
        list = new CarList();
        list.fillList("Fiat");
        list.fillList(null);
    }

    @Test
    public void checkIfNull(){
        assertNull(list.getItem(1));
    }
}
