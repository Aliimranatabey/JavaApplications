import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] sayilar= {5,1,4,2,3,88,9};
        int enkInd,n=sayilar.length;
        int enk,temp;
        for(int i=0;i<n;i++) {
            enk=sayilar[i];
            enkInd=i;
            for(int j=1;j<=n;j++) {
                if(sayilar[j]<=enk) {
                    enk=sayilar[j];
                    enkInd=j;
                }

            }
            temp=sayilar[i];
            sayilar[i]=sayilar[enkInd];
            sayilar[enkInd]=temp;

        }

        for(int i=0;i<n;i++) {
            System.out.println(sayilar[i]+" ");
        }
    }
}
