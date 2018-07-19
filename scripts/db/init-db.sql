create table CELLPHONE(
  ID identity,
  BRAND varchar(64) not null,
  MODEL varchar(64) not null,
  OS varchar(64) not null,
  CPU_BRAND varchar(64) not null,
  CPU_CORE_COUNT integer not null,
  RAM integer not null, -- 单位：GB
  STORAGE integer not null, -- 单位：GB
  COLOR varchar(64) not null,
  DESCRIPTION varchar(128),
  PRICE integer not null -- 单位：分
);

create table USER(
  ID identity,
  USERNAME varchar(64) not null,
  PASSWORD varchar(64) not null,
  constraint USER_UQ_USERNAME unique (USERNAME)
);
