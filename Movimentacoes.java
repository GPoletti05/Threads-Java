import java.util.Random;

public class Movimentacoes implements Runnable{
	
	private int id;
	Random r = new Random();
	public double contaCorrente[] = new double[10];
	public int[] transacoesConta = {0,0,0,0,0};

	
	public void setId(int id){
		this.id = id;
		setValores();
		
	}
	
	public void setValores() { // seta os valores de todas as correntes em 10.000, para ter uma igualdade entre elas. 
		for(int i=0;i<10;i++) {
			this.contaCorrente[i] = 10000;
		}
	}

	
	@Override
	public void run() {		
		for (int i = 0; i < 20; i++){
		
			int posicaoOrigem = r.nextInt(10);
			int posicaoDestino = r.nextInt(10);
			
			double valor = r.nextDouble()*contaCorrente[posicaoOrigem]; // para nao ultrapassar o limite do valor da conta da posicao i.
			
			contaCorrente[posicaoOrigem] = contaCorrente[posicaoOrigem] - valor;
			contaCorrente[posicaoDestino] = contaCorrente[posicaoDestino] + valor;
		
			System.out.printf("A thread %d esta fazendo sua movimentacao de numero %d e, retirou R$ %f da conta %d e transferidos para conta %d\n\n", id, i+1, valor, posicaoOrigem, posicaoDestino);
			
			if(id == 1) {
				transacoesConta[0]++;
				System.out.printf("thread %d operacao numero %d", id, transacoesConta[0]);
			}
			else if(id == 2){
				transacoesConta[1]++;
				System.out.printf("thread %d operacao numero %d", id, transacoesConta[1]);

			}
			else if(id == 3){
				transacoesConta[2]++;
				System.out.printf("thread %d operacao numero %d", id, transacoesConta[2]);

			}
			else if(id == 4){
				transacoesConta[3]++;
				System.out.printf("thread %d operacao numero %d", id, transacoesConta[3]);

			}
			else if(id == 5){
				transacoesConta[4]++;
				System.out.printf("thread %d operacao numero %d", id, transacoesConta[4]);

			}
			
			if(transacoesConta[0] == 20 && transacoesConta[1] == 20 && transacoesConta[2] == 20 && transacoesConta[3] == 20 && transacoesConta[4] == 20){
				double total = 0;
				
				for(int j=0; j<10; j++) {
					System.out.printf("Valor na Conta Corrente %d: R$ %f\n", j, contaCorrente[j]);
					total = total + contaCorrente[j];
				}
				System.out.printf("Total do banco R$ %f\n\n", total);
			}
		}
	}
	
}
