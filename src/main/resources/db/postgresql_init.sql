-- Script khoi tao CSDL PostgreSQL cho XYZ AutoCare (Chay trong pgAdmin 4)
CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    phone VARCHAR(15) UNIQUE NOT NULL,
    email VARCHAR(100) UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL CHECK (role IN ('CUSTOMER', 'STAFF', 'MANAGER')),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS services (
    service_id SERIAL PRIMARY KEY,
    service_name VARCHAR(150) NOT NULL,
    category VARCHAR(100) NOT NULL,
    description TEXT,
    estimated_duration_minutes INT NOT NULL,
    reference_price NUMERIC(12, 2) NOT NULL,
    is_active BOOLEAN DEFAULT TRUE
);

CREATE TABLE IF NOT EXISTS time_slots (
    slot_id SERIAL PRIMARY KEY,
    slot_time VARCHAR(30) UNIQUE NOT NULL,
    max_capacity INT NOT NULL DEFAULT 3
);

CREATE TABLE IF NOT EXISTS appointments (
    appointment_id SERIAL PRIMARY KEY,
    appointment_code VARCHAR(20) UNIQUE NOT NULL,
    customer_name VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    license_plate VARCHAR(20) NOT NULL,
    service_name VARCHAR(150) NOT NULL,
    appointment_date DATE NOT NULL,
    slot_id INT NOT NULL,
    slot_time VARCHAR(30) NOT NULL,
    status VARCHAR(25) NOT NULL DEFAULT 'PENDING'
);
