package questions.chapter15.questions.q11;

public class Q11 {

    /*

    11. Suppose we have a JDBC program that calls a stored procedure, which returns a set of
results. Which is the correct order in which to close database resources for this call?
A. Connection, ResultSet, CallableStatement
B. Connection, CallableStatement, ResultSet
C. ResultSet, Connection, CallableStatement
++D. ResultSet, CallableStatement, Connection
E. CallableStatement, Connection, ResultSet
F. CallableStatement, ResultSet, Connection


     */
/**
 * Resourcaları actıgımız sıranın tam tersinden kapatırız
 * bundan dolatı Once resultSet ,sonra CallableStatement ensonda Connection kapatılır
 *
 * */

}
