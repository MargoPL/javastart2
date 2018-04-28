package pl.sda.javastart2;

import lombok.*;
import pl.sda.javastart2.enums.Car;
import pl.sda.javastart2.enums.ColourEnum;

import java.util.List;

@ToString
@Getter
@Data
@Builder
@AllArgsConstructor
public class ExtraExample {
    private int id;
    private String name;
    private String surname;
    private int age;
    private double salary;
    private ColourEnum colourEnum;
    private List<Car> carList;

}
