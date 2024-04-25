-- 코드를 입력하세요
SELECT X.NAME, X.DATETIME FROM (
            SELECT *
              FROM ANIMAL_INS A
             WHERE 1=1
               AND NOT EXISTS( SELECT 1
                                 FROM ANIMAL_OUTS B
                                WHERE 1=1
                                  AND A.ANIMAL_ID = B.ANIMAL_ID	
               )
             ORDER BY A.DATETIME
) X
WHERE 1=1
 AND ROWNUM < 4