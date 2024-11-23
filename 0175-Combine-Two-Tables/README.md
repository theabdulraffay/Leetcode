<h2><a href="https://leetcode.com/problems/combine-two-tables">175. Combine Two Tables</a></h2>
<h3>Easy</h3>
<hr>
<p>Write a solution to report the first name, last name, city, and state of each person in the <code>Person</code> table. If the address of a <code>personId</code> is not present in the <code>Address</code> table, report <code>NULL</code> instead.</p>

<p><strong>Table: Person</strong></p>
<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| personId    | int     |
| lastName    | varchar |
| firstName   | varchar |
+-------------+---------+
personId is the primary key (column with unique values) for this table.
This table contains information about the ID of some persons and their first and last names.
</pre>

<p><strong>Table: Address</strong></p>
<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| addressId   | int     |
| personId    | int     |
| city        | varchar |
| state       | varchar |
+-------------+---------+
addressId is the primary key (column with unique values) for this table.
Each row of this table contains information about the city and state of one person with ID = personId.
</pre>

<p>The result format is in the following example:</p>

<p><strong>Example 1:</strong></p>
<pre>
<strong>Input:</strong> 
Person table:
+----------+----------+-----------+
| personId | lastName | firstName |
+----------+----------+-----------+
| 1        | Wang     | Allen     |
| 2        | Alice    | Bob       |
+----------+----------+-----------+
Address table:
+-----------+----------+---------------+------------+
| addressId | personId | city          | state      |
+-----------+----------+---------------+------------+
| 1         | 2        | New York City | New York   |
| 2         | 3        | Leetcode      | California |
+-----------+----------+---------------+------------+

<strong>Output:</strong> 
+-----------+----------+---------------+----------+
| firstName | lastName | city          | state    |
+-----------+----------+---------------+----------+
| Allen     | Wang     | Null          | Null     |
| Bob       | Alice    | New York City | New York |
+-----------+----------+---------------+----------+

<strong>Explanation:</strong> 
There is no address in the address table for <code>personId = 1</code> so we return <code>NULL</code> in their city and state.
<code>addressId = 1</code> contains information about the address of <code>personId = 2</code>.
</pre>
