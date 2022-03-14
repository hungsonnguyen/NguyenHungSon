package codegym.ss7_thuc_hanh_quan_ly_tinh.service;

import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Customer;
import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface IProvinceService {
    Iterable<Province> findAll();
    Page<Province> findAll(Pageable pageable);

    Optional<Province> findById(int id);

    void save(Province province);

    void remove(int id);
}
