package br.edu.insper.desagil.aula4;

public class Ship {
    private int x;
    private int y;
    
    public Ship (int x, int y) {
    	this.x = x;
    	this.y = y;
    }

    public int getX() { //getter que devolve o valor de x
        return x;
    }

    public void setX(int x) { //setter que atualiza valor de x
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
