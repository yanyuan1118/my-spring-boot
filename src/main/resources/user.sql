#创建表
create table `user`(
	id int PRIMARY key auto_increment,
	`name` VARCHAR(20) not null comment '名字',
	age int,
	create_time datetime
);

#插入数据
insert into `user`(`name`, age, create_time) VALUES
('May', 5, SYSDATE()),
('June', 6, SYSDATE());