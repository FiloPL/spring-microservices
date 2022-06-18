package ttsw.filopl.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by T. Filo Zegarlicki on 18.06.2022
 **/
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
        ExchangeValue findByFromAndTo(String from, String to);
}
