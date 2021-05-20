TYPE=VIEW
query=select `e`.`empno` AS `empno`,`e`.`ename` AS `ename`,ifnull(`m`.`ename`,\'¾øÀ½\') AS `ifnull(m.ename,\'¾øÀ½\')` from (`sample`.`emp` `e` left join `sample`.`emp` `m` on(`e`.`mgr` = `m`.`empno`))
md5=54e52369d39bd06f118583948f0ffdfe
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2021-05-20 07:50:16
create-version=2
source=select e.empno,e.ename,ifnull(m.ename,\'¾øÀ½\')\nfrom emp e left outer join emp m\non(e.mgr = m.empno)
client_cs_name=euckr
connection_cl_name=euckr_korean_ci
view_body_utf8=select `e`.`empno` AS `empno`,`e`.`ename` AS `ename`,ifnull(`m`.`ename`,\'ì—†ìŒ\') AS `ifnull(m.ename,\'ì—†ìŒ\')` from (`sample`.`emp` `e` left join `sample`.`emp` `m` on(`e`.`mgr` = `m`.`empno`))
mariadb-version=100510
