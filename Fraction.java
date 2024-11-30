public class Fraction{
    private int numer = 0;
    private int denom = 1;

    public Fraction(){};

    public Fraction(int x, int y)
    {
        this.numer = x;
        this.denom = y;
    }

    public Fraction(Fraction f)
    {
        this.numer = f.getNumer();
        this.denom = f.getDenom();
    }

    public int getDenom()
    {
        return this.denom;
    }

    public int getNumer()
    {
        return this.numer;
    }

    public String toString()
    {
        if (this.denom == 1)
            return "" + this.numer;
        else
            return this.numer + "/" + this.denom;
    }

    public boolean equals(Object f)
    {
        if (f instanceof Fraction) {
            Fraction obj = (Fraction) f;
            return numer == obj.getNumer() && denom == obj.getDenom();
        }
        return false;
    }
    
}