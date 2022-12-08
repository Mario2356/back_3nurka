INSERT INTO public.role (id, type) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'customer');

INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Mustamäe');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Lasnamäe');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Nõmme');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Pirita');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Haabersti');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Põhja-Tallinn');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Kesklinn');
INSERT INTO public.district (id, name) VALUES (DEFAULT, 'Kristiine');

INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 1, 'Kastani1 ', '+372 555611');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 1, 'Kastani 8', '+372 555000');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 2, 'Tuule 3', '+372 555001');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 2, 'Lepa 15-2', '+372 555999');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 3, 'Pikk 12-6', '+372 555333');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 3, 'Lepa 19', '+372 555100');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 4, 'Mardi 15-9', '+372 555888');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 4, 'Mardi 15-10', '+372 555333');
INSERT INTO public.address (id, district_id, street_name, phone) VALUES (DEFAULT, 5, 'Tiiva 19', '+372 555777');

INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 1, 'Mari', 'Sepp');
INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 1, 'Jaan', 'Sepp');
INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 2, 'Leila', 'Saar');
INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 2, 'Mario', 'Saar');
INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 3, 'Tiit', 'Tiitson');
INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 4, 'Tom', 'Tomson');
INSERT INTO public.customer (id, address_id, first_name, last_name) VALUES (DEFAULT, 5, 'Kati', 'Sepp');

INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 1, NULL, 'admin', '123');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 2, 'mari@mail.ee', '123');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 1, 'jaan@mail.ee', '123');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 3, 'leila', '123');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 4, 'mario', '456');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 5, 'tiit@mail.ee', '123');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 6, 'tom@mail.ee', '123');
INSERT INTO public.user (id, role_id, customer_id, email, password) VALUES (DEFAULT, 2, 7, 'kati@mail.ee', '123');

INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Scott', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Merida', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Trek', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Cannondale', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Kona', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Specialized', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Santa Cruz', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Cervelo', DEFAULT);
INSERT INTO public.brand (id, name, is_other) VALUES (DEFAULT, 'Muu', true);

INSERT INTO public.order_status (id, name) VALUES (DEFAULT, 'Ootel');
INSERT INTO public.order_status (id, name) VALUES (DEFAULT, 'Aktiivne');
INSERT INTO public.order_status (id, name) VALUES (DEFAULT, 'Lõpetatud');

INSERT INTO public.work_type (id, name) VALUES (DEFAULT, 'Remont');
INSERT INTO public.work_type (id, name) VALUES (DEFAULT, 'Hooldus');
INSERT INTO public.work_type (id, name) VALUES (DEFAULT, 'Hoiustamine');

INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 1, 'Remondi hind', 5);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 2, 'Kevadine rattahooldus', 30);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 2, 'Sügisene rattahooldus', 40);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 2, 'Pakett - käigud, kett ja pidurid', 30);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 3, '1 kuu', 10);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 3, '3 kuud', 20);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 3, '6 kuud ', 30);

INSERT INTO public.bike_status (id, name) VALUES (DEFAULT, 'Aktiivne teenus');
INSERT INTO public.bike_status (id, name) VALUES (DEFAULT, 'Lõpetatud teenus');


INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 4, 4, 'must', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 5, 4, 'valge', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 4, 4, 'uus ratas', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 2, 5, 'naise ratas', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 3, 5, 'lapse ratas', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 2, 5, 'kollane minu ratas', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 4, 2, 'kollane', 'D');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 4, 2, 'must ', 'A');
INSERT INTO public.bike (id, brand_id, user_id, model, status) VALUES (DEFAULT, 4, 2, 'valge', 'A');

INSERT INTO public.order (id, user_id, status_id, address_id, number, date_from, date_to, price) VALUES (DEFAULT, 5, 1, NULL, '1670491847531', NULL, NULL, NULL);











