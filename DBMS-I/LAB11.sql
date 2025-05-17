-----------------------------LAB 11----------------------------------------
---CREATE TABLE--------------
CREATE TABLE STU_INFO(
RNO INT,
NAME VARCHAR(50),
BRANCH VARCHAR(50)
);

----------INSERT VALUES IN TABLE STU_INFO----------
INSERT INTO STU_INFO VALUES
(101,'RAJU','CE'),
(102,'Amit','CE'),
(103,'Sanjay','ME'),
(104,'Neha','EC'),
(105,'Meera','EE'),
(106,'Mahesh','ME')

--------------CREATE TABLE RESULT-------
CREATE TABLE RESULT(
RNO INT,
SPI DECIMAL(2,1)
);

-----------INSERT VALUES IN RESULT-----------
INSERT INTO RESULT VALUES
(101,8.8),
(102,9.2),
(103,7.6),
(104,8.2),
(105,7.0),
(107,8.9)

-------CREATE TABLE EMPLOYEE_MASTER-------
CREATE TABLE EMPLOYEE_MASTER(
EMPLOYEENO VARCHAR(10),
NAME VARCHAR(30),
MANAGERNO VARCHAR(10)
)

------------INSERT VALUES IN EMPLOYEE_MASTER------------
INSERT INTO EMPLOYEE_MASTER VALUES
('E01','TARUN',NULL),
('E02','Rohan','E02'),
('E03','Priya','E01'),
('E04','Milan','E03'),
('E05','Jay','E01'),
('E06','Anjana','E04')

------------------PART A----------------------------
--1. Combine information from student and result table using cross join or Cartesian product.
SELECT * 
FROM STU_INFO AS S CROSS JOIN RESULT AS R

--2. Perform inner join on Student and Result tables.
SELECT *
FROM STU_INFO AS S INNER JOIN RESULT AS R
ON S.RNO=R.RNO

--3. Perform the left outer join on Student and Result tables.
SELECT *
FROM STU_INFO AS S LEFT OUTER JOIN RESULT AS R
ON S.RNO=R.RNO

--4. Perform the right outer join on Student and Result tables.
SELECT *
FROM STU_INFO AS S RIGHT JOIN RESULT AS R
ON S.RNO=R.RNO

--5. Perform the full outer join on Student and Result tables.
SELECT *
FROM STU_INFO AS S FULL JOIN RESULT AS R
ON S.RNO=R.RNO

--6. Display Rno, Name, Branch and SPI of all students.
SELECT S.RNO,S.NAME,S.BRANCH,R.SPI
FROM STU_INFO S FULL JOIN RESULT R
ON S.RNO=R.RNO


--7. Display Rno, Name, Branch and SPI of CE branch’s student only.
SELECT S.RNO,S.NAME,S.BRANCH,R.SPI
FROM STU_INFO AS S FULL JOIN RESULT AS R
ON S.RNO=R.RNO
WHERE S.BRANCH='CE'

--8. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
SELECT S.RNO,S.NAME,S.BRANCH,R.SPI
FROM STU_INFO AS S FULL JOIN RESULT AS R
ON S.RNO=R.RNO
WHERE S.BRANCH<>'EC'

--9. Display average result of each branch.
SELECT S.BRANCH,AVG(R.SPI)
FROM STU_INFO AS S FULL JOIN RESULT AS R
ON S.RNO=R.RNO
GROUP BY S.BRANCH

--10. Display average result of CE and ME branch.
SELECT S.BRANCH, AVG(R.SPI)
FROM STU_INFO AS S FULL JOIN RESULT AS R
ON S.RNO=R.RNO
GROUP BY S.BRANCH
HAVING S.BRANCH='CE' OR S.BRANCH='ME'

---------------PART B-------------------

--1. Display average result of each branch and sort them in ascending order by SPI.
SELECT S.BRANCH,AVG(R.SPI)
FROM STU_INFO AS S LEFT JOIN RESULT AS R
ON S.RNO=R.RNO
GROUP BY S.BRANCH
ORDER BY AVG(R.SPI)

--2. Display highest SPI from each branch and sort them in descending order.
SELECT S.BRANCH,MAX(R.SPI)
FROM STU_INFO AS S LEFT JOIN RESULT AS R
ON S.RNO=R.RNO
GROUP BY S.BRANCH
ORDER BY MAX(R.SPI) DESC

-------------------PART C------------
--1. Retrieve the names of employee along with their manager’s name from the Employee table
SELECT E.NAME ,M.NAME
FROM EMPLOYEE_MASTER E INNER JOIN EMPLOYEE_MASTER M
ON E.EmployeeNo=M.ManagerNo