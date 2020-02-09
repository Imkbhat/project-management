insert into employee(employee_id, first_name, last_name, email) values(1, 'Kiran','Bhatt','kb@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(2, 'Virat','Kohli','vk@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(3, 'Steven','Smith', 'ss@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(4, 'Kane', 'Williamson', 'kw@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(5, 'Joe', 'Root', 'jr@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(6, 'Rohit', 'Sharma', 'rs@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(7, 'Shreyas', 'Iyer', 'si@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(8, 'Jasprit', 'Bumrah', 'jb@gmail.com');
insert into employee(employee_id, first_name, last_name, email) values(9, 'Kevin', 'Pietersen', 'kp@gmail.com');

insert into project(project_id, name, stage, description) values(1000,'Large Production Deploy', 'NOTSTARTED', 'dEPLOYEMENT TO Production.');
insert into project(project_id, name, stage, description) values(1001,'New Employee Budget', 'COMPLETED', 'New Employee Hired.');
insert into project(project_id, name, stage, description) values(1002, 'Improve Internet Security', 'INPROGRESS', 'Need to improve Internet Security.');

insert into project_employee(employee_id, project_id) values(1,1000);
insert into project_employee(employee_id, project_id) values(1,1001);
insert into project_employee(employee_id, project_id) values(1,1002);
insert into project_employee(employee_id, project_id) values(2,1000);
insert into project_employee(employee_id, project_id) values(3,1000);
insert into project_employee(employee_id, project_id) values(4,1001);
insert into project_employee(employee_id, project_id) values(5,1002);
insert into project_employee(employee_id, project_id) values(6,1001);
insert into project_employee(employee_id, project_id) values(7,1002);
insert into project_employee(employee_id, project_id) values(8,1002);
insert into project_employee(employee_id, project_id) values(9,1001);