public class MardinKebabı implements KebapBuilder{

    Kebap kebap;
    int porsiyon = 1;

    MardinKebabı(int porsiyon){
        kebap = new Kebap();
        this.porsiyon = porsiyon;
    }

    @Override
    public void buildAci() {
        kebap.setAci(false);
    }

    @Override
    public void buildSogan() {
        kebap.setSogan(true);
    }

    @Override
    public void buildKekik() {
        kebap.setKekik(3.2*porsiyon);
    }

    @Override
    public void buildKarabiber() {
        kebap.setKarabiber(5.3*porsiyon);
    }

    @Override
    public void buildKıyma() {
        kebap.setKıyma(250*porsiyon);
    }

    @Override
    public void buildKuyrukyag() {
        kebap.setKuyrukyag(75*porsiyon);
    }

    @Override
    public Kebap getKebap(){
        return this.kebap;
    }
}
