public class Main {

    public static void main(String[] args) {
        // BENIM COZUMUM
	    /*int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=5;
        for(int i=0;i<sayilar.length;i++){
            if(aranacak==sayilar[i]){
                System.out.println("Aranacak Sayı Bulundu !");
            }
        }*/
        //ENGIN DEMIROG COZUMU
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=5;
        boolean varMi=false;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı Mevcuttur !");
        }else {
            System.out.println("Sayı Mevcut Değildir !");
        }
    }
}
