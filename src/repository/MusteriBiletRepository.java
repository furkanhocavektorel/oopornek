package repository;

import AllDB.Database;
import entity.MusteriBilet;

public class MusteriBiletRepository {

    public void save(int id, int biletId,int musteriId){
        MusteriBilet musteriBilet= new MusteriBilet();
        musteriBilet.setBiletId(biletId);
        musteriBilet.setMusteriId(musteriId);
        musteriBilet.setId(id);
        Database.musteriBiletleri.add(musteriBilet);
    }
}
