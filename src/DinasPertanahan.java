import java.util.InputMismatchException;
import java.lang.NumberFormatException;
import java.util.Scanner;

public class DinasPertanahan {
    private String alamat;
    private int panjangTanah,luasTanah;
    Scanner inp = new Scanner(System.in);


    public void setAlamat() {
        System.out.print("Masukkan Alamat : ");
        alamat = inp.nextLine();
//        InputMismatchException e = new InputMismatchException();
//        throw e;
    }
    public void setPanjangTanah() throws InputMismatchException {
        System.out.print("Masukkan Panjang Tanah : ");
        panjangTanah = inp.nextInt();
//        InputMismatchException e;
//        throw e;
    }
    public void setLuasTanah() throws InputMismatchException{
        System.out.print("Masukkan Luas Tanah : ");
        luasTanah = inp.nextInt();
//        InputMismatchException e = new InputMismatchException();
//        throw e;
    }

    public String getAlamat(int index) {
        System.out.printf("Alamat tanah data ke-%d adalah %s\n",index+1,alamat);
        return alamat;
    }

    public int getPanjangTanah(int index) {
        System.out.printf("Panjang tanah data ke-%d adalah %d m.\n",index+1,panjangTanah);
        return panjangTanah;
    }
    public int getLuasTanah(int index) {
        System.out.printf("Panjang tanah data ke-%d adalah %d m.\n",index+1,luasTanah);
        return luasTanah;
    }
}
