package sample;

public class Subject {
    private String name;
    private Double k; //коэффициент
    private Integer priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Subject(String name, Double k, Integer priority) {
        this.name = name;
        this.k = k;
        this.priority = priority;

    }

}
