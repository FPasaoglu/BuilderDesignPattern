public class AdanaKebap implements KebapBuilder{

    Kebap kebap;
    int porsiyon = 1;

    AdanaKebap(int porsiyon){
        kebap = new Kebap();
        this.porsiyon = porsiyon;
    }

    @Override
    public void buildAci() {
        kebap.setAci(true);
    }

    @Override
    public void buildSogan() {
        kebap.setSogan(false);
    }

    @Override
    public void buildKekik() { kebap.setKekik(2.7*porsiyon); }

    @Override
    public void buildKarabiber() { kebap.setKarabiber(4.9*porsiyon); }

    @Override
    public void buildKıyma() {
        kebap.setKıyma(205*porsiyon);
    }

    @Override
    public void buildKuyrukyag() { kebap.setKuyrukyag(60*porsiyon); }

    @Override
    public Kebap getKebap(){
        return this.kebap;
    }
}
