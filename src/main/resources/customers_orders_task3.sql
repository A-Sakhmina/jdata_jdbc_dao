select product_name
from orders o
join customers c
on o.customer_id = c.id
where c.name iLIKE :name
group by product_name;