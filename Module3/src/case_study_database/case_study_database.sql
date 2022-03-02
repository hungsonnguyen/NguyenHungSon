drop DATABASE IF EXISTS case_study_database_furama;

CREATE DATABASE case_study_database_furama;

use case_study_database_furama;

CREATE TABLE vi_tri(
ma_vi_tri INT PRIMARY KEY,
ten_vi_tri VARCHAR(45)
);

CREATE TABLE trinh_do(
ma_trinh_do INT PRIMARY KEY,
ten_trinh_do VARCHAR(45)
);

CREATE TABLE bo_phan(
ma_bo_phan INT PRIMARY KEY,
ten_bo_phan VARCHAR(45)
);

CREATE TABLE nhan_vien(
ma_nhan_vien INT PRIMARY KEY,
ho_ten VARCHAR(45) NOT NULL,
ngay_sinh DATE NOT null,
so_cmnd VARCHAR(9) not null,
luong DOUBLE not null,
so_dien_thoai VARCHAR(45) not null,
email VARCHAR(45),
dia_chi VARCHAR(45),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan INT,
FOREIGN KEY (ma_vi_tri) REFERENCES vi_tri(ma_vi_tri),
FOREIGN KEY (ma_trinh_do) REFERENCES trinh_do(ma_trinh_do),
FOREIGN KEY (ma_bo_phan) REFERENCES bo_phan(ma_bo_phan));

CREATE TABLE loai_khach(
ma_loai_khach int PRIMARY KEY,
ten_khach_hang VARCHAR(45));


CREATE TABLE khach_hang(
ma_khach_hang int PRIMARY KEY,
ma_loai_khach INT,
ho_ten_khach VARCHAR(45) not null,
ngay_sinh_khach VARCHAR(10) not NULL,
gioi_tinh bit(1),
so_cnmnd VARCHAR(9) NOT NULL,
so_dien_thoai VARCHAR(10) NOT null,
email VARCHAR(45),
dia_chi VARCHAR(45),
FOREIGN KEY (ma_loai_khach) REFERENCES loai_khach(ma_loai_khach));


CREATE TABLE kieu_thue(
ma_kieu_thue int,
PRIMARY KEY(ma_kieu_thue),
ten_kieu_thue VARCHAR(45));

CREATE TABLE loai_dich_vu(
ma_loai_dich_vu int,
PRIMARY KEY(ma_loai_dich_vu),
ten_loai_dich_vu VARCHAR(45));

CREATE TABLE dich_vu(
ma_dich_vu int,
ten_dich_vu VARCHAR(45) not null,
dien_tich int,
chi_phi_thue DOUBLE not null,
so_nguoi_toi_da int,
ma_kieu_thue int,
ma_loai_dich_vu int,
tieu_chuan_phong VARCHAR(45),
mo_ta_tien_nghi_khac varchar(45),
dien_tich_ho_boi DOUBLE,
so_tang INT,
PRIMARY KEY(ma_dich_vu),
FOREIGN KEY (ma_loai_dich_vu) REFERENCES loai_dich_vu(ma_loai_dich_vu),
FOREIGN KEY (ma_kieu_thue) REFERENCES kieu_thue(ma_kieu_thue));


CREATE TABLE hop_dong(
ma_hop_dong INT PRIMARY KEY,
ngay_lam_hop_dong DATETIME,
ngay_ket_thuc DATETIME,
tien_dat_coc DOUBLE,
ma_nhan_vien int,
ma_khach_hang int,
ma_dich_vu INT,
FOREIGN KEY (ma_nhan_vien) REFERENCES nhan_vien(ma_nhan_vien),
FOREIGN KEY (ma_khach_hang) REFERENCES khach_hang(ma_khach_hang),
FOREIGN KEY (ma_dich_vu) REFERENCES dich_vu(ma_dich_vu));

CREATE TABLE dich_vu_di_kem(
ma_dich_vu_di_kem INT PRIMARY KEY,
ten_dich_vu_di_kem VARCHAR(45) not NULL,
gia DOUBLE not NULL,
don_vi VARCHAR(10) not NULL,
trang_thai VARCHAR(45));


CREATE TABLE hop_dong_chi_tiet(
ma_hop_dong_chi_tiet INT, 
ma_hop_dong int,
ma_dich_vu_di_kem INT,
PRIMARY KEY(ma_hop_dong_chi_tiet),
FOREIGN KEY (ma_hop_dong) REFERENCES hop_dong(ma_hop_dong),
foreign key (ma_dich_vu_di_kem) REFERENCES dich_vu_di_kem(ma_dich_vu_di_kem));

