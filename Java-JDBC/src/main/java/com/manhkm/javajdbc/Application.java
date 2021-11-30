package com.manhkm.javajdbc;

import com.manhkm.javajdbc.entity.Student;

import java.sql.*;
import java.util.ArrayList;

/**
 * @author ManhKM on 11/30/2021
 * @project Java-JDBC
 * Note: Connection -> Statement -> ResultSet
 *
 */
public class Application {
    public static ArrayList<Student> listStudent = new ArrayList<>();
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/example";
        String user = "root";
        String pass = "12345678aA";

        try{
            // create connection:
            Connection connection = DriverManager.getConnection(url, user, pass);
            if(connection != null){
                System.out.println("Connected MySQL Database.");
            }
            // create statement:
            Statement statement = connection.createStatement();

            // create ResultSet
            ResultSet rs = statement.executeQuery("SELECT * FROM students");
            while(rs.next()){
                String id = rs.getString("id");
                String name = rs.getString("name");
                String code = rs.getString("code");
                String date_of_birth = rs.getString("date_of_birth");
                String email = rs.getString("email");
                String class_id = rs.getString("class_id");

                listStudent.add(new Student(id, name, code, date_of_birth, email, class_id));
            }

            /**
             * insert data in table student:
             */
            String insert = "INSERT INTO Students (name,code,date_of_birth,email,class_id) VALUES (?,?,?,?,?)";
            PreparedStatement statementInsert = connection.prepareStatement(insert);

            statementInsert.setString(1, "Vũ Trung Hiếu");
            statementInsert.setString(2, "15021");
            statementInsert.setString(3, "2021-11-30 08:47:08");
            statementInsert.setString(4, "hieuvt@gmail.com");
            statementInsert.setString(5, "2");

            int rowInserted = statementInsert.executeUpdate();
            if(rowInserted > 0){
                System.out.println("A new Student was inserted successfully!");
            }

            /**
             * Execute Update Statement:
             *
             */
            String update = "UPDATE Students SET name=?, code=?, date_of_birth=?, email=?, class_id=? WHERE id=?";
            PreparedStatement statementUpdate = connection.prepareStatement(update);
            statementUpdate.setString(1, "Khổng Minh Mạnh");
            statementUpdate.setString(2, "15020083");
            statementUpdate.setString(3, "1996-04-30 08:47:08");
            statementUpdate.setString(4, "manhkm@neo.vn");
            statementUpdate.setString(5, "1");
            statementUpdate.setString(6, "5");

            if(statementUpdate.executeUpdate() > 0){
                System.out.println("An existing Student was updated successfully!");
            }

            /**
             * Execute DELETE Statement
             */
            String delete = "DELETE FROM Students WHERE id=?";
            PreparedStatement statementDelete = connection.prepareStatement(delete);
            statementDelete.setString(1, "1");

            if (statementDelete.executeUpdate() > 0){
                System.out.println("A Student was deleted successfully! ");
            }


            connection.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

        showData();
    }

    public static void showData(){
        for (Student s : listStudent) {
            System.out.println(s.toString());
        }
    }
}
