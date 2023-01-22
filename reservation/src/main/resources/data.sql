INSERT INTO room_type (id, type) VALUES (1, 'Delux');
INSERT INTO room_type (id, type) VALUES (2, 'Regular');
INSERT INTO room_type (id, type) VALUES (3, 'Premium');
INSERT INTO room_type (id, type) VALUES (4, 'Family');

INSERT INTO user_details (id, name) VALUES (1, 'David');
INSERT INTO user_details (id, name) VALUES (2, 'Srinivasan');
INSERT INTO user_details (id, name) VALUES (3, 'Dmitry');
INSERT INTO user_details (id, name) VALUES (4, 'Hussain');
INSERT INTO user_details (id, name) VALUES (5, 'John');

INSERT INTO rooms (room_number, room_type_id) VALUES (1, 1);
INSERT INTO rooms (room_number, room_type_id) VALUES (2, 1);
INSERT INTO rooms (room_number, room_type_id) VALUES (3, 1);

INSERT INTO reservation (id, user_id, room_number, booked_Date, from_Date, to_Date, updated_Date) VALUES (1, 1, 1, '2022-10-20', '2022-12-10', '2022-12-16', '2022-10-20');
INSERT INTO reservation (id, user_id, room_number, booked_Date, from_Date, to_Date, updated_Date) VALUES (2, 2, 1, '2022-10-20', '2022-12-10', '2022-12-16', '2022-10-20');



