DROP TABLE IF EXISTS sentences;

CREATE TABLE sentences (
  id int AUTO_INCREMENT PRIMARY KEY,
  sentence VARCHAR(1024) NOT NULL
);

INSERT INTO sentences (sentence) VALUES
  ('Månen er en gul ost'),
  ('I mørket er alle katter grå')