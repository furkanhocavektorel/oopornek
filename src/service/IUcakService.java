package service;

import entity.Firma;
import entity.Ucak;

import java.util.List;

public interface IUcakService {

    List<Ucak> getAll();

    void save(int id, String ad, int kapasite, Firma firma);
}
