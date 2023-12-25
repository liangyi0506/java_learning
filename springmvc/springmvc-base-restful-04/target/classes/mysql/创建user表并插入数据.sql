CREATE TABLE `user` (
                        `user_id` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL ,
                        `user_name` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
                        PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

insert into `user`(`user_id`, `user_name`)
values ('001', 'Mike'),
       ('002', 'Tony'),
       ('003', 'Mary'),
       ('004', 'Tom'),
       ('005', 'Mike'),
       ('006', 'Tony'),
       ('007', 'Mary'),
       ('008', 'Tom'),
       ('009', 'Mike'),
       ('010', 'Tony'),
       ('011', 'Mary'),
       ('012', 'Tom')