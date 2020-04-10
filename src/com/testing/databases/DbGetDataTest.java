package com.testing.databases;

import com.databases.DbEditStocksData;
import com.databases.DbGetData;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DbGetDataTest {
    @Test
    public void getStock() throws Exception{
        String[] data = new String[]{"TEST", "TestRo", "TES", "0.1", "0.1", "0.1", "2020-04-01"};
        String[] output = DbGetData.getStock("TEST");
        assertArrayEquals(data, output);
    }
}