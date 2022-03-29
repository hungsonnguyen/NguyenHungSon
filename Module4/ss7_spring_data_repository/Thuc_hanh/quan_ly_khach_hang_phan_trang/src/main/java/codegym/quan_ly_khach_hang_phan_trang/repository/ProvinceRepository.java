package codegym.quan_ly_khach_hang_phan_trang.repository;


import codegym.quan_ly_khach_hang_phan_trang.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<Province,Integer> {
}
