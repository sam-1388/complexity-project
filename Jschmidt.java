public class Jschmidt {
    //-----------------------------------------SARA DOWARAH & MOHAMMED MOLAZM--------------------------------------------------
    public static void reverse_TE (int[][] TE ){
        int r = TE.length;
        int c = TE.length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c/2; j++) {
                int temp = TE[i][j];
                TE[i][j] = TE[i][c - j - 1];
                TE[i][c - j - 1] = temp;
            }

            }

        }
        public static void reverse_BE (int[][] BE){
        int r = BE.length;
        int c= BE.length;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c/2; j++) {
                    int temp = BE[i][j];
                    BE[i][j] = BE[i][c - j - 1];
                    BE[i][c - j - 1] = temp;
                }

                }
        }
}

