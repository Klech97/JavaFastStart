package HW;

public class lessontwo {
    public static void main(String[] args) {
       /* int[] onem = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i<onem.length; i++){
            if(onem[i]==0){
                onem[i]=1;
            }else if(onem[i]==1){
                onem[i]=0;
            }
            System.out.println(onem[i]);
        }
        System.out.println();

        int[] twom = new int[8];

        for (int i = 0; i<twom.length; i++){
            if (i==0){
                twom[i]=0;
            }else{
                twom[i]=twom[i-1]+3;
            }
            System.out.println(twom[i]);
        }

        System.out.println();

        int[] threem = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i<threem.length; i++){
            if(threem[i]<6){
                threem[i]=threem[i]*2;
            }
            System.out.println(threem[i]);
        }

        System.out.println();
        int[][] table = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j) {
                    table[i][j] = 1;
                }else{
                    table[i][j] = 0;
                }

                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[] fivem = {1, 5, 3, 2, 11, 4, 7, 6, 10, 8, 9, 12};
        int minM=0;
        int maxM=0;
        for (int i = 0; i<fivem.length; i++){
            if(i==0){
                maxM=fivem[i];
                minM=fivem[i];
            }
            if(i>0){
                if(fivem[i]<minM){
                    minM=fivem[i];
                }
                if(fivem[i]>maxM){
                    maxM=fivem[i];
                }
            }
        }
        System.out.println("Максимальное "+maxM+" Минимальное "+minM);
*/
        int[] sixm = {2, 2, 2, 1, 2, 2, 10, 1};
        int suml;
        int sumr;
        for (int i = 0; i<sixm.length; i++){
           suml=0;
           sumr=0;
           for(int j=0;j<=i;j++){
               suml=suml+sixm[j];
           }
           for(int g=i+1;g<sixm.length;g++){
               sumr=sumr+sixm[g];
           }
           if(suml==sumr){
               System.out.println("Сумма правой и левой части равна между "+i+" "+(i+1));
               break;
           }
        }

        

    }
}
