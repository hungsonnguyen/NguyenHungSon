use ss2_thuc_hanh_student_management_2;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select * from subject
order by subject.credit desc limit 1;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select * from `subject`
inner join mark on `subject`.sub_id = mark.sub_id
order by mark.mark desc limit 1;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.* , avg(mark) as 'Điểm trung bình'
from student s join mark m on s.student_id = m.student_id
join subject sub on sub.sub_id = m.sub_id
group by s.student_id, s.stuedent_name order by avg(mark) desc;