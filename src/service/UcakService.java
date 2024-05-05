package service;

import entity.Firma;
import entity.Ucak;
import repository.UcakRepository;

import java.util.List;

public class UcakService implements IUcakService {

    private UcakRepository ucakRepository;

    public UcakService(){
        this.ucakRepository=new UcakRepository();
    }

    @Override
    public List<Ucak> getAll() {
        return ucakRepository.getAll();
    }

    @Override
    public void save(int id, String ad, int kapasite, Firma firma) {
        Ucak ucak = new Ucak();
        ucak.setAd(ad);
        ucak.setId(id);
        ucak.setFirma(firma);
        ucak.setKapasite(kapasite);
        ucakRepository.save(ucak);
    }


}
