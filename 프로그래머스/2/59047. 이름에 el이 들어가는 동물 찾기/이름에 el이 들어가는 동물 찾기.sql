-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
  FROM ANIMAL_INS
 WHERE 1=1
   AND ANIMAL_TYPE = 'Dog'
  -- AND UPPER(NAME) LIKE '%EL%'
   AND (NAME LIKE '%EL%'
    OR NAME LIKE '%El%'
    OR NAME LIKE '%eL%'
    OR NAME LIKE '%el%')
 ORDER BY NAME