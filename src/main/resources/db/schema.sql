CREATE TABLE IF NOT EXISTS `t_ipo_details` (
`id` INTEGER  PRIMARY KEY AUTO_INCREMENT,
`company_id` INTEGER NOT NULL,
`company_name` VARCHAR(200),
`exchange_code` VARCHAR(50) NOT NULL,
`exchange_name` VARCHAR(200),
`price_per_share` DECIMAL,
`share_count` INTEGER,
`open_date` DATE,
`remark` VARCHAR(255)
);