use nitte2026

-- aggregate functions : sum, average, max, count

-- sum 

select creditcard.card_holder, sum(t_amount) as SpentAnalysis
from transactions join creditcard
on t_by=creditcard.card_no
group by creditcard.card_holder;


-- average

select merchant.merchant_name, avg(t_amount) as AverageIncome
from transactions join merchant
on t_to=merchant.merchant_id
group by merchant.merchant_name;


-- max

select creditcard.card_holder, max(t_amount) as max_spent
from transactions join creditcard
on t_by=creditcard.card_no
group by creditcard.card_holder;


-- count

select merchant_name, count(t_id) as bills
from merchant left join transactions
on merchant_id=transactions.t_to
group by merchant_name;
