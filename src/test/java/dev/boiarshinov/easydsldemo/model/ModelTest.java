package dev.boiarshinov.easydsldemo.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ModelTest {

    @Test
    void builder() {
        final Model model = Model.builder()
            .mandatoryField1("lol")
            .mandatoryField2("kek")
            .optionalField1("cheburek")
            .build();
        assertNotNull(model);
    }

    @Test
    void buildAtNullMandatoryField() {
        Assertions.assertThrows(
            NullPointerException.class,
            () -> Model.builder()
                .mandatoryField1("lol")
                .optionalField1("cheburek")
                .build()
            );
    }

}