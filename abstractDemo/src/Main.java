public class Main {

    public static void main(String[] args) {
	    CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        CustomerManager customerManager3=new CustomerManager();
        customerManager.databaseManager=new SqlServerDatabaseManager();
        customerManager2.databaseManager=new MySqlDatabaseManager();
        customerManager3.databaseManager=new OracleDatabaseManager();
        customerManager.getCustomers();
        customerManager2.getCustomers();
        customerManager3.getCustomers();
    }
}
