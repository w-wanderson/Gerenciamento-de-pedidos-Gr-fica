package Operacao;

import java.util.Date;

public class Pedido {
	
	private int a;
	private Date dataHoraEmissao;
	private Date dataHoraFinalizacao;
	private double preco;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public Date getDataHoraEmissao() {
		return dataHoraEmissao;
	}
	public void setDataHoraEmissao(Date dataHoraEmissao) {
		this.dataHoraEmissao = dataHoraEmissao;
	}
	public Date getDataHoraFinalizacao() {
		return dataHoraFinalizacao;
	}
	public void setDataHoraFinalizacao(Date dataHoraFinalizacao) {
		this.dataHoraFinalizacao = dataHoraFinalizacao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
