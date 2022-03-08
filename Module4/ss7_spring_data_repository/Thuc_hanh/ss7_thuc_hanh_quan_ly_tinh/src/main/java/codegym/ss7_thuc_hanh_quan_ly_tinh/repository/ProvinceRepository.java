package codegym.ss7_thuc_hanh_quan_ly_tinh.repository;

import codegym.ss7_thuc_hanh_quan_ly_tinh.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Integer> {
}
