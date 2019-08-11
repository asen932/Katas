public class oddCount {

    public static int oddCount(int n){

        int counter = 0;

        if(n > 0){
            for (int i = 0; i < n; i++){
                if (i % 2 != 0){
                    counter++;
                }
            }
            return counter;
        }
        else {
            return 0;
        }
    }

}