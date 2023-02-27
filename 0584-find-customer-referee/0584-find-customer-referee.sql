# Write your MySQL query statement below
# SELECT name FROM Customer WHERE referee_id is null or referee_id!= 2;
SELECT name FROM Customer WHERE COALESCE(referee_id,0) <> 2;