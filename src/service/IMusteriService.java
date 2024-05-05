package service;

public interface IMusteriService {
    void save(int id,String ad,String soyad,String tel);

    boolean existsById(int id);
}
