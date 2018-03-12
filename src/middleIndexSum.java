public class middleIndexSum {

    public static void main (String[] args){

        int[] given = {2,4,4,5,4,1};

        findIndex(given);
    }

    private static void findIndex(int[] k){

        int arrayTemp1 = 0;
        int arrayTemp2 = 0;

        for(int j = 0; j < k.length; j++){

            arrayTemp1 += k[j];
            arrayTemp2 += k[(k.length-1)-j];

            if(arrayTemp1 == arrayTemp2){
                System.out.println("Index " + j + " is in the middle.");
                break;
            }
        }
    }

}
