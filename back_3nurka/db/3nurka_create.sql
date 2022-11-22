-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-22 12:24:18.884

-- tables
-- Table: address
CREATE TABLE address
(
    id           serial       NOT NULL,
    order_id     int          NOT NULL,
    city_area_id int          NOT NULL,
    area         varchar(255) NOT NULL,
    street_name  varchar(255) NOT NULL,
    CONSTRAINT address_pk PRIMARY KEY (id)
);

-- Table: bike
CREATE TABLE bike
(
    id        serial       NOT NULL,
    order_id  int          NOT NULL,
    model     varchar(255) NOT NULL,
    work_date int          NOT NULL,
    CONSTRAINT bike_pk PRIMARY KEY (id)
);

-- Table: city_area
CREATE TABLE city_area
(
    id   serial       NOT NULL,
    name varchar(255) NOT NULL,
    CONSTRAINT city_area_pk PRIMARY KEY (id)
);

-- Table: customer
CREATE TABLE customer
(
    id         serial       NOT NULL,
    user_id    int          NOT NULL,
    first_name varchar(255) NOT NULL,
    last_name  varchar(255) NOT NULL,
    email      varchar(255) NOT NULL,
    CONSTRAINT customer_pk PRIMARY KEY (id)
);

-- Table: order
CREATE TABLE "order"
(
    id      serial       NOT NULL,
    user_id int          NOT NULL,
    number  int          NOT NULL,
    date    timestamp    NOT NULL,
    address varchar(255) NOT NULL,
    price   int          NOT NULL,
    CONSTRAINT order_ak_1 UNIQUE (number) NOT DEFERRABLE INITIALLY IMMEDIATE,
    CONSTRAINT order_pk PRIMARY KEY (id)
);

-- Table: repairs
CREATE TABLE repairs
(
    id           serial       NOT NULL,
    bike_id      int          NOT NULL,
    tech_comment varchar(255) NOT NULL,
    description  varchar(255) NOT NULL,
    CONSTRAINT repairs_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role
(
    id   serial       NOT NULL,
    type varchar(255) NOT NULL,
    CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: storage
CREATE TABLE storage
(
    id       serial NOT NULL,
    bike_id  int    NOT NULL,
    end_date int    NOT NULL,
    CONSTRAINT storage_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user"
(
    id       serial       NOT NULL,
    role_id  int          NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: address_city_area (table: address)
ALTER TABLE address
    ADD CONSTRAINT address_city_area
        FOREIGN KEY (city_area_id)
            REFERENCES city_area (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: address_order (table: address)
ALTER TABLE address
    ADD CONSTRAINT address_order
        FOREIGN KEY (order_id)
            REFERENCES "order" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: bike_order (table: bike)
ALTER TABLE bike
    ADD CONSTRAINT bike_order
        FOREIGN KEY (order_id)
            REFERENCES "order" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: customer_user (table: customer)
ALTER TABLE customer
    ADD CONSTRAINT customer_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: order_user (table: order)
ALTER TABLE "order"
    ADD CONSTRAINT order_user
        FOREIGN KEY (user_id)
            REFERENCES "user" (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: repairs_bike (table: repairs)
ALTER TABLE repairs
    ADD CONSTRAINT repairs_bike
        FOREIGN KEY (bike_id)
            REFERENCES bike (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: storage_bike (table: storage)
ALTER TABLE storage
    ADD CONSTRAINT storage_bike
        FOREIGN KEY (bike_id)
            REFERENCES bike (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user"
    ADD CONSTRAINT user_role
        FOREIGN KEY (role_id)
            REFERENCES role (id)
            NOT DEFERRABLE
                INITIALLY IMMEDIATE
;

-- End of file.

