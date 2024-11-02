create table accounts (id bigint not null, balance integer, customer_id bigint, primary key (id));

CREATE TABLE hibernate_sequence (
                                    next_val BIGINT NOT NULL
);

INSERT INTO hibernate_sequence VALUES (1);
