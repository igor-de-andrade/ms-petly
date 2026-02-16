CREATE TABLE animals (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(150) NOT NULL,
    especie VARCHAR(50) NOT NULL,
    raca VARCHAR(100),
    data_nascimento DATE,
    cor VARCHAR(100),
    peso DOUBLE PRECISION,
    microchip VARCHAR(100),
    observacoes VARCHAR(500),
    tutor_id BIGINT NOT NULL,

    CONSTRAINT fk_animals_tutor
        FOREIGN KEY (tutor_id)
        REFERENCES tutors(id)
);



