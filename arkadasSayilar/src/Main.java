public class Main {

    public static void main(String[] args) {
	    //220-284
        int number1=220;
        int number2=284;
        int total1=0;
        int total2=0;
        for(int i=1;i<number1;i++){
            if(number1%i==0){
                total1=i+total1;
            }
            if(number2%i==0){
                total2=i+total2;
            }
        }
        if(total1==number2 && total2==number1){
            System.out.println("Bu iki sayı arkadaş sayıdır .");
        }else{
            System.out.println("Bu iki sayı arkadaş sayı değildir .");
        }
    }
}
