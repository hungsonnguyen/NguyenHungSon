use ss2_thuc_hanh_student_management_2;


-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * FROM student
where stuedent_name like 'h%';

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * FROM class
where start_date like '%-12-%';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * FROM subject
where credit between 3 and 5;


-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.

update student,class
set class.class_id = '2'
where stuedent_name = 'hoa';

-- Hiển thị các thông tin: StudentName, SubName, Mark.
--  Dữ liệu sắp xếp theo điểm thi (mark) giảm dần.
 -- nếu trùng sắp theo tên tăng dần.
 
 select s.stuedent_name,sub.sub_name, m.mark
 FROM student s join mark m on s.student_id = m.student_id join subject sub  on m.sub_id = sub.sub_id
 order by m.mark desc;
 