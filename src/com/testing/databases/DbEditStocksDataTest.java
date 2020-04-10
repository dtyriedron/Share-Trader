package com.testing.databases;

import com.databases.DbEditStocksData;
import com.databases.DbGetData;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

public class DbEditStocksDataTest {
    @Test
    public void editStocksData() throws Exception{
        String[] row = DbGetData.getStock("TEST");
        row[2] = "TES";
        DbEditStocksData.update(row);
        String[] data = DbGetData.getStock("TEST");
        System.out.println(Arrays.toString(data));
        assertArrayEquals(data, row);
    }
}