package dev.boiarshinov.easydsldemo.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
public class Model {

    @NonNull String mandatoryField1;
    @NonNull String mandatoryField2;

    String optionalField1;
    String optionalField2;
}
