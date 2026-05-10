-- Run this in SQL Server Management Studio (SSMS)

CREATE DATABASE CollegeAdmission;
GO

USE CollegeAdmission;
GO

CREATE TABLE users (
    Username VARCHAR(50) PRIMARY KEY,
    Password VARCHAR(50) NOT NULL,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Gender VARCHAR(10) NOT NULL
);
GO

CREATE TABLE Students (
    NationalID VARCHAR(20) PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Major VARCHAR(50) NOT NULL,
    GPA FLOAT NOT NULL
);
GO
