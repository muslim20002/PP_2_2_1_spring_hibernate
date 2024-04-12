package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;


    // Конструктор без параметров
    public Car() {
    }

    // Конструктор с параметрами
    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Геттер для model
    public String getModel() {
        return model;
    }

    // Сеттер для model
    public void setModel(String model) {
        this.model = model;
    }

    // Геттер для series
    public int getSeries() {
        return series;
    }

    // Сеттер для series
    public void setSeries(int series) {
        this.series = series;
    }

    // Метод toString для удобства вывода информации об объекте
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}

