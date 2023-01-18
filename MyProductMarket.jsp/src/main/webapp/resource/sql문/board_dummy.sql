#board 더미 데이터 만들기
DELIMITER $$
DROP PROCEDURE IF EXISTS insertLoop$$
 
CREATE PROCEDURE insertLoop()
BEGIN
    DECLARE i INT DEFAULT 1;
    WHILE i <= 200 DO
        INSERT INTO board(id, NAME, subject, content, regist_day, hit, ip)
				VALUES ('member1',concat('더미 이름',i),concat('더미 제목',i),concat('더미 내용',i),NOW(),0,'ip');
        SET i = i + 1;
    END WHILE;
END$$
DELIMITER $$

CALL insertLoop;
$$