
CREATE TABLE CovidCases (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
date_reported DATE NOT NULL,
age_group VARCHAR(10) NOT NULL,
gender VARCHAR(10) NOT NULL,
outcome VARCHAR(50) NOT NULL,
reporting_phu VARCHAR(100) NOT NULL,
reporting_city VARCHAR(50) NOT NULL
);
INSERT INTO CovidCases (date_reported, age_group, gender, outcome, reporting_phu, reporting_city) VALUES
('2020-09-27', '60s', 'MALE', 'Resolved', 'York Region Public Health', 'Newmarket'),
('2020-09-20', '30s', 'FEMALE', 'Not Resolved', 'Peel Public Health', 'Mississauga'),
('2020-09-14', '40s', 'MALE', 'Resolved', 'Wellington-Dufferin-Guelph', 'Guelph'),
('2020-09-22', '<20', 'FEMALE', 'Resolved', 'Wellington-Dufferin-Guelph', 'Guelph'),
('2020-09-29', '70s', 'MALE', 'Not Resolved', 'Durham Region Health Department', 'Whitby'),
('2020-09-19', '50s', 'FEMALE', 'Resolved', 'Wellington-Dufferin-Guelph', 'Guelph'),
('2020-09-12', '80s', 'MALE', 'Resolved', 'York Region Public Health', 'Newmarket'),
('2020-09-16', '20s', 'FEMALE', 'Resolved', 'Wellington-Dufferin-Guelph', 'Guelph'),
('2020-09-11', '30s', 'MALE', 'Resolved', 'Region of Waterloo', '99 Regina Street South'),
('2020-09-28', '60s', 'FEMALE', 'Resolved', 'York Region Public Health', 'Newmarket');



