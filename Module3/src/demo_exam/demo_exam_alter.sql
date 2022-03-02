use demo_exam;


INSERT INTO `demo_exam`.`category` (`category_name`) VALUES 
('Máy lạnh'),
('Máy giặt'),
('Iphone');


INSERT INTO `demo_exam`.`color` (`color_name`) VALUES 
('Black'),
('Yellow'),
('Green');

INSERT INTO `demo_exam`.`product` (`product_name`, `product_price`, `product_quanity`, `category_id`, `color_id`) VALUES 
('Iphone10', 2000, 12, 2, 3);

SELECT * FROM product join category on product.category_id = category.category_id join color on product.color_id = color.color_id ORDER BY product.product_id;
SELECT * FROM product join category on product.category_id = category.category_id join color on product.color_id = color.color_id where product_id =1; 