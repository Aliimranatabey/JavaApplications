public class Main {

    public static void main(String[] args) {
        Product product=new Product(2,"Laptop2","HP Laptop",6000,5,"siyah");

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
