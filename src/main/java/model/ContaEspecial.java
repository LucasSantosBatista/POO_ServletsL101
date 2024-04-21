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

public class ContaEspecial extends ContaBancaria {

	private float limite;

	public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
		super(cliente, num_conta, saldo);
		this.limite = limite;
	}

	public float sacar(float saque) {
		if (getSaldo() + limite - saque < 0) {
			saque = getSaldo();
			setSaldo(0f);
		} else {
			setSaldo(getSaldo() - saque);
		}
		return saque;
	}
}
