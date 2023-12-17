package com.mimaraslan.crud;


import java.sql.ResultSet;
import java.sql.SQLException;

//SQL  -  INSERT   SELECT   UPDATE   DELETE
//JAVA -  CREATE   READ     UPDATE   DELETE
public class AppMain {
    static final String QUERY_SELECT_MUSTERI_ALL = "SELECT * FROM musteriler";
    static final String QUERY_SELECT_MUSTERI_ALL_BY_ID = "SELECT * FROM musteriler ORDER BY id";

    static final String QUERY_UPDATE_MUSTERI_BY_ID =
            "UPDATE musteriler " +
            "SET " +
            "adi      = 'Salih2', " +
            "soyadi   = 'Bilgin2', " +
            "bilet_no = '1112', " +
            "sehir    = 'Antalya2' " +
            "WHERE id = 4;";

    static final String QUERY_INSERT_NEW_MUSTERI =
            "INSERT INTO musteriler (adi, soyadi, bilet_no, sehir) " +
            "VALUES ('Buse', 'Odacı', '2000', 'Ankara');";

    static final String QUERY_DELETE_MUSTERI_BY_ID =
            "DELETE FROM musteriler " +
            "WHERE id = 2;";






    public static void main(String[] args) throws SQLException {

        MyCrud myCrud = new MyCrud();

        ResultSet resultSet = myCrud.findFromTableRecordAll(QUERY_SELECT_MUSTERI_ALL);


        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id") + " " +
                    resultSet.getString("adi") + " " +
                    resultSet.getString("soyadi") + " " +
                    resultSet.getString("bilet_no") + " " +
                    resultSet.getString("sehir") );
        }

        System.out.println("UPDATE--------------------------------");

        myCrud.updateFromTableOneRecord(QUERY_UPDATE_MUSTERI_BY_ID);

        System.out.println("DELETE--------------------------------");

        myCrud.deleteFromTableOneRecord(QUERY_DELETE_MUSTERI_BY_ID);

        System.out.println("INSERT--------------------------------");
        myCrud.addFromTableOneRecord(QUERY_INSERT_NEW_MUSTERI);
    }
}