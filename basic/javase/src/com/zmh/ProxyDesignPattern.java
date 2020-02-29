package com.zmh;


interface Subject{
    void make();
}

class RealProxy implements Subject{
    @Override
    public void make() {
        System.out.println("true subject");
    }
}

class ProxySubject implements Subject{

    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject=subject;
    }
    public void prepare(){
        System.out.println("prepare for true subject");
    }

    public void destroy(){
        System.out.println("destroy for true subject");
    }

    @Override
    public void make() {
        prepare();
        System.out.println("true subject");
        destroy();
    }
}

public class ProxyDesignPattern {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealProxy());
        subject.make();
    }
}
