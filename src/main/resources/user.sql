#创建表
create table `user`(
	id int PRIMARY key auto_increment,
	`name` VARCHAR(20) not null comment '名字',
	age int,
	credits int,
	create_time datetime
);

#初始化数据
insert into `user`(`name`, age, credits, create_time) VALUES
('May', 5, 100, SYSDATE()),
('June', 6, 100, SYSDATE());