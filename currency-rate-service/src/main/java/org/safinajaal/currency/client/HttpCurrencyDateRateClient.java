package org.safinajaal.currency.client;

import java.time.LocalDate;

public interface HttpCurrencyDateRateClient {
    String requestByDate(LocalDate date);
}
