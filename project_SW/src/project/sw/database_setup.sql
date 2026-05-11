-- Run this in SQL Server Management Studio (SSMS)

CREATE DATABASE CollegeAdmission;
GO

USE CollegeAdmission;
GO

CREATE TABLE staff (
    Username VARCHAR(50) PRIMARY KEY,
    Password VARCHAR(50) NOT NULL,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Gender VARCHAR(10) NOT NULL
);
GO

CREATE TABLE Students (
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    NationalID VARCHAR(20) PRIMARY KEY,
    Password VARCHAR(50) NOT NULL,
    Gender VARCHAR(10) NOT NULL,
    Major VARCHAR(50) NOT NULL,
);
GO

CREATE TABLE admin (
    Username VARCHAR(50) PRIMARY KEY,
    Password VARCHAR(50) NOT NULL,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Gender VARCHAR(10) NOT NULL
    );


    insert into dbo.admin values('mark120','12345','mark','michael','male');

    select * from admin;

    
