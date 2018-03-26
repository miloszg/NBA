package NBA;

public class Koszykarz {
    private String imie_nazwisko;
    private int zarobki;
    private int[] numery;

    final static int salary=94;

    public Koszykarz(String imie_nazwisko, int zarobki, int[] numery)
    {
        this.imie_nazwisko=imie_nazwisko;
        this.zarobki=zarobki;
        this.numery=numery;
    }

    public Koszykarz(String imie_nazwisko, int zarobki)
    {
        this.imie_nazwisko = imie_nazwisko;
        this.zarobki = zarobki;
    }

    public void tyleZarabiam()
    {
        String poziom_gracza;
        int value=100*zarobki/salary;

        if(value>=0 && value<=10) { value=0; }
        else if(value>10 && value <50) { value=1; }
        else if(value>=50 && value<=100) { value=2; }
        else if(value>100) { value=3; }
        else { value=4; }

        switch(value)
        {
            case 0:
                poziom_gracza="slaby gracz";
                break;
            case 1:
                poziom_gracza="dobry gracz";
                break;
            case 2:
                poziom_gracza="bardzo dobry gracz";
                break;
            case 3:
                poziom_gracza="wysmienity gracz!";
                break;
            default:
                poziom_gracza=" nie mozna okreslic poziomu gracza";
                break;

        }
        System.out.println("Zawodnik "+imie_nazwisko+" zarabia jedynie "+value+"% salary, czyli "+zarobki+" mln$ "+poziom_gracza);
    }
    public void Interesuje(Liga.Kluby klub)
    {
        int ile_numerow=0;

        for(int i=0;i<numery.length;i++)
        {
            ile_numerow++;
        }
        System.out.println("Zawodnikiem "+imie_nazwisko+" interesuje sie klub: "+klub+"nosil on "+ile_numerow+" koszulek");

    }

}
