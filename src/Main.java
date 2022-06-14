import java.util.InputMismatchException;
import java.lang.ArrayIndexOutOfBoundsException;

public class Main {
    public static void main(String[] args){
        int index=0;
        DinasPertanahan[] dinasPertanahan = new DinasPertanahan[2];
        try {
            for (index = 0;; index++) {
                dinasPertanahan[index]=new DinasPertanahan();
                System.out.printf("\n\nDATA KE-%d\n",index+1);
                dinasPertanahan[index].setAlamat();
                dinasPertanahan[index].setPanjangTanah();
                dinasPertanahan[index].setLuasTanah();
                System.out.println("\n");
                dinasPertanahan[index].getAlamat(index);
                dinasPertanahan[index].getPanjangTanah(index);
                dinasPertanahan[index].getLuasTanah(index);
            }
        }catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.err.println(e);
        }


        }
}
