use ss2_thuc_hanh_student_management_2;

INSERT INTO class
values (1, 'A1', '2008-12-20', 1),
(2, 'A2', '2008-12-22', 1),
(3, 'A3', curdate(), 0);

insert into student(stuedent_name,address,phone_number,status,class_id)
VALUES 
('Hung', 'Ha noi', '0912113113', 1, 1);

INSERT INTO student(stuedent_name,address,status,class_id)
VALUES ('Hoa', 'Hai phong', 1, 1);

INSERT into student(stuedent_name,address,phone_number,status,class_id)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO mark(sub_id,student_id,mark,exam_time)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);