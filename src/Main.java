public class Main {

    public static void main(String[] args) {
	int[][] array ={{1,2,3},{4,5,6}};
	int[][] array2 = new int[array[0].length][array.length];

	for(int i=0;i< array.length;i++){

	    for(int j=0;j<array[i].length;j++){
	        array2[j][i]=array[i][j];
        }
    }

        System.out.println("Transposed matris: ");

        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[i].length; j++){
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }



    }
}
