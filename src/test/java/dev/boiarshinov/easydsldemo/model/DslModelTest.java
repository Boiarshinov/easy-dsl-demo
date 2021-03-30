package dev.boiarshinov.easydsldemo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DslModelTest {

    @Test
    void build() {
        final DslModel model = DslModel.builder()
            .mandatoryField1("lol")
            .mandatoryField2("kek")
            .mandatoryField3("sdf")
            .optionalField1("cheburek")
            .build();

        assertNotNull(model);
    }
}