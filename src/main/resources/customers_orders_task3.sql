select o.productName
from Order o
         join Customer c on o.customer.id = c.id
where lower(c.name) like lower(:name)
group by o.productName