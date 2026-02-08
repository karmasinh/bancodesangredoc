-- Limpiar datos existentes para evitar duplicados (opcional, pero seguro para redestiegue)
TRUNCATE TABLE distribucion_log, entrega, detalle_pedido, pedido, control_calidad_hemo, hemocomponente, validacion_lab, control_calidad_lab, resultado_lab, prueba_lab, extraccion, examen_fisico, tamizaje_medico, admision, donante, fono_per, domicilio_per, persona, rol_menu, menu_item, usuario_rol, usuario, horario_atencion, fonos, domicilio, rol, personal RESTART IDENTITY CASCADE;

-- 1. Insertar ROLES
INSERT INTO rol (nombre, descripcion, estado) VALUES ('ADMIN', 'Administrador del Sistema', TRUE);
INSERT INTO rol (nombre, descripcion, estado) VALUES ('MEDICO', 'Medico encargado', TRUE);
INSERT INTO rol (nombre, descripcion, estado) VALUES ('LABORATORISTA', 'Personal de Laboratorio', TRUE);
INSERT INTO rol (nombre, descripcion, estado) VALUES ('RECEPCION', 'Personal de Recepcion', TRUE);

-- 2. Insertar PERSONAL (Admin y otros)
-- Admin
INSERT INTO personal (nom, ape_pat, ape_mat, ci, profesion, ocupacion, sexo, email, estado) 
VALUES ('Administrador', 'Sistema', 'Principal', '1000001', 'Ingeniero', 'Admin', 'M', 'admin@bloodbank.com', TRUE);

-- Medico
INSERT INTO personal (nom, ape_pat, ape_mat, ci, profesion, ocupacion, sexo, email, estado) 
VALUES ('Juan', 'Perez', 'Medico', '2000001', 'Medico', 'Triaje', 'M', 'juan@bloodbank.com', TRUE);

-- 3. Insertar USUARIOS (Password '12345')
-- Admin User
INSERT INTO usuario (id_pers, login, pass_hash, estado) 
VALUES (1, 'admin', '12345', TRUE);

-- Medico User
INSERT INTO usuario (id_pers, login, pass_hash, estado) 
VALUES (2, 'medico', '12345', TRUE);

-- 4. Asignar ROLES a USUARIOS
-- Admin -> ADMIN
INSERT INTO usuario_rol (id_usr, id_rol) VALUES (1, 1);
-- Medico -> MEDICO
INSERT INTO usuario_rol (id_usr, id_rol) VALUES (2, 2);

-- 5. Insertar MENU ITEMS (Estructura basica sugerida)
-- Menu Padre
INSERT INTO menu_item (nombre, ruta, orden, estado, id_padre) VALUES ('Administracion', NULL, 1, TRUE, NULL);
INSERT INTO menu_item (nombre, ruta, orden, estado, id_padre) VALUES ('Recepcion', NULL, 2, TRUE, NULL);
INSERT INTO menu_item (nombre, ruta, orden, estado, id_padre) VALUES ('Triaje', NULL, 3, TRUE, NULL);

-- Submenus (IDs asumidos por secuencia, ajustados a la realidad)
-- Admin Subitems
INSERT INTO menu_item (nombre, ruta, orden, estado, id_padre) VALUES ('Gestionar Usuarios', 'usuario.do', 1, TRUE, 1);
INSERT INTO menu_item (nombre, ruta, orden, estado, id_padre) VALUES ('Gestionar Personal', 'personal.do', 2, TRUE, 1);

-- Recepcion Subitems
INSERT INTO menu_item (nombre, ruta, orden, estado, id_padre) VALUES ('Registrar Donante', 'donante.do', 1, TRUE, 2);

-- 6. Asignar PERMISOS (Rol Menu)
-- Admin ve todo
INSERT INTO rol_menu (id_rol, id_menu, puede_ver) VALUES (1, 1, TRUE); -- Admin Menu
INSERT INTO rol_menu (id_rol, id_menu, puede_ver) VALUES (1, 4, TRUE); -- User Mgmt
INSERT INTO rol_menu (id_rol, id_menu, puede_ver) VALUES (1, 5, TRUE); -- Personal Mgmt

-- Medico ve Triaje (ejemplo)
INSERT INTO rol_menu (id_rol, id_menu, puede_ver) VALUES (2, 3, TRUE); 
