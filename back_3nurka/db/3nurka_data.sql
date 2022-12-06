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

INSERT INTO public."user" (id, role_id, email, password) VALUES (DEFAULT, 1, 'admin', '123');
INSERT INTO public."user" (id, role_id, email, password) VALUES (DEFAULT, 2, 'mario', '456');
INSERT INTO public."user" (id, role_id, email, password) VALUES (DEFAULT, 2, 'leila', '456');

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

INSERT INTO public.bike_status (id, name) VALUES (DEFAULT, 'Aktiivne teenus');
INSERT INTO public.bike_status (id, name) VALUES (DEFAULT, 'Lõpetatud teenus');

INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 1, 'Remondi hind', 5);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 2, 'Kevadine rattahooldus', 30);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 2, 'Sügisene rattahooldus', 40);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 2, 'Pakett - käigud, kett ja pidurid', 30);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 3, '1 kuu', 10);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 3, '3 kuud', 20);
INSERT INTO public.package (id, work_type_id, name, price) VALUES (DEFAULT, 3, '6 kuud ', 30);









