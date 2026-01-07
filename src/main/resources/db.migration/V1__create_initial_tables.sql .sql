CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE room (
	"number" int4 NOT NULL,
	price_per_night numeric(38,2) NOT NULL,
	qtd_beds_available int4,
	description varchar(255),
	status varchar(255) NOT NULL,
	"type" varchar(255) NOT NULL,
	CONSTRAINT room_pkey PRIMARY KEY ("number")
);

CREATE TYPE reservation_status AS ENUM ('CONFIRMED', 'CANCELED', 'NO_SHOW');

CREATE TABLE reservation (
	id uuid PRIMARY KEY DEFAULT gen_random_uuid(),
	check_in timestamp NOT NULL,
	check_out timestamp NOT NULL,
	room_id int4 NOT NULL,
	status varchar(255) NOT NULL,
	-- status reservation_status NOT NULL,
	CONSTRAINT reservation_pkey PRIMARY KEY (id),
	CONSTRAINT fk_room FOREIGN KEY (room_id) REFERENCES room(id) ON DELETE CASCADE
);

CREATE TABLE guest (
	document_number varchar(255) NOT NULL,
	email varchar(255),
	full_name varchar(255) NOT NULL,
	is_reservation_holder bool,
	reservation_id uuid NOT NULL,
	CONSTRAINT guest_pkey PRIMARY KEY (document_number),
	CONSTRAINT fk_guest_reservation FOREIGN KEY (reservation_id) REFERENCES reservation(id) ON DELETE CASCADE
);

CREATE TABLE extracharges (
	id uuid NOT NULL DEFAULT gen_random_uuid(),
	amount numeric(38,2) NOT NULL,
	description varchar(255) NOT NULL,
	reservation_id uuid NOT NULL,
	CONSTRAINT extracharges_pkey PRIMARY KEY (id),
	CONSTRAINT fk_extracharges_reservation FOREIGN KEY (reservation_id) REFERENCES reservation(id) ON DELETE CASCADE
);