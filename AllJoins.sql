use nitte2026



-- inner join - matching values in both the tables / inner join or join

select t_amount, creditcard.card_holder, t_date from
transactions inner join creditcard on t_by=creditcard.card_no;

-- left join : all rows from left and matching details from right 
-- returns null if no match is in the right

select card_holder, transactions.t_date, t_date, t_amount
from creditcard left join transactions 
on card_no=transactions.t_by;

-- right join: all rows from right and matching rows from the left

select merchant_name, t_amount
from transactions right join merchant
on t_to=merchant.merchant_id;

-- full join : returns all rows when there is a match in either left or right 
-- "not supported in mySQL, can be implemented using union of left and right"

select card_holder, transactions.t_id,
merchant.merchant_name, transactions.t_amount 
from creditcard left join transactions
on card_no=transactions.t_by
left join merchant
on transactions.t_to=merchant.merchant_id
union 
select card_holder, transactions.t_id,
merchant.merchant_name, transactions.t_amount 
from creditcard right join transactions
on card_no=transactions.t_by
right join merchant
on transactions.t_to=merchant.merchant_id;

