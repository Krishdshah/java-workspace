public class ShiftZeroToEnd {
    public static void main(String[] args) {
        int[] array = {2,3,0,4,0,6};
        for (int i=0;i<array.length;i++){
            if (array[i]==0){
                for (int j=i+1;j<array.length;j++){
                    array[j-1]=array[j];
                }
                array[array.length-1]=0;
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
