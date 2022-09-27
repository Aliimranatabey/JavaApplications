import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList sayilar=new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());//dizinin boyutunu verir
        //sayilar.set(2,100);//2.indisin değerini 100 yapar
        //sayilar.remove(0);//0.indisi siler
        //sayilar.clear();//sayilar listesini temizler
        //System.out.println(sayilar.get(0));//0.indisi yazdırır
        for(Object i:sayilar){
            System.out.println(i);
        }
    }
}
