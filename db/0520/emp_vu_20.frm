TYPE=VIEW
query=select `sample`.`emp`.`empno` AS `no`,`sample`.`emp`.`ename` AS `name`,`sample`.`emp`.`mgr` AS `manager`,`sample`.`emp`.`job` AS `job` from `sample`.`emp` where `sample`.`emp`.`deptno` = 20
md5=79d9677f054ed36f856cdfc057939e76
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2021-05-20 07:22:56
create-version=2
source=select empno no, ename name, mgr manager, job\nfrom emp\nwhere deptno=20
client_cs_name=euckr
connection_cl_name=euckr_korean_ci
view_body_utf8=select `sample`.`emp`.`empno` AS `no`,`sample`.`emp`.`ename` AS `name`,`sample`.`emp`.`mgr` AS `manager`,`sample`.`emp`.`job` AS `job` from `sample`.`emp` where `sample`.`emp`.`deptno` = 20
mariadb-version=100510
