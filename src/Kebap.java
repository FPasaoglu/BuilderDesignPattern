public class Kebap implements Tarif{

    private double kıyma;
    private double kuyrukyag;
    private double kekik;
    private double karabiber;
    private boolean aci;
    private boolean sogan;

    @Override
    public void setKıyma(double kıyma) {
        this.kıyma = kıyma;
    }

    @Override
    public void setKuyrukyag(double kuyrukyag) {
        this.kuyrukyag = kuyrukyag;
    }

    @Override
    public void setKekik(double kekik) {
        this.kekik = kekik;
    }

    @Override
    public void setKarabiber(double karabiber) {
        this.karabiber = karabiber;
    }

    @Override
    public void setAci(boolean aci) {
        this.aci = aci;
    }

    @Override
    public void setSogan(boolean sogan) {
        this.sogan = sogan;
    }

    @Override
    public String toString() {
        return "Kebap{" +
                "kıyma gram =" + kıyma +
                ", kuyrukyag=" + kuyrukyag +
                ", kekik=" + kekik +
                ", karabiber=" + karabiber +
                ", aci=" + aci +
                ", sogan=" + sogan +
                '}';
    }
}
