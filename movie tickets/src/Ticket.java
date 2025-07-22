public sealed abstract class  Ticket permits HalfPrice , Family{
    protected double value;
    protected String nameMovie;
    protected String audioTrack;

    public Ticket(double value,String nameMovie,String audioTrack){
        this.audioTrack=audioTrack;
        this.nameMovie=nameMovie;
        this.value =value;
    }
    public String getNameMovie(){
        return nameMovie;
    }
    public String getAudioTrack(){
        return audioTrack;
    }
    public double getValue() {
        return value;
    }

    public Ticket(){}

    public void setValue(double value){
        this.value=value;
    }
    public void setAudioTrack(String audioTrack){
        this.audioTrack=audioTrack;
    }
    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
}
