package com.mimaraslan.crud;

import java.sql.*;

public class MyCrud {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    static final String DB_DRIVER_CLASS_NAME = "org.postgresql.Driver";
    static final String DB_HOSTNAME_IP = "127.0.0.1";
    static final String DB_PORT = "5432";
    static final String DB_NAME = "postgres";

//  static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String DB_URL = "jdbc:postgresql://"+DB_HOSTNAME_IP+":"+DB_PORT+"/"+DB_NAME+"";
    static final String DB_USER = "postgres";
    static final String DB_PASSWORD = "123456789";



    private boolean openConnection(){
        try {
            Class.forName(DB_DRIVER_CLASS_NAME);
            connection = DriverManager.getConnection(
                    DB_URL,
                    DB_USER,
                    DB_PASSWORD);
            return true;
        } catch (SQLException e) {
            System.out.println("Hata: "+ e);
            return false;
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    private boolean closeConnection(){
            try {
                if (!connection.isClosed() )
                    connection.close();
                return true;
            } catch (Exception e) {
                System.out.println("Hata: "+ e);
                 return false;
        }
    }


    // READ (SELECT)
    ResultSet findFromTableRecordAll(String sql) throws SQLException {

        if (openConnection()){
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

           if(closeConnection()){
               System.out.println("Bağlantı kapatıldı.");
           }

            return resultSet;

        } else {
            System.out.println("Bağlantı kapalı.");
            return null;
        }
    }

    // UPDATE
    void updateFromTableOneRecord(String sql) throws SQLException {
        if (openConnection()){
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if(closeConnection()){
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }
    }


    // DELETE
    String deleteFromTableOneRecord(String sql) throws SQLException {
        if (openConnection()){
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if(closeConnection()){
                System.out.println("Bağlantı kapatıldı.");
            }

            return "Kayıt silindi.";
        } else {
            System.out.println("Bağlantı kapalı.");
            return "Kayıt silinmedi.";
        }
    }


    // INSERT
    void addFromTableOneRecord(String sql) throws SQLException {
        if (openConnection()){
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            if(closeConnection()){
                System.out.println("Bağlantı kapatıldı.");
            }

        } else {
            System.out.println("Bağlantı kapalı.");
        }
    }

}
