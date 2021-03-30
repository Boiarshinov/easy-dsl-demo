package dev.boiarshinov.easydsldemo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Value;

@Value
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class DslModel {

    @NonNull String mandatoryField1;
    @NonNull String mandatoryField2;
    @NonNull String mandatoryField3;

    String optionalField1;
    String optionalField2;

    public static MandatoryStep1 builder() {
        return new DslModelBuilder();
    }

    public static class DslModelBuilder implements MandatoryStep1, MandatoryStep2, MandatoryStep3, OptionalStepOrBuild {

        String mandatoryField1;
        String mandatoryField2;
        String mandatoryField3;

        String optionalField1;
        String optionalField2;

        @Override
        public MandatoryStep2 mandatoryField1(String field) {
            mandatoryField1 = field;
            return this;
        }

        @Override
        public MandatoryStep3 mandatoryField2(String field) {
            mandatoryField2 = field;
            return this;
        }

        @Override
        public OptionalStepOrBuild mandatoryField3(String field) {
            mandatoryField3 = field;
            return this;
        }

        @Override
        public OptionalStepOrBuild optionalField1(String field) {
            optionalField1 = field;
            return this;
        }

        @Override
        public OptionalStepOrBuild optionalField2(String field) {
            optionalField2 = field;
            return this;
        }

        public DslModel build() {
            return new DslModel(
                mandatoryField1,
                mandatoryField2,
                mandatoryField3,
                optionalField1,
                optionalField2
            );
        }
    }

    interface MandatoryStep1 {
        MandatoryStep2 mandatoryField1(String field);
    }

    interface MandatoryStep2 {
        MandatoryStep3 mandatoryField2(String field);
    }

    interface MandatoryStep3 {
        OptionalStepOrBuild mandatoryField3(String field);
    }

    interface OptionalStepOrBuild {
        OptionalStepOrBuild optionalField1(String field);
        OptionalStepOrBuild optionalField2(String field);
        DslModel build();
    }
}
