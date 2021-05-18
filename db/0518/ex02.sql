select empno, ename, sal,job,
case job
when 'analyst' then sal *1.1
when 'clerk' then sal*1.2
when 'manager' then sal *1.3
when 'president' then sal *1.4
else sal
end
from emp;
