# Write your MySQL query statement below
Select firstName , lastName , city, state
From Person 
Left Join Address 
on Person.personId = Address.personId   
