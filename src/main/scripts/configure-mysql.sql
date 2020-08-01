## Use to run mysql db docker image, optional if you're not using a local mysqldb
# docker run --name mysqldb -p 3306:3306 -e MYSQL_ALLOW_EMPTY_PASSWORD=yes -d mysql

# connect to mysql and run as root user
#Create Databases
CREATE DATABASE mkd_dev;
CREATE DATABASE mkd_prod;

#Create database service accounts
CREATE USER 'mkd_dev_user'@'localhost' IDENTIFIED BY 'root';
CREATE USER 'mkd_prod_user'@'localhost' IDENTIFIED BY 'root';
CREATE USER 'mkd_dev_user'@'%' IDENTIFIED BY 'root';
CREATE USER 'mkd_prod_user'@'%' IDENTIFIED BY 'root';

#Database grants
GRANT SELECT ON mkd_dev.* to 'mkd_dev_user'@'localhost';
GRANT INSERT ON mkd_dev.* to 'mkd_dev_user'@'localhost';
GRANT DELETE ON mkd_dev.* to 'mkd_dev_user'@'localhost';
GRANT UPDATE ON mkd_dev.* to 'mkd_dev_user'@'localhost';
GRANT SELECT ON mkd_prod.* to 'mkd_prod_user'@'localhost';
GRANT INSERT ON mkd_prod.* to 'mkd_prod_user'@'localhost';
GRANT DELETE ON mkd_prod.* to 'mkd_prod_user'@'localhost';
GRANT UPDATE ON mkd_prod.* to 'mkd_prod_user'@'localhost';
GRANT SELECT ON mkd_dev.* to 'mkd_dev_user'@'%';
GRANT INSERT ON mkd_dev.* to 'mkd_dev_user'@'%';
GRANT DELETE ON mkd_dev.* to 'mkd_dev_user'@'%';
GRANT UPDATE ON mkd_dev.* to 'mkd_dev_user'@'%';
GRANT SELECT ON mkd_prod.* to 'mkd_prod_user'@'%';
GRANT INSERT ON mkd_prod.* to 'mkd_prod_user'@'%';
GRANT DELETE ON mkd_prod.* to 'mkd_prod_user'@'%';
GRANT UPDATE ON mkd_prod.* to 'mkd_prod_user'@'%';