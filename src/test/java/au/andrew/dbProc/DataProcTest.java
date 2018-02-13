package au.andrew.dbProc;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class DataProcTest {

    private static DataProc dataProc;

    @BeforeClass
    public static void beforeClass(){
        dataProc = new DataProc();
    }

    @AfterClass
    public static void afterClass(){
        dataProc = null;
    }

    @Test
    public void getData() throws SQLException {
        ResultSet resultSet = dataProc.getData("Select team1, team2 from matches;");
        while (resultSet.next()){
            assertFalse(resultSet.getString(1).equals(""));
        }
    }
}