public class Main {

    public static void main(String[] args) {
	    ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="Tablorone";
        //ProductValidator productValidator=new ProductValidator();

        manager.add(product);
        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}
