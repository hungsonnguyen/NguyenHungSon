use ss2_bai_tap_sale_management;

insert into customer
values (1, 'Minh Quan', 10),
(2, 'Ngoc Oanh', 20),
(3, 'Hong Ha', 50);

insert into `order`
values (1,1,'2006-03-21', null),
(2,2,'2006-03-23', null),
(3,1,'2006-03-16', null);

insert into product
values (1,'May Giat', 3),
(2,'Tu lanh', 5),
(3,'Dieu hoa', 7),
(4,'Quat', 1),
(5,'Bep dien', 2);

insert into oder_detail(order_id,product_id,order_QTY)
values (1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select order_id, oder_date, oder_total_price from `order`

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select cus.customer_name, pr.product_name, o.oder_date 
from customer cus
inner join `order` o on cus.customer_id = o.customer_id
inner join oder_detail od on o.order_id =  od.order_id
inner join product pr on od.product_id = pr.product_id;

#Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

select cus.customer_name from customer cus
left join `order` o on cus.customer_id = o.customer_id
where o.order_id is null; 


-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)

select ord.order_id, o.oder_date, SUM( ord.order_QTY * pr.product_price) as 'total price ' 
from `order` o
inner join customer cus on cus.customer_id = o.customer_id
inner join oder_detail ord on ord.order_id = o.order_id
inner join product pr on pr.product_id = ord.product_id
group by o.order_id
;





 