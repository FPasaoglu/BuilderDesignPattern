public class Main {

    public static void main(String args[]){

        KebapBuilder mardinKebabı = new MardinKebabı(2);
        KebapBuilder adanaKebabı =  new AdanaKebap(1);
        KebapBuilder urfaKebabı =  new UrfaKebap(1);

        Usta AhmetUsta = new Usta(mardinKebabı);
        AhmetUsta.prepareKebap();
        Kebap mardin_kebap = AhmetUsta.getKebap();

        Usta MuhittinUsta = new Usta(adanaKebabı);
        MuhittinUsta.prepareKebap();
        Kebap adana_kebap = MuhittinUsta.getKebap();

        Usta İbrahimUsta = new Usta(urfaKebabı);
        İbrahimUsta.prepareKebap();
        Kebap urfa_kebap = İbrahimUsta.getKebap();



        System.out.println("Mardin " + mardin_kebap.toString());
        System.out.println("Adana " + adana_kebap.toString());
        System.out.println("Urfa " + urfa_kebap.toString());

    }

}
