INSERT INTO public.role (id, type) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, type) VALUES (DEFAULT, 'customer');

INSERT INTO public.city_area (id, name) VALUES (DEFAULT, 'Mustamäe');
INSERT INTO public.city_area (id, name) VALUES (DEFAULT, 'Lasnamäe');
INSERT INTO public.city_area (id, name) VALUES (DEFAULT, 'Nõmme');
INSERT INTO public.city_area (id, name) VALUES (DEFAULT, 'Pirita');

INSERT INTO public."user" (id, role_id, username, password) VALUES (DEFAULT, 1, 'admin', '123');
INSERT INTO public."user" (id, role_id, username, password) VALUES (DEFAULT, 2, 'mario', '456');
INSERT INTO public."user" (id, role_id, username, password) VALUES (DEFAULT, 2, 'leila', '456');

