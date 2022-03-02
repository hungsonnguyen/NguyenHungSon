use ss2_thuc_hanh_student_management_2;

SELECT* FROM student

where status = true;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ.
SELECT*FROM subject
where credit<10;


SELECT s.student_id, s.stuedent_name, c.class_name 
FROM student s JOIN class c on s.class_id = c.class_id;


-- Hiển thị danh sách học viên lớp A1
SELECT S.student_id, S.stuedent_name, C.class_name
FROM Student S join Class C on S.student_id = C.class_id
WHERE C.class_name = 'A1';

-- Hiển thị điểm môn CF của các học viên.
select s.student_id,s.stuedent_name,sub.sub_name,m.mark
FROM student s join mark m on s.student_id = m.student_id join subject sub on m.sub_id = sub.sub_id
where sub.sub_name = 'cf';