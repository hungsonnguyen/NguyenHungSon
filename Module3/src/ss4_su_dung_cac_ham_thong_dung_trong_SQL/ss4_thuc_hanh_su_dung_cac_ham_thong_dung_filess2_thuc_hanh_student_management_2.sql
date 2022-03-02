use ss2_thuc_hanh_student_management_2;


-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
select student.address, count(student.student_id) as 'Số lượng sinh viên'
from student
GROUP BY student.address;

--  Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG
select s.student_id, s.stuedent_name, avg(mark) as 'Điểm trung bình'
from student s inner join mark on s.student_id = mark.student_id
-- inner join `subject` sub on sub.sub_id = mark.sub_id
group by s.student_id, s.stuedent_name;


--  Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
-- Đầu tiên hiển thị điểm trung bình các môn học của mỗi học viên

-- Sử dụng having để xét điều kiện điểm trung bình các môn học phải lớn hơn 15

select s.student_id, s.stuedent_name, avg(mark) as 'Điểm trung bình'
from student s inner join mark on s.student_id = mark.student_id
group by s.student_id, s.stuedent_name
having avg(mark)>15 ;

-- Sử dụng Having và All để tìm học viên có điểm trung bình lớn nhất

select s.student_id, s.stuedent_name, avg(mark) as 'Điểm trung bình'
from student s inner join mark on s.student_id = mark.student_id
group by s.student_id, s.stuedent_name
having avg(mark)> all (select avg(mark) from mark group by mark.student_id);