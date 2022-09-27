import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    String mesaj="Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman Sayısı : "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println("Mesaj 'B' harfi ile mi başlıyor ? "+mesaj.startsWith("B"));
        System.out.println("Mesaj 'b' harfi ile mi başlıyor ? "+mesaj.startsWith("b"));
        System.out.println("Mesaj '.' karakteri ile mi bitiyor ? "+mesaj.endsWith("."));
        System.out.println("Mesaj 'l' harfi ile mi başlıyor ? "+mesaj.endsWith("l"));
        char[] karakterler=new char[5];
        mesaj.getChars(0,5,karakterler,0);//mesaj içeriğinin 0 dan 5. karaktere kadar olan bölümünü karakterler dizinine 0.elemandan başlayarak atar
        System.out.println(karakterler);
        System.out.println("'av' metni mesajın kaçıncı harfinde başlıyor ? "+mesaj.indexOf("av")); //'a' karakterini baştan kaçıncı sırada olduğunu bulur ,baştan başlıyarak sayar
        System.out.println("'a' harfi mesajın sondan kaçıncı harfinde başlıyor ? "+mesaj.lastIndexOf("a"));// 'a' karakterini sondan kaçıncı sırada olduğunu bulur ama baştan başlıyarak sayar

        //---------------------------------------------------------------------------------------------------------

        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println("REPLACE FONKSİYONU SONUÇ = "+yeniMesaj);
        System.out.println("SUBSTRİNG FONKSİYONU SONUÇ = "+mesaj.substring(2,5));//5.karakter dahil değildir !

        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        String ymesaj="           Bugün HAVA çok Güjel            ";
        System.out.println("toLowerCase FONKSİYONU SONUÇ = "+mesaj.toLowerCase());
        System.out.println("toUpperCase FONKSİYONU SONUÇ = "+mesaj.toUpperCase());
        System.out.println("trim FONKSİYONU SONUÇ 'Dikkat! ymesaj değişkeni için' = "+ymesaj.trim());

    }
}
