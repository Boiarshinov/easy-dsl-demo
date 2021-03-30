package dev.boiarshinov.easydsldemo;

public class DslExample {

    public String doJob() {
        return CoolDsl.start()
            .doFirst()
            .doSecond()
            .andGetResult();
    }

    static class CoolDsl implements FirstStep, SecondStep, ThirdStep {

        private String resultAccumulator;

        public static FirstStep start() {
            final CoolDsl coolDsl = new CoolDsl();
            coolDsl.resultAccumulator = "Started\n";
            return coolDsl;
        }

        @Override
        public SecondStep doFirst() {
            resultAccumulator += "When do first step\n";
            return this;
        }

        @Override
        public ThirdStep doSecond() {
            resultAccumulator += "When do second step\n";
            return this;
        }

        @Override
        public String andGetResult() {
            resultAccumulator += "And you're awesome\n";
            return resultAccumulator;
        }
    }

    interface FirstStep {
        SecondStep doFirst();
    }

    interface SecondStep {
        ThirdStep doSecond();
    }

    interface ThirdStep {
        String andGetResult();
    }
}
