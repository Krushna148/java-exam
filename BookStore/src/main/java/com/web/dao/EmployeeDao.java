
package com.web.dao;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.web.model.Books;

public class EmployeeDao {

    public int registerEmployee(Books book) throws ClassNotFoundException, SQLException {
        String insert = "INSERT INTO book" +
            "  (bookid, bookname, authorname, publisher) VALUES " +
            " ( ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

         Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/krushna?useSSL=false", "root", "root");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(insert); 
            //preparedStatement.setInt(1, 1);
            preparedStatement.setString(1, book.getBookID());
            preparedStatement.setString(2, book.getBookName());
            preparedStatement.setString(3, book.getAuthorName());
            preparedStatement.setString(4, book.getPublisher());
          

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();
            


        return result;
            
    }

 
}


