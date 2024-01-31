package edu.upvictoria.fpoo.Input;

import junit.framework.TestCase;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import edu.upvictoria.fpoo.Input.InputReader;
public class InputReaderTest extends TestCase {

    InputReader input = new InputReader();

    public void testReadInteger() throws Exception {
        assertEquals(1, input.ReadInteger("Ingresa un entero: "));
    }
}
