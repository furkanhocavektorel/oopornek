package AllDB;

import entity.Musteri;
import entity.Firma;
import entity.Ucak;

import java.util.ArrayList;
import java.util.List;

// DATABASE SİM
public class Database {

    public static List<Firma> firmalar;
    public static List<Ucak> ucaklar;
    public static List<Musteri> musteriler;

    public Database(){
        firmalar = new ArrayList<>();
        ucaklar= new ArrayList<>();
        musteriler= new ArrayList<>();
    }
}
