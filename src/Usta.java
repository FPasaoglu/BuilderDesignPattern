public class Usta {

    private KebapBuilder builder;

    Usta(KebapBuilder builder){
        this.builder = builder;
    }

    void prepareKebap(){
        this.builder.buildAci();
        this.builder.buildKarabiber();
        this.builder.buildKekik();
        this.builder.buildSogan();
        this.builder.buildKıyma();
        this.builder.buildKuyrukyag();
    }

    Kebap getKebap(){
        return this.builder.getKebap();
    }

}
