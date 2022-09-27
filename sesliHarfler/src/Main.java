public class Main {

    public static void main(String[] args) {
        char harf = 'l';
        switch (harf) {
            case 'A':
            case 'a':
            case 'I':
            case 'ı':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                System.out.println("Kalın Sesli Harf");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println("Kalın Sesli Harf");
                break;
            default:System.out.println("Sessiz Harf");
        }

    }
}
