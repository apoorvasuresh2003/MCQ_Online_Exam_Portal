INSERT INTO users (username, password, enabled)
values ('user', 'acharya', true);
INSERT INTO users (username, password, enabled)
values ('admin', 'acharya', true);

INSERT INTO authorities (username, authority)
values ('user', 'ROLE_USER');
INSERT INTO authorities (username, authority)
values ('admin', 'ROLE_USER');
INSERT INTO authorities (username, authority)
values ('admin', 'ROLE_ADMIN');