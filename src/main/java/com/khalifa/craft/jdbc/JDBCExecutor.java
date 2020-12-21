package com.khalifa.craft.jdbc;

import java.sql.*;

public class JDBCExecutor  {
    public static void main(String[] args) {
        DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost",
                "Craft_customer","root","123456789");
        try {
            Connection connection = dcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(1100);
            System.out.println(customer.getFirstName()+ " " + customer.getLastName() + " "+ customer.getEmail());
            customer.setEmail("ajenafilek@gmail.com");
            customer = customerDAO.update(customer);
            System.out.println(customer.getFirstName()+ " " + customer.getLastName() + " "+ customer.getEmail());
            /*Customer customer = new Customer();
            customer.setFirstName("Jhon");
            customer.setLastName("Adams");
            customer.setEmail("jadams@wh.gov");
            customer.setAddress("1234 SE AVE");
            customer.setCity("Arlington");
            customer.setState("VA");
            customer.setPhone("(555) 555-9845");
            customer.setZipCode("01234");

            Customer dbCustomer = customerDAO.create(customer);
            System.out.println(dbCustomer);
            dbCustomer = customerDAO.findById(dbCustomer.getId());
            System.out.println(dbCustomer);
            dbCustomer.setEmail("john.adams@wh.gov");
            dbCustomer = customerDAO.update(dbCustomer);
            System.out.println(dbCustomer);
            customerDAO.delete(dbCustomer.getId());*/
            /*Customer customer = customerDAO.findById(1101);
            System.out.println(customer.getFirstName()+ " " + customer.getLastName());*/
            /* This was used to create a customerCustomer customer = new Customer();
            customer.setFirstName("Khalifa");
            customer.setLastName("Shikur");
            customer.setEmail("Khalifa@gmail.com");
            customer.setPhone("123456789");
            customer.setAddress("1234 SE AVE");
            customer.setCity("WashingtonDC");
            customer.setState("DC");
            customer.setZipCode("12345");
            customerDAO.create(customer);*/
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
        /*Connection connection = dcm.getConnection();
        Statement  statement  = connection.createStatement();
            /*createStatement Creates a PreparedStatement object for sending parameterized SQL
             statements to the database.
             Statement is an interface and it extends Wrapper and AutoCloseable interfaces in it.
             it Executes the given SQL statement, which returns a single ResultSet object.
        ResultSet resultSet = statement.executeQuery("SELECT COUNT(*) AS Customer FROM Customer;");
        while (resultSet.next()){
        System.out.println(resultSet.getInt(1));*/

            /* ResultSet Moves the cursor forward one row from its current position. A ResultSet cursor is initially
             positioned before the first row; the first call to the method next makes the first row the
             current row; the second call makes the second row the current row, and so on...
             When a call to the next method returns false, the cursor is positioned after the last row.
             Any invocation of a ResultSet method which requires a current row will result in
             a SQLException being thrown. If the result set type is TYPE_FORWARD_ONLY, it is vendor specified
             whether their JDBC driver implementation will return false or throw an SQLException on a subsequent
             call to next..*/
