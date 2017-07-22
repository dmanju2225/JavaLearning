USE test;
SHOW databases;
CREATE DATABASE EmployeeSampleDatabase;
USE EmployeeSampleDatabase;
CREATE TABLE Departments(dept_no INT,dept_name VARCHAR(255));
SHOW TABLES;
DESC Departments;
ALTER TABLE Departments ADD PRIMARY KEY (dept_no);
DESC Departments;
ALTER TABLE Departments ADD UNIQUE KEY(dept_name);
CREATE TABLE Employees(emp_no INT,firstname VARCHAR(255),lastname VARCHAR(255),Birth_Date DATE,hire_date DATE,gender VARCHAR(255),PRIMARY KEY(emp_no));
DESC Employees;
CREATE TABLE dept_employeRelation(emp_no INT,dept_no INT,from_date DATE,to_date DATE,PRIMARY KEY(emp_no,dept_no));
DESC dept_employeRelation;
ALTER TABLE dept_employeRelation ADD FOREIGN KEY(dept_no) REFERENCES Departments(dept_no);
SHOW CREATE TABLE dept_employeRelation;
ALTER TABLE dept_employeRelation DROP FOREIGN KEY dept_employeRelation_ibfk_5;
INSERT INTO Departments(dept_no,dept_name) VALUES('101','Computerscience');
INSERT INTO Departments(dept_no,dept_name) VALUES('111','Electronics');
SHOW CREATE TABLE Departments;
SELECT * FROM Departments;
INSERT INTO Departments(dept_no,dept_name) VALUES('112','Mechanical');
INSERT INTO Departments(dept_no,dept_name) VALUES('113','Aeronuatics');
INSERT INTO Departments(dept_no,dept_name) VALUES('114','electrical');
INSERT INTO Departments(dept_no,dept_name) VALUES('115','civil');
INSERT INTO Employees VALUES('1','adam','smith','1988-07-25','2015-01-21','M');
SELECT * FROM Employees;
INSERT INTO Employees VALUES('1','adam','smith','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('2','amith','jain','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('3','bob','smith','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('4','ellen','de','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('5','oprah','winfrey','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('6','lucy','david','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('7','michael','jr','1988-07-25','2015-01-21','M');
INSERT INTO Employees VALUES('20','mike','jr','1988-07-25','2015-01-21','M');
UPDATE Employees SET gender='F' WHERE firstname='ellen';
UPDATE Employees SET gender='F' WHERE firstname='oprah' OR firstname='lucy';
DROP TABLE Employees;
DROP TABLE dept_employeRelation; 
DROP TABLE Employees;
INSERT INTO Employees VALUES('1','adam','smith','1988-07-25','2015-01-21','M'),('2','amith','jain','1989-08-21','2014-12-11','M');
INSERT INTO Employees VALUES('3','bob','smith','1986-04-25','2013-02-21','M'),('4','ellen','de','1985-03-05','2012-04-01','F'),
('5','oprah','winfrey','1987-12-15','2014-06-08','F'),('6','lucy','david','1988-05-20','2014-03-26','F'),('7','michael','jr','1985-07-20','2012-05-05','M');
INSERT INTO dept_employeRelation VALUES('1','113','2015-01-21','2016-01-21'),('2','112','2014-12-11','2016-02-01'),('3','111','2014-03-11','2017-01-01'),('3','112','2013-02-21','2014-03-11'),
('4','114','2012-04-01','2015-02-11'),('5','115','2014-06-08','2017-03-12'),('6','101','2014-03-26','2016-01-01'),('7','111','2012-05-05','2013-03-01');
SELECT * FROM dept_employeRelation;
CREATE TABLE Salaries(emp_no INT,salaryINdollars INT,from_date DATE,to_date DATE,PRIMARY KEY (emp_no));
DESC Salaries;
INSERT INTO Salaries VALUES('1','3000','2015-01-21','2016-01-21');
INSERT INTO Salaries VALUES('2','3500','2014-12-11','2016-02-01'),('3','3750','2014-03-11','2017-01-01'),('3','3500','2013-02-21','2014-03-11'),
('4','4000','2012-04-01','2015-02-11'),('5','4350','2014-06-08','2017-03-12'),('6','4500','2014-03-26','2016-01-01'),('7','3000','2012-05-05','2013-03-01');
DESC dept_employeRelation;
DESC Salaries;
ALTER TABLE Salaries DROP PRIMARY KEY;
SELECT * FROM Salaries;
SELECT Employees.emp_no,firstname,lastname,dept_employeRelation.dept_no FROM Employees 
INNER JOIN dept_employeRelation ON dept_employeRelation.emp_no=Employees.emp_no;

SELECT Employees.emp_no,firstname,lastname,dept_employeRelation.dept_no FROM Employees 
LEFT JOIN dept_employeRelation ON Employees.emp_no=dept_employeRelation.emp_no;

SELECT Employees.emp_no,firstname,lastname,dept_employeRelation.dept_no FROM Employees 
RIGHT JOIN dept_employeRelation ON Employees.emp_no=dept_employeRelation.emp_no;

SELECT Emp.firstname,Emp.lastname,dept.dept_name FROM Employees AS Emp
INNER JOIN dept_employeRelation AS Rel ON Emp.emp_no=Rel.emp_no
INNER JOIN Departments AS dept ON dept.dept_no=Rel.dept_no;

SELECT * FROM Employees
INNER JOIN dept_employeRelation ON Employees.emp_no=dept_employeRelation.emp_no
INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no;

SELECT firstname,lastname,dept_name ,COUNT(dept_employeRelation.emp_no) FROM Employees
INNER JOIN dept_employeRelation ON dept_employeRelation.emp_no=Employees.emp_no
INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no
WHERE dept_name='civil';

SELECT COUNT(emp_no) FROM dept_employeRelation 
INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no
WHERE dept_name='civil';

SELECT dept_name,COUNT(emp_no) FROM Departments
INNER JOIN dept_employeRelation ON Departments.dept_no=dept_employeRelation.dept_no;

SELECT * FROM dept_employeRelation;

SELECT COUNT(*) FROM dept_employeRelation;


SELECT * FROM dept_employeRelation ORDER BY dept_no ASC;

SELECT dept_no, COUNT(*) AS employee_count FROM dept_employeRelation GROUP BY dept_no ORDER BY dept_no ASC;

SELECT * FROM dept_employeRelation WHERE emp_no = 2 OR emp_no = 3;

SELECT dept_name ,COUNT(*) FROM Departments
INNER JOIN dept_employeRelation ON Departments.dept_no=dept_employeRelation.dept_no
GROUP BY dept_name;

SELECT * FROM dept_employeRelation INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no
WHERE dept_name='Electronics';

SELECT firstname,lastname,salary,  from_date, to_date FROM Employees
INNER JOIN Salaries ON Employees.emp_no=Salaries.emp_no
WHERE to_date > '2017-01-01' AND to_date< '2018-01-01';

SELECT curdate(), now(), curtime() ;
DESC Employees;
DESC Salaries;

SELECT firsSELECT firstname,lastname,dept_name FROM dept_employeRelation
INNER JOIN Employees ON Employees.emp_no=dept_employeRelation.emp_no
INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no
WHERE dept_name='Civil';

SELECT firstname,lastname,dept_name FROM Employees
INNER JOIN dept_employeRelation ON Employees.emp_no=dept_employeRelation.emp_no
INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no
WHERE dept_name='Civil';

SELECT  dept_name,COUNT(dept_name) FROM Employees
INNER JOIN dept_employeRelation ON Employees.emp_no=dept_employeRelation.emp_no
INNER JOIN Departments ON Departments.dept_no=dept_employeRelation.dept_no
GROUP BY dept_name;

SELECT * FROM dept_employeRelation;

SELECT firstname,lastname,MAX(salary) FROM Employees
INNER JOIN Salaries ON Employees.emp_no=Salaries.emp_no;

DESC Salaries;

DESC Employees;

SELECT dept_name ,AVG(salary)FROM Departments
INNER JOIN dept_employeRelation ON Departments.dept_no=dept_employeRelation.dept_no
INNER JOIN Employees ON Employees.emp_no=dept_employeRelation.emp_no
INNER JOIN Salaries ON Salaries.emp_no=Employees.emp_no
GROUP BY dept_name;

SELECT DISTINCT firstname,lastname,salary FROM Employees
INNER JOIN Salaries on Employees.emp_no=Salaries.emp_no
ORDER BY salary ASC;