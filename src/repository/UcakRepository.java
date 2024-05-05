package repository;

import AllDB.Database;
import entity.Ucak;

import java.util.List;

public class UcakRepository {

    public List<Ucak> getAll(){
        return Database.ucaklar;
    }

    public void save(Ucak ucak) {
        Database.ucaklar.add(ucak);
    }
}
