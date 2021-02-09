public class Main {

	public static void main(String[] args){
		
		Movimentacoes p1 = new Movimentacoes();
		p1.setId(1);
		Thread t1 = new Thread(p1);
		t1.start();
		
		Movimentacoes p2 = new Movimentacoes();
		p2.setId(2);
		Thread t2 = new Thread(p2);
		t2.start();
		
		Movimentacoes p3 = new Movimentacoes();
		p3.setId(3);
		Thread t3 = new Thread(p3);
		t3.start();
		
		Movimentacoes p4 = new Movimentacoes();
		p4.setId(4);
		Thread t4 = new Thread(p4);
		t4.start();
		
		Movimentacoes p5 = new Movimentacoes();
		p5.setId(5);
		Thread t5 = new Thread(p5);
		t5.start();
		
	}

}
