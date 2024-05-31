

--SQLD029 特定の経験年数以上の医師を集計する(GROUP BY)

CREATE TABLE doctor(
    doctor_id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    specialty VARCHAR(100),
    qualification VARCHAR(50),
    years_of_experience INT,
    contact_number VARCHAR(15),
    email VARCHAR(100),
    work_days VARCHAR(50),
    office_hours VARCHAR(50),
    department_id INT,
    joining_date DATE,
    salary DECIMAL(10,2),
    status VARCHAR(20),
    del_flag VARCHAR(1) NOT NULL DEFAULT '0',
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

--DROP TABLE doctor;

--データ全件削除
delete from doctor;

--データ登録
-- 経験年数が10年以上の医師（5名）
INSERT INTO doctor (doctor_id, name, specialty, qualification, years_of_experience, contact_number, email, work_days, office_hours, department_id, joining_date, salary, status, del_flag, created_at, updated_at) VALUES
(1, '山田太郎', '内科', '医学博士', 15, '080-1234-5678', 'yamada@example.com', '月曜日から金曜日', '9:00-17:00', 1, '2010-04-01', 700000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(2, '鈴木一郎', '内科', '医学修士', 12, '080-5678-1234', 'suzuki@example.com', '火曜日から土曜日', '10:00-18:00', 2, '2008-05-15', 750000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(3, '田中恵美', '内科', '医学博士', 20, '080-8765-4321', 'tanaka@example.com', '水曜日から日曜日', '8:00-16:00', 3, '2003-09-10', 680000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(4, '伊藤浩司', '外科', '医学博士', 18, '080-2345-6789', 'ito@example.com', '月曜日から金曜日', '9:00-15:00', 4, '2002-03-20', 710000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(5, '佐藤絵里', '外科', '医学博士', 22, '080-5432-1987', 'sato@example.com', '火曜日から土曜日', '10:00-19:00', 5, '2000-07-30', 890000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- 経験年数が10年未満の医師（3名）
INSERT INTO doctor (doctor_id, name, specialty, qualification, years_of_experience, contact_number, email, work_days, office_hours, department_id, joining_date, salary, status, del_flag, created_at, updated_at) VALUES
(6, '加藤次郎', '神経科', '医学修士', 8, '080-1122-3344', 'kato@example.com', '水曜日から日曜日', '11:00-20:00', 6, '2015-11-01', 660000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(7, '中村典子', '産婦人科', '医学博士', 5, '080-4455-6677', 'nakamura@example.com', '月曜日から金曜日', '9:00-17:00', 7, '2018-08-25', 640000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
(8, '森本健', '眼科', '医学修士', 3, '080-5566-7788', 'morimoto@example.com', '火曜日から土曜日', '8:00-14:00', 8, '2020-04-15', 530000.00, '在籍', '0', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

SELECT specialty AS 専門分野, COUNT(*) AS 医師の数
FROM doctor 
WHERE years_of_experience >= 10
GROUP BY specialty
HAVING COUNT(*) >= 3;
