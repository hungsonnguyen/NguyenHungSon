USE case_study_database_furama;

#2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống có tên bắt đầu là
# một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from nhan_vien
WHERE (ho_ten like 'H%' and CHARACTER_LENGTH(ho_ten)<15)
or  (ho_ten like 'T%'  and CHARACTER_LENGTH(ho_ten)<15)
or (ho_ten like 'K%'  and CHARACTER_LENGTH(ho_ten)<15);

#3.	Hiển thị thông tin của tất cả khách hàng có độ 
#tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.

select * from khach_hang
WHERE (year(ngay_sinh_khach)<2004 and year(ngay_sinh_khach)<1972);