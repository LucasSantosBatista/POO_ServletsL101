/**
 * 
 */
package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Lucas Batista 21 de abr. de 2024
 */

@Getter
@Setter
@AllArgsConstructor

public class ContaBancaria {
	private String cliente;
	private int num_conta;
	private float saldo;

	public float sacar(float saque) {
		if (getSaldo() - saque < 0) {
			saque = getSaldo();
			setSaldo(0f);
		} else {
			setSaldo(getSaldo() - saque);
		}

		return saque;

	}

	public void depositar(float deposito) {
		setSaldo(getSaldo() + deposito);
	}
}
