package ttsw.filopl.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by T. Filo Zegarlicki on 23.06.2022
 **/

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
