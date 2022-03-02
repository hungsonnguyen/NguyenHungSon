DROP DATABASE IF EXISTS ss2_bai_tap_chuyen_doi_ERD_sang_mo_hinh_quan_he;

CREATE DATABASE ss2_bai_tap_chuyen_doi_ERD_sang_mo_hinh_quan_he;

use ss2_bai_tap_chuyen_doi_ERD_sang_mo_hinh_quan_he;

CREATE TABLE phieu_xuat(
ma_phieu_xuat VARCHAR(5) PRIMARY KEY,
ngay_xuat VARCHAR(10));

CREATE TABLE vat_tu(
ma_vat_tu VARCHAR(5),
ten_vat_tu VARCHAR(20),
PRIMARY KEY(ma_vat_tu));

CREATE TABLE phieu_nhap(
ma_phieu_nhap VARCHAR(5),
ngay_nhap VARCHAR(10),
PRIMARY KEY(ma_phieu_nhap));


CREATE TABLE nha_cung_cap(
ma_nha_cung_cap VARCHAR(5),
ten_nha_cung_cap VARCHAR(20),
dia_chi VARCHAR(20),
so_dien_thoai INT,
PRIMARY KEY(ma_nha_cung_cap));

CREATE TABLE don_dat_hang(
ma_dat_hang VARCHAR(5),
ma_nha_cung_cap VARCHAR(5),
ngay_dat_hang VARCHAR(10),
PRIMARY KEY(ma_dat_hang),
FOREIGN KEY(ma_nha_cung_cap) REFERENCES nha_cung_cap(ma_nha_cung_cap));

CREATE TABLE don_dat_hang_detail(
ma_vat_tu VARCHAR(5),
ma_dat_hang VARCHAR(5),
PRIMARY KEY(ma_vat_tu, ma_dat_hang),
FOREIGN KEY(ma_vat_tu) REFERENCES vat_tu(ma_vat_tu),
FOREIGN KEY(ma_dat_hang) REFERENCES don_dat_hang(ma_dat_hang));

CREATE TABLE phieu_xuat_detail(
ma_phieu_xuat VARCHAR(5),
ma_vat_tu VARCHAR(5),
don_gia_xuat INT,
so_luong_xuat INT,
PRIMARY KEY(ma_phieu_xuat,ma_vat_tu),
FOREIGN KEY(ma_phieu_xuat) REFERENCES phieu_xuat(ma_phieu_xuat),
FOREIGN KEY(ma_vat_tu) REFERENCES vat_tu(ma_vat_tu));

CREATE TABLE phieu_nhap_detail(
ma_phieu_nhap VARCHAR(5),
ma_vat_tu VARCHAR(5),
don_gia INT,
so_luong_nhap INT,
PRIMARY KEY(ma_phieu_nhap, ma_vat_tu),
FOREIGN KEY(ma_phieu_nhap) REFERENCES phieu_nhap(ma_phieu_nhap),
FOREIGN KEY(ma_vat_tu) REFERENCES vat_tu(ma_vat_tu));
