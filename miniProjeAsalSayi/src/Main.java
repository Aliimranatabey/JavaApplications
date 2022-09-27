public class Main {

    public static void main(String[] args) {

        //BENIM COZUMUM

        int number=25;
        int sayac=0;
        for(int i=2;i<number;i++){
            int remainder=number%i;

            if(remainder==0){
                sayac=sayac+1;
            }
        }
        if(number>=2){
        if(sayac>=1){
            System.out.println("Sayı Asal Değildir !");
        }else {
            System.out.println("Sayı Asaldır !");
        }}else {
            System.out.println("Sayı Asal Değildir !");
        }

        //ENGIN DEMIROG COZUMU

        /*int number=2;
        boolean isPrime=true;
        if(number==1){
            System.out.println("Sayı Asal Değildir !");
            return;
        }
        if(number<1){
            System.out.println("Geçersiz Sayı");
            return;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
            }
        }
        if(isPrime) {
            System.out.print("Sayı Asaldır !");
        }else{
            System.out.println("Sayı Asal Değildir");
        }*/
    }
}
