/**
 * 
 */
package model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lucas Batista 21 de abr. de 2024
 */

@Getter
@Setter

public class ContaPoupanca extends ContaBancaria {

	private int diaRendimento;

	public ContaPoupanca(String cliente, int num_conta, float saldo, int diaRendimento) {
		super(cliente, num_conta, saldo);
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(float taxaRendimento) {
		setSaldo(getSaldo() * (taxaRendimento / 100));
	}

}
