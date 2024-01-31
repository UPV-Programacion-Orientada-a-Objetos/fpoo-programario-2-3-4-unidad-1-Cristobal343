package edu.upvictoria.fpoo.Estructuras_selectivas.Problemas_Genericos;

import junit.framework.TestCase;

public class Min_Max_ValueTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testMIN_MAX_VALUE() {
        assertEquals(5, new Min_Max_Value().MIN_MAX_VALUE(5,1));
        assertEquals(10, new Min_Max_Value().MIN_MAX_VALUE(4,10));
        assertEquals(-2, new Min_Max_Value().MIN_MAX_VALUE(-8,-2));
        assertEquals(343, new Min_Max_Value().MIN_MAX_VALUE(258,343));
    }

    public void testIs_Max_to() {
        assertEquals(true, new Min_Max_Value().Is_Max_to(100,80));
        assertEquals(true, new Min_Max_Value().Is_Max_to(-99,-100));
        assertEquals(false, new Min_Max_Value().Is_Max_to(10,80));
        assertEquals(false, new Min_Max_Value().Is_Max_to(-999,-100));
    }
}