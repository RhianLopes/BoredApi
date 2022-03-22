
CREATE SCHEMA bored;

USE bored;

CREATE TABLE activity (
    id              BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    activity        VARCHAR(255) NOT NULL,
    type            VARCHAR(255) NOT NULL,
    participants    INTEGER NOT NULL,
    PRIMARY KEY ( id )
);