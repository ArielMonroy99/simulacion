package org.example;

public class SolucionDto {
    private Double Z;
    private Integer X1;
    private Integer X2;

    public SolucionDto(Double z, Integer x1, Integer x2) {
        Z = z;
        X1 = x1;
        X2 = x2;
    }

    public Double getZ() {
        return Z;
    }

    public void setZ(Double z) {
        Z = z;
    }

    public Integer getX1() {
        return X1;
    }

    public void setX1(Integer x1) {
        X1 = x1;
    }

    public Integer getX2() {
        return X2;
    }

    public void setX2(Integer x2) {
        X2 = x2;
    }

    @Override
    public String toString() {
        return "src.SolucionDto{" +
                "Z=" + Z +
                ", X1=" + X1 +
                ", X2=" + X2 +
                '}';
    }
}
