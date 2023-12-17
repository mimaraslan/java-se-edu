package com.mimaraslan.select;

import java.sql.*;

public class MyPostgreSqlConnection {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            //  Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/postgres",
                    "postgres",
                    "123456789"
            );

            statement = connection.createStatement();
            //  resultSet = statement.executeQuery("SELECT * FROM musteriler WHERE bilet_no > '150' ");

            String sql1 = "SELECT * FROM musteriler WHERE adi = 'Banu' ";
            String sql2 = "SELECT * FROM musteriler WHERE bilet_no > '150' ";


            resultSet = statement.executeQuery(sql1);

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + " " +
                        resultSet.getString("adi") + " " +
                        resultSet.getString("soyadi") + " " +
                        resultSet.getString("bilet_no") + " " +
                        resultSet.getString("sehir") );
            }

        } catch (SQLException e) {
            System.out.println("Hata: " + e);
            throw new RuntimeException(e);
        } finally {
            if (resultSet != null || statement != null || connection != null) {
                try {
                    resultSet.close();
                    statement.close();
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}
