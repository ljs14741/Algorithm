-- 코드를 입력하세요
SELECT ANIMAL_TYPE 
     , COUNT(*)
  FROM ANIMAL_INS
 WHERE 1=1
   AND ANIMAL_TYPE IN ('Cat', 'Dog')
 GROUP BY ANIMAL_TYPE
 ORDER BY ANIMAL_TYPE