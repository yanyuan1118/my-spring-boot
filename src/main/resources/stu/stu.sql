CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(20) NOT NULL,
  `stu_no` BIGINT NOT NULL COMMENT '学号',
	`create_time` datetime COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;
INSERT INTO `student`(`name`, `stu_no`) VALUES
('aaa', 1001),
('bbb', 1002),
('ccc', 1003);