CREATE TABLE demotable (
  id integer NOT NULL,
  name text
);

CREATE TABLE othertable (
  id integer NOT NULL,
  whatever text
);

ALTER TABLE ONLY demotable
ADD CONSTRAINT demo_table_pkey PRIMARY KEY (id);

ALTER TABLE ONLY othertable
ADD CONSTRAINT other_table_pkey PRIMARY KEY (id);
