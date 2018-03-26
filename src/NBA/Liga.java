package NBA;

public class Liga{

    public enum Kluby{TSM,CLG,WIZARDS,LAKERS}

    public static void main(String[] args) {

        Koszykarz koszykarz1 = new Koszykarz("Twoj Stary",12,new int[]{2,5});
        koszykarz1.tyleZarabiam();
        koszykarz1.Interesuje(Kluby.TSM);

        Koszykarz koszykarz2 = new Koszykarz("Konrad DEbil", -1, new int[]{11,12});
        koszykarz2.tyleZarabiam();
        koszykarz2.Interesuje(Kluby.LAKERS);

        Koszykarz koszykarz3 = new Koszykarz("Dukkati Szlongster",20);
        koszykarz3.tyleZarabiam();


    }
}
