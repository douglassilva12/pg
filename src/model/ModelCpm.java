package model;

public class ModelCpm {

    int id;
    String multiplicar;

    public ModelCpm() {
    }

    public ModelCpm(int id, String multiplicar) {
        this.id = id;
        this.multiplicar = multiplicar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMultiplicar() {
        return multiplicar;
    }

    public void setMultiplicar(String multiplicar) {
        this.multiplicar = multiplicar;
    }
}
