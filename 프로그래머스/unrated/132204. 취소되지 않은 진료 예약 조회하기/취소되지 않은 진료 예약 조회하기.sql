-- 코드를 입력하세요
SELECT A.APNT_NO, P.PT_NAME, P.PT_NO, D.MCDP_CD, D.DR_NAME, A.APNT_YMD FROM APPOINTMENT A
INNER JOIN (SELECT PT_NAME, PT_NO FROM PATIENT) P
INNER JOIN (SELECT DR_NAME, MCDP_CD, DR_ID FROM DOCTOR) D
ON P.PT_NO = A.PT_NO AND D.DR_ID = A.MDDR_ID
WHERE D.MCDP_CD = 'CS' AND A.APNT_YMD LIKE '2022-04-13%' AND A.APNT_CNCL_YN = 'N'
GROUP BY P.PT_NAME
ORDER BY A.APNT_YMD