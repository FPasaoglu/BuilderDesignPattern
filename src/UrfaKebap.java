public class UrfaKebap implements KebapBuilder{

    Kebap kebap;
    int porsiyon = 1;

    UrfaKebap(int porsiyon){
        kebap = new Kebap();
        this.porsiyon = porsiyon;
    }

    @Override
    public void buildAci() {
        kebap.setAci(true);
    }

    @Override
    public void buildSogan() {
        kebap.setSogan(true);
    }

    @Override
    public void buildKekik() {
        kebap.setKekik(5.3*porsiyon);
    }

    @Override
    public void buildKarabiber() { kebap.setKarabiber(6.1*porsiyon); }

    @Override
    public void buildKıyma() {
        kebap.setKıyma(175*porsiyon);
    }

    @Override
    public void buildKuyrukyag() { kebap.setKuyrukyag(40*porsiyon); }

    @Override
    public Kebap getKebap(){
        return this.kebap;
    }
}
