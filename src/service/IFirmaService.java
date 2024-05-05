package service;

import entity.Firma;

import java.util.List;

public interface IFirmaService {

    public void save(int id, String firmaAdi);

    public List<Firma> getAll();
    public List<Firma> getUcakSayisibesOlanFirmalar();

    public Firma idyeGoreFirmaGetir(int id) ;
}
