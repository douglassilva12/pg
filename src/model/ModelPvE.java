package model;

public class ModelPvE {

    private int id;
    private String pc1,ps1;

    public ModelPvE() {
    }

    public ModelPvE(int id, String pc1, String ps1) {
        this.id = id;
        this.pc1 = pc1;
        this.ps1 = ps1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPc1() {
        return pc1;
    }

    public void setPc1(String pc1) {
        this.pc1 = pc1;
    }

    public String getPs1() {
        return ps1;
    }

    public void setPs1(String ps1) {
        this.ps1 = ps1;
    }
}
