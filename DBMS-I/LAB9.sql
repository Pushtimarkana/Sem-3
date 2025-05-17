---------------------------LAB 9--------------------------
--------------PART-A-----------------------

-----CREATE TABLE------
CREATE TABLE Stu_DATA (
    Rno INT,
    Name VARCHAR(50),
    City VARCHAR(50),
    DID INT,
);

INSERT INTO Stu_DATA (Rno, Name, City, DID) VALUES
(101, 'Raju', 'Rajkot', 10),
(102, 'Amit', 'Ahmedabad', 20),
(103, 'Sanjay', 'Baroda', 40),
(104, 'Neha', 'Rajkot', 20),
(105, 'Meera', 'Ahmedabad', 30),
(106, 'Mahesh', 'Baroda', 10);



CREATE TABLE Academic (
    Rno INT,
    SPI DECIMAL(3, 1),
    Bklog INT
);

INSERT INTO Academic (Rno, SPI, Bklog) VALUES
(101, 8.8, 0),
(102, 9.2, 2),
(103, 7.6, 1),
(104, 8.2, 4),
(105, 7.0, 2),
(106, 8.9, 3);

CREATE TABLE Department (
    DID INT,
    DName VARCHAR(50)
);
INSERT INTO Department (DID, DName) VALUES
(10, 'Computer'),
(20, 'Electrical'),
(30, 'Mechanical'),
(40, 'Civil');

--------PART A-----------
--1. Display details of students who are from computer department.
SELECT * FROM Stu_DATA 
WHERE DID=(SELECT DID FROM Department WHERE DName='COMPUTER') 

--2. Displays name of students whose SPI is more than 8.
SELECT NAME FROM Stu_DATA 
WHERE RNO IN(SELECT RNO FROM Academic WHERE SPI>8)

--3. Display details of students of computer department who belongs to Rajkot city.
SELECT * FROM Stu_DATA 
WHERE DID=(SELECT DID FROM Department WHERE DName='COMPUTER') 
		AND CITY='RAJKOT'

--4. Find total number of students of electrical department.
SELECT COUNT(RNO) FROM STU_DATA 
WHERE DID=(SELECT DID FROM Department WHERE DNAME='Electrical')

--5. Display name of student who is having maximum SPI.
SELECT NAME FROM Stu_DATA 
	WHERE RNO=(SELECT RNO FROM Academic 
		WHERE SPI=(SELECT MAX(SPI) FROM Academic) )

--6. Display details of students having more than 1 backlog.
SELECT * FROM STU_DATA 
	WHERE RNO IN( SELECT RNO FROM Academic 
		WHERE BKLOG>1)

---------------------------Part – B------------:
--1. Display name of students who are either from computer department or from mechanical department.
SELECT NAME FROM STU_DATA
	WHERE DID IN(SELECT DID FROM Department 
		WHERE DNAME='COMPUTER' OR DNAME='MECHANICAL')

--2. Display name of students who are in same department as 102 studying in.
SELECT NAME FROM STU_DATA
	WHERE DID=(SELECT DID FROM DEPARTMENT 
	WHERE DID=(SELECT DID FROM STU_DATA WHERE Rno=102))

----------------------Part – C------------------:
--1. Display name of students whose SPI is more than 9 and who is from electrical department.


--2. Display name of student who is having second highest SPI.


--3. Display city names whose students branch wise SPI is 9.2

-------------------SET OPERATOR---------------
CREATE TABLE Computer (
    RollNo INT,
    Name VARCHAR(50)
);


INSERT INTO Computer (RollNo, Name) VALUES
(101, 'Ajay'),
(109, 'Haresh'),
(115, 'Manish');

CREATE TABLE Electrical (
    RollNo INT PRIMARY KEY,
    Name VARCHAR(50)
);

INSERT INTO Electrical (RollNo, Name) VALUES
(105, 'Ajay'),
(107, 'Mahesh'),
(115, 'Manish');

--1. Display name of students who is either in Computer or in Electrical.
SELECT NAME FROM COMPUTER 
	UNION
	SELECT NAME FROM ELECTRICAL

--2. Display name of students who is either in Computer or in Electrical including duplicate data.
SELECT NAME FROM COMPUTER 
	UNION ALL
	SELECT NAME FROM ELECTRICAL

--3. Display name of students who is in both Computer and Electrical.
SELECT NAME FROM COMPUTER 
	INTERSECT
	SELECT NAME FROM ELECTRICAL

--4. Display name of students who are in Computer but not in Electrical.
SELECT NAME FROM COMPUTER 
	EXCEPT
	SELECT NAME FROM ELECTRICAL

--5. Display name of students who are in Electrical but not in Computer.
SELECT NAME FROM Electrical 
	EXCEPT
	SELECT NAME FROM Computer

--6. Display all the details of students who are either in Computer or in Electrical.
SELECT NAME,RollNo FROM COMPUTER 
	UNION
	SELECT NAME,RollNo FROM ELECTRICAL

--7. Display all the details of students who are in both Computer and Electrical.
SELECT NAME,RollNo FROM COMPUTER 
	INTERSECT
	SELECT NAME,RollNo FROM ELECTRICAL

------------------ PART B ----------------------



CREATE TABLE Emp_DATA (
    EID INT,
    Name VARCHAR(50)
);

INSERT INTO Emp_DATA (EID, Name) VALUES
(1, 'Ajay'),
(9, 'Haresh'),
(5, 'Manish');

CREATE TABLE Customer (
    CID INT,
    Name VARCHAR(50)
);

INSERT INTO Customer (CID, Name) VALUES
(5, 'Ajay'),
(7, 'Mahesh'),
(5, 'Manish');

--1. Display name of persons who is either Employee or Customer.
SELECT NAME FROM EMP_DATA
UNION 
SELECT NAME FROM Customer

--2. Display name of persons who is either Employee or Customer including duplicate data.
SELECT NAME FROM EMP_DATA
UNION ALL 
SELECT NAME FROM Customer

--3. Display name of persons who is both Employee as well as Customer.
SELECT NAME FROM EMP_DATA
INTERSECT 
SELECT NAME FROM Customer

--4. Display name of persons who are Employee but not Customer.
SELECT NAME FROM EMP_DATA
EXCEPT 
SELECT NAME FROM Customer

--5. Display name of persons who are Customer but not Employee
SELECT NAME FROM Customer
EXCEPT 
SELECT NAME FROM Emp_DATA

-----------------------PART-C--------------------

--1. Perform all the queries of Part-B but display ID and Name columns instead of Name only.

--1. Display ID,name of persons who is either Employee or Customer.
SELECT EID,NAME FROM EMP_DATA
UNION 
SELECT CID,NAME FROM Customer

--2. Display ID AND name of persons who is either Employee or Customer including duplicate data.
SELECT EID,NAME FROM EMP_DATA
UNION ALL 
SELECT CID,NAME FROM Customer

--3. Display ID AND name of persons who is both Employee as well as Customer.
SELECT EID,NAME FROM EMP_DATA
INTERSECT 
SELECT CID,NAME FROM Customer

--4. Display ID AND name of persons who are Employee but not Customer.
SELECT EID,NAME FROM EMP_DATA
EXCEPT 
SELECT CID,NAME FROM Customer

--5. Display ID AND name of persons who are Customer but not Employee
SELECT CID,NAME FROM Customer
EXCEPT 
SELECT EID,NAME FROM Emp_DATA