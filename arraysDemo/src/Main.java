public class Main {

    public static void main(String[] args) {
        System.out.println("KÖTÜ KOD\n");
        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("----------------------");
        System.out.println("İDARE KOD\n");
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("----------------------");
        System.out.println("İYİ KOD \n");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
