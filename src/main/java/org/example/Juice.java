package org.example;
class FreshJuic{
    enum jusize{small,mid,large}
    jusize size;
}

public class Juice {
    public static void main(String[] args){
        FreshJuic ju = new FreshJuic();
        ju.size=FreshJuic.jusize.mid;
    }
}
