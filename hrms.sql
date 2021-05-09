BEGIN;


CREATE TABLE public."Departments"
(
    id integer NOT NULL,
    "departmentName" character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."Employees"
(
    "userId" integer NOT NULL,
    confirmation boolean NOT NULL,
    "departmentId" integer NOT NULL,
    "firstName" character varying(150) NOT NULL,
    "lastName" character varying(150) NOT NULL,
    PRIMARY KEY ("userId")
);

CREATE TABLE public."Employers"
(
    "userId" integer NOT NULL,
    website character varying(150) NOT NULL,
    phone character varying(11) NOT NULL,
    "companyName" character varying(150) NOT NULL,
    PRIMARY KEY ("userId")
);

CREATE TABLE public."JobPositions"
(
    id integer NOT NULL,
    name character varying(150) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public."JobSeekers"
(
    "userId" integer NOT NULL,
    "firstName" character varying(50) NOT NULL,
    "lastName" character varying(50) NOT NULL,
    "tcNo" character varying(11) NOT NULL,
    "birthDay" date NOT NULL,
    PRIMARY KEY ("userId")
);

CREATE TABLE public."Users"
(
    id integer NOT NULL,
    "e-mail" character varying(100) NOT NULL,
    password character varying(100) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public."Employees"
    ADD FOREIGN KEY ("userId")
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."Employees"
    ADD FOREIGN KEY ("departmentId")
    REFERENCES public."Departments" (id)
    NOT VALID;


ALTER TABLE public."Employers"
    ADD FOREIGN KEY ("userId")
    REFERENCES public."Users" (id)
    NOT VALID;


ALTER TABLE public."JobSeekers"
    ADD FOREIGN KEY ("userId")
    REFERENCES public."Users" (id)
    NOT VALID;

END;