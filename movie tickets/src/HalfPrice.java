public non-sealed class HalfPrice extends Ticket {

    private double realValue;

    public HalfPrice( double value, String nameMovie, String audioTrack ){
        super (value,nameMovie,audioTrack);

    }

    public double getRealValue(){
        return realValue+=(value / 2);
    }
}






//Cada ingresso deve ter um método que retorna o seu valor real
//        ( baseado no valor informado na criação do ingresso)
//para os de meia entrada o seu valor deve ser de metade do valor,

//para os ingressos família deve-se retornar o valor multiplicado
//pelo número de pessoas e fornecer um desconto de 5% quando o número de pessoas for maior que 3.