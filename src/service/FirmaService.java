package service;

import AllDB.Database;
import entity.Firma;
import repository.FirmaRepository;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;

public class FirmaService implements IFirmaService {

    private FirmaRepository firmaRepository;
    public FirmaService() {
        this.firmaRepository= new FirmaRepository();
    }

    @Override
    public void save(int id, String firmaAdi){
        Firma firma = new Firma(id,firmaAdi);
        firmaRepository.save(firma);
    }
    @Override

    public List<Firma> getAll(){
        return firmaRepository.findAll();
    }
    @Override
    public List<Firma> getUcakSayisibesOlanFirmalar(){
        return firmaRepository.findAll();
    }

    public Firma idyeGoreFirmaGetir(int id) {
        return firmaRepository.idyegoreFirmaBul(id);
    }

}
