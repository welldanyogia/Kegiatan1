import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args) throws InputMismatchException {
        int index=0;
        DinasPertanahan[] dinasPertanahan = new DinasPertanahan[2];
//        try {
        try {
            for (index = 0;; index++) {
                dinasPertanahan[index] = new DinasPertanahan();
                try {
                    System.out.printf("\n\nDATA KE-%d\n", index + 1);
                    dinasPertanahan[index].setAlamat();
                    dinasPertanahan[index].setPanjangTanah();
                    dinasPertanahan[index].setLuasTanah();
                    System.out.println("\n");
                    dinasPertanahan[index].getAlamat(index);
                    dinasPertanahan[index].getPanjangTanah(index);
                    dinasPertanahan[index].getLuasTanah(index);
                }catch (InputMismatchException e) {
                    System.err.println(e);
                }
            }
        }catch (ArrayIndexOutOfBoundsException b){
            System.err.println(b);
        }

//        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
//            System.err.println(e);
//        }


        }
}
