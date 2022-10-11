#SELECT * FROM c1021g1_sprint_1.ticket;
SELECT 
ticket_history.id,
ticket_history.birthday_ticket,
ticket_history.buyer_ticket,
ticket_history.code_ticket,
ticket_history.del_flag_ticket,
ticket_history.email_ticket,
ticket_history.gender_ticket,
ticket_history.phone_ticket,
ticket_history.point_ticket,
ticket_history.price_ticket,
ticket_history.status_ticket,
ticket_history.id_customer,
ticket_history.id_employee,
ticket_history.id_seat 
from ticket_history ORDER BY ticket_history.id