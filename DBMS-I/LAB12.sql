
------------------------------LAB 12----------------------
---------------CREATE TABLE------------
--1. Find all persons with their department name & code.
SELECT P.PERSONNAME,D.DEPARTMENTNAME,D.DEPARTMENTCODE
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID

--2. Find the person's name whose department is in C-Block.
SELECT P.PERSONNAME
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
WHERE D.LOCATION='C-BLOCK'

--3. Retrieve person name, salary & department name who belongs to Jamnagar city.
SELECT P.PERSONNAME,P.SALARY,D.DEPARTMENTNAME
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
WHERE P.CITY='JAMNAGAR'

--4. Retrieve person name, salary & department name who does not belong to Rajkot city.
SELECT P.PERSONNAME,P.SALARY,D.DEPARTMENTNAME
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
WHERE P.CITY<>'RAJKOT'

--5. Retrieve person’s name of the person who joined the Civil department after 1-Aug-2001.
SELECT P.PERSONNAME,P.JOININGDATE
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
WHERE D.DEPARTMENTNAME='CIVIL' AND P.JOININGDATE>'1-AUG-2001'

--6. Find details of all persons who belong to the computer department.
SELECT *
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
WHERE D.DEPARTMENTNAME='COMPUTER'

--7. Display all the person's name with the department whose joining date difference with the current date is more than 365 days.
SELECT P.PERSONNAME,D.DEPARTMENTNAME,P.JOININGDATE
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
WHERE (GETDATE()-P.JOININGDATE)>365

--8. Find department wise person counts.
SELECT D.DEPARTMENTNAME,COUNT(P.PERSONID)
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
GROUP BY D.DEPARTMENTNAME

--9. Give department wise maximum & minimum salary with department name.
SELECT D.DEPARTMENTNAME,MIN(P.SALARY) AS MIN_VALUE,
						MAX(P.SALARY) AS MAX_VALUE
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID
GROUP BY D.DEPARTMENTNAME

--10. Find city wise total, average, maximum and minimum salary.
SELECT P.CITY,SUM(P.SALARY),MIN(P.SALARY),MAX(P.SALARY),AVG(P.SALARY)
	FROM PERSON P 
GROUP BY P.CITY

--11. Find the average salary of a person who belongs to Ahmedabad city.
SELECT AVG(SALARY) AS AVG_SAL
	FROM PERSON
WHERE CITY='AHEMDABAD'

--12. Produce Output Like: <PersonName> lives in <City> and works in <DepartmentName> Department. (Insingle column)
SELECT P.PERSONNAME + 'LIVES IN' + P.CITY + 'AND WORK IN' + D.DEPARTMENTNAME
	FROM PERSON P JOIN DEPT D
	ON P.DEPARTMENTID=D.DEPARTMENTID