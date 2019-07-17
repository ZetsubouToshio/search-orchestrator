-- search_source

create table search_source
(
    id int not null,
    name varchar(100) not null,
    description text
);

create unique index search_source_id_uindex
    on search_source (id);

create unique index search_source_name_uindex
    on search_source (name);

alter table search_source
    add constraint search_source_pk
        primary key (id);



INSERT INTO search_source(id, name, description) VALUES(1, 'github', '');
INSERT INTO search_source(id, name, description) VALUES(2, 'linkedin', '');

-- search_pattern

create table search_pattern
(
    uuid uuid not null,
    source_id int not null
        constraint search_pattern_search_source_id_fk
            references search_source,
    user_uuid uuid
);

create unique index search_pattern_uuid_uindex
    on search_pattern (uuid);

alter table search_pattern
    add constraint search_pattern_pk
        primary key (uuid);

-- search_arguments

create table search_arguments
(
    uuid uuid not null,
    search_pattern_uuid uuid not null
        constraint search_arguments_search_pattern_uuid_fk
            references search_pattern (uuid),
    name varchar(50) not null,
    value varchar(200)
);

create unique index search_arguments_uuid_uindex
    on search_arguments (uuid);

alter table search_arguments
    add constraint search_arguments_pk
        primary key (uuid);

