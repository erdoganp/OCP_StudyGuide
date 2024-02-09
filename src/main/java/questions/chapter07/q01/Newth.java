package questions.chapter07.q01;

public record Newth(long size) {
    @Override
    public boolean equals(Object obj){
        return false;
    }
    //recordlarda set islemi yapılamaz

    //    public void setSize(long size){
//        this.size=size;
//    }
}
