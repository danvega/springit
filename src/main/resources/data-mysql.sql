INSERT INTO link (id,creation_date,last_modified_date,created_by,last_modified_by,title,url)
VALUES (1,NOW(),NOW(),null,null,'Getting Started with Spring Boot 2','https://therealdanvega.com/spring-boot-2');

INSERT INTO comment
(id,created_by,creation_date,last_modified_by,last_modified_date,body,link_id)
VALUES
(1,null,NOW(),null,NOW(),'What an awesome idea for a course!',1);