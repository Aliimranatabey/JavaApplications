public class Main {

    public static void main(String[] args) {
	    int number=6;
        int total=0;
        if(number<=1){
            System.out.print("Geçersiz Sayi");
            return;
        }
        for(int i=1;i<number;i++){
            int remainder=number%i;
            if(remainder==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println("Mükemmel Sayı");
        }else{
            System.out.print("Mükemmel Sayı Değildir");
        }
    }
}
