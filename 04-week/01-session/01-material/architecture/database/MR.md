# Flight Management System – Refined Data Model

## 🧭 Conventions
- Tables and columns use **snake_case**, in **singular**.  
- Primary keys are **UUID** generated with `gen_random_uuid()` (`CREATE EXTENSION pgcrypto;`).  
- **Audit fields (7):**  
  - `status`  
  - `created_at` / `created_by`  
  - `updated_at` / `updated_by`  
  - `deleted_at` / `deleted_by`  
- Foreign Keys use **ON UPDATE CASCADE** and **ON DELETE** rules appropriate to the domain.  
- **Unique constraints** on codes and names (scoped where applicable).  

---

## Module: Geolocation
- **continent** {id, code, name, description}  
- **country** {id, code, name, description, continent_id}  
- **state** {id, code, name, description, country_id}  
- **city** {id, code, name, description, state_id}  

## Module: Infrastructure
- **airport** {id, code, name, address, city_id}  
- **terminal** {id, code, name, airport_id}  
- **boarding_gate** {id, code, name, terminal_id}  

## Module: Parameterization
- **document_type** {id, code, name, description}  
- **flight_type** {id, code, name, description}  
- **aircraft_type** {id, code, name, description}  
- **crew_role** {id, code, name, description}  
- **ticket_class** {id, code, name, description}  

## Module: Security
- **role** {id, name, description}  
- **module** {id, name, color, icon, path}  
- **form** {id, name, color, icon, path, section}  
- **form_module** {id, form_id, module_id}  
- **role_form** {id, role_id, form_id}  
- **person** {id, first_name, last_name, document_number, birth_date, gender, phone, email, address, attendant_name, attending_phone, document_type_id, city_id}  
- **user_account** {id, username, password_hash, person_id, role_id}  

## Module: Human Resources
- **employee** {id, salary, hire_date, crew_role_id, person_id}  
*(future scalability: contracts, training, payroll, certifications, etc.)*  

## Module: Aircraft Management
- **aircraft** {id, manufacturer, registration_code, hours_in_use, aircraft_type_id}  

## Module: Flight Operations
- **flight** {id, flight_date, departure_time, arrival_time, flight_type_id, origin_boarding_gate_id, destination_boarding_gate_id, aircraft_id}  
- **crew_assignment** {id, flight_id, employee_id, crew_role_id}  
- **ticket** {id, code, flight_id, passenger_id, ticket_class_id, seat_number, price}  
- **baggage** {id, code, weight, ticket_id}  

## Module: Passengers & Services
- **passenger** {id, frequent_flyer_number, person_id}  

## Module: Notifications
- **message_template** {id, code, name, subject_template, body_template}  
- **notification** {id, person_id, channel, subject, message, sent_at, status}  
