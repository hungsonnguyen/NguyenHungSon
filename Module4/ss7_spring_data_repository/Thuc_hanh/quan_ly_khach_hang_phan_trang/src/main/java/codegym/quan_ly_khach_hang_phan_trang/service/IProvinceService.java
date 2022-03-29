package codegym.quan_ly_khach_hang_phan_trang.service;

import codegym.quan_ly_khach_hang_phan_trang.model.Province;
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
