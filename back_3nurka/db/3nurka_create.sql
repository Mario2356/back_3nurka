-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-11-28 12:08:52.981

-- tables
-- Table: address
CREATE TABLE address (
                         id serial  NOT NULL,
                         district_id int  NOT NULL,
                         street_name varchar(50)  NOT NULL,
                         CONSTRAINT address_pk PRIMARY KEY (id)
);

-- Table: bike
CREATE TABLE bike (
                      id serial  NOT NULL,
                      brand_id int  NOT NULL,
                      user_id int  NOT NULL,
                      model varchar(255)  NULL,
                      CONSTRAINT bike_pk PRIMARY KEY (id)
);

-- Table: bike_order
CREATE TABLE bike_order (
                            id serial  NOT NULL,
                            order_id int  NOT NULL,
                            bike_id int  NOT NULL,
                            work_type_id int  NOT NULL,
                            bike_status_id int  NOT NULL,
                            package_id int  NULL,
                            date_from date  NOT NULL,
                            date_to date  NULL,
                            tech_comment varchar(1000)  NULL,
                            customer_comment varchar(1000)  NULL,
                            CONSTRAINT bike_order_pk PRIMARY KEY (id)
);

-- Table: bike_status
CREATE TABLE bike_status (
                             id serial  NOT NULL,
                             name varchar(20)  NOT NULL,
                             CONSTRAINT bike_status_ak_1 UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                             CONSTRAINT bike_status_pk PRIMARY KEY (id)
);

-- Table: brand
CREATE TABLE brand (
                       id serial  NOT NULL,
                       name varchar(255)  NOT NULL,
                       is_other boolean  NOT NULL DEFAULT false,
                       CONSTRAINT brand_pk PRIMARY KEY (id)
);

-- Table: customer
CREATE TABLE customer (
                          id serial  NOT NULL,
                          address_id int  NULL,
                          first_name varchar(255)  NOT NULL,
                          last_name varchar(255)  NOT NULL,
                          CONSTRAINT customer_pk PRIMARY KEY (id)
);

-- Table: district
CREATE TABLE district (
                          id serial  NOT NULL,
                          name varchar(255)  NOT NULL,
                          CONSTRAINT district_ak_1 UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                          CONSTRAINT city_area_pk PRIMARY KEY (id)
);

-- Table: order
CREATE TABLE "order" (
                         id serial  NOT NULL,
                         user_id int  NOT NULL,
                         status_id int  NOT NULL,
                         address_id int  NULL,
                         number varchar(20)  NOT NULL,
                         date_from date  NULL DEFAULT NOW(),
                         date_to date  NULL,
                         price int  NULL,
                         CONSTRAINT order_ak_1 UNIQUE (number) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                         CONSTRAINT order_pk PRIMARY KEY (id)
);

-- Table: order_status
CREATE TABLE order_status (
                              id serial  NOT NULL,
                              name varchar(20)  NOT NULL,
                              CONSTRAINT order_status_ak_1 UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                              CONSTRAINT order_status_pk PRIMARY KEY (id)
);

-- Table: package
CREATE TABLE package (
                         id serial  NOT NULL,
                         work_type_id int  NOT NULL,
                         name varchar(255)  NOT NULL,
                         price int  NOT NULL,
                         CONSTRAINT package_pk PRIMARY KEY (id)
);

-- Table: role
CREATE TABLE role (
                      id serial  NOT NULL,
                      type varchar(255)  NOT NULL,
                      CONSTRAINT role_ak_1 UNIQUE (type) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                      CONSTRAINT role_pk PRIMARY KEY (id)
);

-- Table: user
CREATE TABLE "user" (
                        id serial  NOT NULL,
                        role_id int  NOT NULL,
                        customer_id int  NULL,
                        email varchar(50)  NOT NULL,
                        password varchar(50)  NOT NULL,
                        CONSTRAINT user_ak_1 UNIQUE (email) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                        CONSTRAINT user_pk PRIMARY KEY (id)
);

-- Table: work_type
CREATE TABLE work_type (
                           id serial  NOT NULL,
                           name varchar(255)  NOT NULL,
                           CONSTRAINT work_type_ak_1 UNIQUE (name) NOT DEFERRABLE  INITIALLY IMMEDIATE,
                           CONSTRAINT work_type_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: address_district (table: address)
ALTER TABLE address ADD CONSTRAINT address_district
    FOREIGN KEY (district_id)
        REFERENCES district (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_brand (table: bike)
ALTER TABLE bike ADD CONSTRAINT bike_brand
    FOREIGN KEY (brand_id)
        REFERENCES brand (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_order_bike (table: bike_order)
ALTER TABLE bike_order ADD CONSTRAINT bike_order_bike
    FOREIGN KEY (bike_id)
        REFERENCES bike (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_order_bike_status (table: bike_order)
ALTER TABLE bike_order ADD CONSTRAINT bike_order_bike_status
    FOREIGN KEY (bike_status_id)
        REFERENCES bike_status (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_order_order (table: bike_order)
ALTER TABLE bike_order ADD CONSTRAINT bike_order_order
    FOREIGN KEY (order_id)
        REFERENCES "order" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_order_package (table: bike_order)
ALTER TABLE bike_order ADD CONSTRAINT bike_order_package
    FOREIGN KEY (package_id)
        REFERENCES package (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_order_work_type (table: bike_order)
ALTER TABLE bike_order ADD CONSTRAINT bike_order_work_type
    FOREIGN KEY (work_type_id)
        REFERENCES work_type (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: bike_user (table: bike)
ALTER TABLE bike ADD CONSTRAINT bike_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: customer_address (table: customer)
ALTER TABLE customer ADD CONSTRAINT customer_address
    FOREIGN KEY (address_id)
        REFERENCES address (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_address (table: order)
ALTER TABLE "order" ADD CONSTRAINT order_address
    FOREIGN KEY (address_id)
        REFERENCES address (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_status (table: order)
ALTER TABLE "order" ADD CONSTRAINT order_status
    FOREIGN KEY (status_id)
        REFERENCES order_status (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: order_user (table: order)
ALTER TABLE "order" ADD CONSTRAINT order_user
    FOREIGN KEY (user_id)
        REFERENCES "user" (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: package_work_type (table: package)
ALTER TABLE package ADD CONSTRAINT package_work_type
    FOREIGN KEY (work_type_id)
        REFERENCES work_type (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_customer (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_customer
    FOREIGN KEY (customer_id)
        REFERENCES customer (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- Reference: user_role (table: user)
ALTER TABLE "user" ADD CONSTRAINT user_role
    FOREIGN KEY (role_id)
        REFERENCES role (id)
        NOT DEFERRABLE
            INITIALLY IMMEDIATE
;

-- End of file.

