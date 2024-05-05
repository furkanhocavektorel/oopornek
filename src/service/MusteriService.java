package service;

import repository.MusteriRepository;

public class MusteriService implements IMusteriService {

    private MusteriRepository repository;
    public MusteriService(){
        repository= new MusteriRepository();
    }
    @Override
    public void save(int id, String ad, String soyad, String tel) {
        repository.save(id,ad,soyad,tel);
    }

    @Override
    public boolean existsById(int id) {
        return repository.existsById(id);
    }
}
