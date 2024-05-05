package repository;

import AllDB.Database;
import entity.Musteri;

public class MusteriRepository {


    public void save(int id,String ad,String soyad,String tel){
        Musteri musteri= new Musteri();
        musteri.setId(id);
        musteri.setAd(ad);
        musteri.setSoyad(soyad);
        musteri.setTel(tel);
        Database.musteriler.add(musteri);
    }

}
