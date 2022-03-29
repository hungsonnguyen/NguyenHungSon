package codegym.quan_ly_khach_hang_phan_trang.service;

import codegym.quan_ly_khach_hang_phan_trang.model.Province;
import codegym.quan_ly_khach_hang_phan_trang.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ProvinceServiceImpl implements IProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;


    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Page<Province> findAll(Pageable pageable) {
        return provinceRepository.findAll(pageable);
    }

    @Override
    public Optional<Province> findById(int id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(int id) {
        provinceRepository.deleteById(id);
    }
}
