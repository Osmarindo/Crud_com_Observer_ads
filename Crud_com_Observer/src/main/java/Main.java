import model.Estoque;
import model.Gerente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

import java.math.BigDecimal;

@SpringBootConfiguration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

        BigDecimal valorInicial = new BigDecimal("1900.0");
        BigDecimal desconto = new BigDecimal("10.0");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach(gerente);
        estoque.setValor(valorInicial);

    }
}
