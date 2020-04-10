package com.testing.databases;

import com.databases.DbEditRow;
import com.databases.DbGetData;
import org.junit.Test;

import static org.junit.Assert.*;

public class DbEditRowTest {
    @Test
    public void editDbRow() throws Exception{
        DbEditRow.updateRowsUserWatch("jn", "SNAP");
        String getWatched = DbGetData.getStockWithWatched("SNAP")[7];
        assertTrue(getWatched.contains("jn"));
    }
}