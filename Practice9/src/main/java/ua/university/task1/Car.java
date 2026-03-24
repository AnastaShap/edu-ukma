package ua.university.task1;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String model;

    @AllArgsConstructor
    @Data
    public static class Engine{
        private int horsePower;

        public String getHorsepower() {
            return horsePower + "%";
        }
    }

    public Engine spec(){
        return new Engine(150);
    }

    public String getModel(){
        return model;
    }
}
