public class Main {

    public static void main(String[] args) {
        char grade = 'N';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel :GEÇTİNİZ");
                break;
            case 'B':
                System.out.println("İyi :GEÇTİNİZ");
                break;
            case 'C':
                System.out.println("İdare Eder :GEÇTİNİZ");
                break;
            case 'D':
                System.out.println("Ih :GEÇTİNİZ");
                break;
            case 'F':
                System.out.println("GG Geçmiş Olsun Kaaanks : KALDINIZ");
                break;
            case 'M':
            case 'N':
                System.out.println("Deneme Aynı Degerler Tespiti !");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz !!! ");
        }
    }
}
