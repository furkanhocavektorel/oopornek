package AllDB;

import entity.*;

import java.util.ArrayList;
import java.util.List;

// DATABASE SİM
public class Database {

    public static List<Firma> firmalar;
    public static List<Ucak> ucaklar;
    public static List<Musteri> musteriler;
    public static List<Bilet> biletler;
    public static List<MusteriBilet> musteriBiletleri;

    public Database(){
        firmalar = new ArrayList<>();
        ucaklar= new ArrayList<>();
        musteriler= new ArrayList<>();
        biletler= new ArrayList<>();
        musteriBiletleri=new ArrayList<>();
    }
}
