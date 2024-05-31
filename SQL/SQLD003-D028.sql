CREATE TABLE patient(
    patient_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    gender VARCHAR(10),
    date_of_birth DATE,
    address VARCHAR(255),
    contact_number VARCHAR(15),
    emergency_contact VARCHAR(15),
    del_flag VARCHAR(1) NOT NULL DEFAULT '0',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
--DROP TABLE patient;

INSERT INTO patient
VALUES (
    '101',
    '田中一郎',
    '男性',
    '1990-05-15',
    '大阪府大阪市北区',
    '090-1234-5678',
    '080-8765-4321'
);

DELETE FROM patient;

INSERT INTO patient(
    patient_id
    , name
    , gender
    , date_of_birth
    , address
    , contact_number
    , emergency_contact
    , del_flag
    , created_at
    , updated_at
)
VALUES (
     1
    , '山田太郎'
    , '男性'
    , '1992-03-15'
    , '東京都渋谷区'
    , '080-1234-5678'
    , '080-8765-4321'
    , '0'
    , CURRENT_TIMESTAMP
    , CURRENT_TIMESTAMP
) 
, ( 
    2
    , '鈴木一郎'
    , '男性'
    , '1984-07-20'
    , '神奈川県横浜市'
    , '080-5678-1234'
    , '080-4321-8765'
    , '0'
    , CURRENT_TIMESTAMP
    , CURRENT_TIMESTAMP
) 
, ( 
    3
    , '佐藤花子'
    , '女性'
    , '1990-11-30'
    , '埼玉県さいたま市'
    , '080-8765-4321'
    , '080-1234-5678'
    , '0'
    , CURRENT_TIMESTAMP
    , CURRENT_TIMESTAMP
);

SELECT patient_id
    , name
    , gender
    , date_of_birth
    , address
    , contact_number
FROM patient;

SELECT * FROM patient WHERE address='東京都渋谷区';

SELECT * FROM patient 
WHERE gender='女性'
AND date_of_birth <= '1991-01-01';

SELECT * FROM patient
WHERE address='東京都渋谷区'
OR address='神奈川県横浜市';

SELECT name,date_of_birth
FROM patient
WHERE gender='男性'
ORDER BY date_of_birth DESC;

UPDATE patient
SET emergency_contact='080-1122-3344'
WHERE name='山田太郎';


DELETE FROM patient
WHERE name='山田太郎';

UPDATE patient
SET del_flag='1'
WHERE name='鈴木一郎' AND del_flag='0';

DELETE FROM patient;

INSERT INTO patient(
    patient_id
    , name
    , gender
    , date_of_birth
    , address
    , contact_number
    , emergency_contact
    , del_flag
    , created_at
    , updated_at
)
VALUES (
     1
    , '山田太郎'
    , '男性'
    , '1992-03-15'
    , '東京都渋谷区'
    , '080-1234-5678'
    , '080-8765-4321'
    , '0'
    , CURRENT_TIMESTAMP
    , CURRENT_TIMESTAMP
) 
, ( 
    2
    , '鈴木一郎'
    , '男性'
    , '1984-07-20'
    , '神奈川県横浜市'
    , '080-5678-1234'
    , '080-4321-8765'
    , '0'
    , CURRENT_TIMESTAMP
    , CURRENT_TIMESTAMP
) 
, ( 
    3
    , '佐藤花子'
    , '女性'
    , '1990-11-30'
    , '埼玉県さいたま市'
    , '080-8765-4321'
    , '080-1234-5678'
    , '0'
    , CURRENT_TIMESTAMP
    , CURRENT_TIMESTAMP
);

SELECT name, date_of_birth
FROM patient
ORDER BY date_of_birth DESC
LIMIT 1;

SELECT * FROM patient
WHERE name LIKE '%太郎%';

SELECT * FROM patient
WHERE contact_number LIKE '080-%';

SELECT * FROM patient
WHERE patient_id IN ('1','3','5');

SELECT * FROM patient
WHERE date_of_birth BETWEEN '1990-01-01' AND '2000-12-31';

SELECT patient_id AS 患者ID, name AS 患者名
FROM patient;


delete from patient;
delete from examination_result;

--データ登録
INSERT INTO patient (patient_id, name, gender, date_of_birth, address, contact_number, emergency_contact, del_flag, created_at, updated_at) VALUES
(1, '山田太郎', '男性', '1985-04-23', '東京都渋谷区', '080-1234-5678', '080-8765-4321', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, '鈴木花子', '女性', '1990-11-30', '大阪府大阪市', '080-5678-1234', '080-4321-8765', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO examination_result (examination_id, patient_id, examination_date, examination_type, examination_result, del_flag, created_at, updated_at) VALUES
(1, 1, '2023-05-10', '血液検査', '正常', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, 2, '2023-05-15', '心電図', '異常あり', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


SELECT p.name AS 患者名, e.examination_date AS 検査日, e.examination_type AS 検査種類, e.examination_result AS 検査結果
FROM patient p
INNER JOIN examination_result e
ON p.patient_id=e.patient_id
WHERE examination_result='正常';

delete from patient;
delete from examination_result;

--データ登録
INSERT INTO patient (patient_id, name, gender, date_of_birth, address, contact_number, emergency_contact, del_flag, created_at, updated_at) VALUES
(1, '山田太郎', '男性', '1985-04-23', '東京都渋谷区', '080-1234-5678', '080-8765-4321', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, '鈴木花子', '女性', '1990-11-30', '大阪府大阪市', '080-5678-1234', '080-4321-8765', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


-- 山田太郎さんに対する検査結果が存在、鈴木花子さんには検査結果がないため、このテーブルには挿入しない
INSERT INTO examination_result (examination_id, patient_id, examination_date, examination_type, examination_result, del_flag, created_at, updated_at) VALUES
(1, 1, '2023-05-10', '血液検査', '正常', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

SELECT p.name, e.examination_result
FROM patient p
LEFT JOIN examination_result e
ON p.patient_id=e.patient_id;

SELECT p.name AS 患者名, e.examination_date AS 検査日, e.examination_result AS 検査結果
FROM examination_result e
RIGHT JOIN patient p
ON p.patient_id=e.patient_id;

--データ全件削除
delete from patient;

--データ登録
INSERT INTO patient (patient_id, name, gender, date_of_birth, address, contact_number, emergency_contact, del_flag, created_at, updated_at) VALUES
(1, '山田太郎', '男性', '1985-04-23', '東京都渋谷区', '080-1234-5678', '080-8765-4321', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, '鈴木花子', '女性', '1990-11-30', '大阪府大阪市', '080-5678-1234', '080-4321-8765', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, '田中一郎', '男性', '1980-06-15', '北海道札幌市', '080-8765-4321', '080-1234-5678', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

SELECT name
FROM patient
WHERE date_of_birth BETWEEN '1985-01-01' AND '1985-12-31'

UNION

SELECT name
FROM patient
WHERE date_of_birth BETWEEN '1990-01-01' AND '1990-12-31';

--データ全件削除
delete from patient;

--データ登録
INSERT INTO patient (patient_id, name, gender, date_of_birth, address, contact_number, emergency_contact, del_flag, created_at, updated_at) VALUES
(1, '山田太郎', '男性', '1985-04-23', '東京都渋谷区', '080-1234-5678', '080-8765-4321', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, '鈴木花子', '女性', '1990-11-30', '大阪府大阪市', '080-5678-1234', '080-4321-8765', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, '田中一郎', '男性', '1980-06-15', '北海道札幌市', NULL, '080-1234-5678', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

SELECT name, contact_number
FROM patient
WHERE contact_number IS NOT NULL;

SELECT * FROM patient
WHERE contact_number IS NULL;

DELETE FROM patient
WHERE date_of_birth < '1990-01-01';

--データ全件削除
delete from patient;

--データ登録
INSERT INTO patient (patient_id, name, gender, date_of_birth, address, contact_number, emergency_contact, del_flag, created_at, updated_at) VALUES
(1, '山田太郎', '男性', '1985-04-23', '東京都渋谷区', '080-1234-5678', '080-8765-4321', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, '鈴木花子', '女性', '1990-11-30', '大阪府大阪市', '080-5678-1234', '080-4321-8765', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, '田中一郎', '男性', '1980-06-15', '北海道札幌市', '080-8765-4321', '080-1234-5678', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(4, '佐藤真一', '男性', '1975-08-25', '福岡県福岡市', '080-1122-3344', '080-2233-4455', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(5, '伊藤園子', '女性', '1988-03-05', '千葉県千葉市', '080-3344-5566', '080-4455-6677', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(6, '小林幸子', NULL, '1982-07-20', '愛知県名古屋市', '080-5566-7788', '080-6677-8899', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(7, '高橋健太', NULL, '1992-12-11', '神奈川県横浜市', '080-7788-9900', '080-8899-0011', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

SELECT gender AS 性別, COUNT(*) AS 患者数
FROM patient 
WHERE gender IS NOT NULL
GROUP BY gender;