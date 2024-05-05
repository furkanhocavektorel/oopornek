package repository;

import AllDB.Database;
import entity.Firma;

import java.util.List;

public class FirmaRepository {

    public void save(Firma firma){

        Database.firmalar.add(firma);
    }

    public List<Firma> findAll(){
        return Database.firmalar;
    }


    public Firma idyegoreFirmaBul(int id) {
        Firma firma= new Firma();
        for (Firma f : Database.firmalar){

            if (f.getId()==id){
                firma.setAd(f.getAd());
                firma.setId(f.getId());
                firma.setKurulusYili(f.getKurulusYili());
                firma.setUcakSayisi(f.getUcakSayisi());
                return firma;
            }

        }
        // 1.cözüm
        return firma;
        // 2.cözüm
       // return null;
    }
}
