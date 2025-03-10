//package mattmck.feignclient.test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//import java.time.LocalDate;
//import java.util.Currency;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import mattmck.feignclient.CurrencyNotFoundException;
//import mattmck.feignclient.MyFeignClient;
//
//@SpringBootTest
//public class MyFeignClientTests {
//
//    @Autowired
//    MyFeignClient client;
//
//    @Test
//    void itShouldReturnLatestCurrencyRates() {
//        // when
//        var result = client.getLatest();
//
//        // then
//        assertEquals(LocalDate.now().minusDays(1), result.getDate());
//        assertFalse(result.getRates().isEmpty());
//        assertEquals(32, result.getRates().size());
//    }
//
//    @Test
//    void itShouldReturnCurrencyRatesByDate() {
//        // given
//        LocalDate date = LocalDate.now().minusDays(5);
//
//        // when
//        var result = client.getByDate(date);
//
//        // then
//        assertEquals(date, result.getDate());
//        assertFalse(result.getRates().isEmpty());
//        assertEquals(32, result.getRates().size());
//    }
//
//    @Test
//    void itShouldReturnCurrencyRatesByBaseCurrency() {
//        // given
//        Currency currency = Currency.getInstance("USD");
//
//        // when
//        var result = client.getByBaseCurrency(currency);
//
//        // then
//        assertEquals(LocalDate.now().minusDays(1), result.getDate());
//        assertEquals(currency, result.getBase());
//        assertFalse(result.getRates().isEmpty());
//        assertEquals(33, result.getRates().size());
//    }
//
//    @Test
//    void itShouldThrowExceptionWhenCurrencyIsNotFound() {
//        // given
//        Currency currency = Currency.getInstance("KPW");
//
//        // when & then
//        Assertions.assertThrows(CurrencyNotFoundException.class, () -> client.getByBaseCurrency(currency));
//    }
//}
