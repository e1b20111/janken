CREATE TABLE userInfo (
    id IDENTITY PRIMARY KEY,
    userName VARCHAR NOT NULL
);

CREATE TABLE matchRes (
    id IDENTITY PRIMARY KEY,
    user1id INT,
    user2id INT,
    user1hand VARCHAR,
    user2hand VARCHAR
);
