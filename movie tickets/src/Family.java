public non-sealed class Family extends Ticket{
    private double realValue    ;
    private int numberPeople;
    private double descont;
    public Family( double value, String nameMovie, String audioTrack, int numberPeople){
        super(value,nameMovie,audioTrack);
        this.numberPeople=numberPeople;

    }

    public double getDescont(){
        if (numberPeople > 3){
            return descont += (descont * 0.05);
        } else {
            return descont += 0;
        }

    }
    public double getRealValue(){
        return realValue += (value * numberPeople)  - getDescont();
    }

}
