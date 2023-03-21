package br.edu.insper.desagil.aula4;

public class Aula4 {
	public static void main(String[] args) {  // POR QUE TEM QUE POR ISSO PRA PRINTAR 
		Ship ship = new Ship(2,1);

		//ship.setX(2);  --> atribuindo construtores, pode tirar esses carinhas
		//ship.setY(1);

		ship.move(-1, 1);

		System.out.println(ship.getX() + ", " + ship.getY());


		// comparação
		Ship jogador1 = new Ship(2, 1);
		Ship jogador2 = new Ship(2, 1);
		Ship inimigo = new Ship(1, 2);

		System.out.println(jogador1 == jogador2);
		System.out.println(jogador1.getX() == jogador2.getX());
		System.out.println(jogador1.getY() == jogador2.getY());

		System.out.println(); // linha em branco

		System.out.println(jogador1 == inimigo);
		System.out.println(jogador1.getX() == inimigo.getX());
		System.out.println(jogador1.getY() == inimigo.getY());

		System.out.println(); // linha em branco

		System.out.println(jogador2 == inimigo);
		System.out.println(jogador2.getX() == inimigo.getX());
		System.out.println(jogador2.getY() == inimigo.getY());

	}
}