-- SINGLE TABLES --

-- Location --
CREATE TABLE location(
    id UUID NOT NULL PRIMARY KEY,
    longitude NUMERIC(11, 8),
    latitude NUMERIC(11, 8)
);

-- Passenger --
CREATE TABLE passenger(
    id UUID NOT NULL PRIMARY KEY,
    location_id UUID NOT NULL REFERENCES location(id)
);

-- Stop --
CREATE TABLE stop(
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(255),
    forward_location UUID REFERENCES location(id) ON DELETE SET NULL,
    backward_location UUID REFERENCES location(id) ON DELETE SET NULL
);

-- Company --
CREATE TABLE company(
    id UUID NOT NULL PRIMARY KEY,
    name VARCHAR(255)
);

-- Line --
CREATE TABLE line(
    id UUID NOT NULL PRIMARY KEY,
    company_id UUID REFERENCES company(id) ON DELETE SET NULL
);

-- Bus --
CREATE TABLE bus(
    id UUID NOT NULL PRIMARY KEY,
    is_forward BOOLEAN NOT NULL,
    location_id UUID NOT NULL REFERENCES location(id) ON DELETE CASCADE
);

-- RELATIONSHIPS --

-- Line <-> Stop --
CREATE TABLE line_stop(
    line_id UUID NOT NULL REFERENCES line(id),
    stop_id UUID NOT NULL REFERENCES stop(id),
    stop_order INTEGER NOT NULL,
    CONSTRAINT pk_line_stop PRIMARY KEY (line_id, stop_id)
);