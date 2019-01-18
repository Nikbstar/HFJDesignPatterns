package ru.nik66.weather.data;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void getPage() throws IOException {
        Parser parser = new Parser();
        System.out.println(parser.getDatas());
    }

}