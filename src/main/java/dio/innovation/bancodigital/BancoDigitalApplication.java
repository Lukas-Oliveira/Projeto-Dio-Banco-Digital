package dio.innovation.bancodigital;

import dio.innovation.bancodigital.model.Cliente;
import dio.innovation.bancodigital.model.Conta;
import dio.innovation.bancodigital.model.ContaCorrente;
import dio.innovation.bancodigital.model.ContaPoupanca;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoDigitalApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(BancoDigitalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Cliente titular = new Cliente();
		titular.setNome("Lucas");

		Conta corrente = new ContaCorrente(titular);
		Conta poupanca = new ContaPoupanca(titular);

		corrente.depositar(100);
		corrente.transferir(100, poupanca);

		System.out.println(corrente);
		System.out.println(poupanca);
	}
}
