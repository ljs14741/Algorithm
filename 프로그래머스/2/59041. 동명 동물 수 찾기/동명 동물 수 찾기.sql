-- -- 코드를 입력하세요
SELECT NAME
     , COUNT(*) AS COUNT
  FROM ANIMAL_INS
 WHERE 1=1
   AND NAME IS NOT NULL
 GROUP BY NAME
 HAVING COUNT(*) > 1
 ORDER BY NAME 
 
 
 -- SELECT * FROM ANIMAL_INS;
 