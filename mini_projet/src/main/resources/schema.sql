DROP TABLE IF EXISTS Case2;

CREATE TABLE case2(
        case_id BIGINT AUTO_INCREMENT PRIMARY KEY,
        creation_date DATETIME NOT NULL,
        last_update_date DATETIME NOT NULL,
        title VARCHAR(255),
        description VARCHAR(2056)
);