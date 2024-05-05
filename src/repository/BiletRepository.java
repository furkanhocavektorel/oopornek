package repository;

import AllDB.Database;
import entity.Bilet;
import entity.BiletSinifi;

import java.util.List;

public class BiletRepository {

    public void save(int id, String barkod, int fiyat, int ucakId, int koltukNo, BiletSinifi biletSinifi){
        Bilet bilet= new Bilet(id,barkod,fiyat,ucakId,koltukNo,biletSinifi);
        Database.biletler.add(bilet);
    }

    public List<Bilet> getAll(){
        return Database.biletler;
    }
}
