package service.Impl;

import java.util.ArrayList;
import java.util.List;

public class Generics<I> {
    // generic yapılar içine aldığı tipe göre şekillenirler


    public I toplama(I sayi1,I sayi2){
        return (I) (sayi1+""+sayi2);
    }

}
