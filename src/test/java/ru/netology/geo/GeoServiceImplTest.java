package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static ru.netology.geo.GeoServiceImpl.LOCALHOST;

class GeoServiceImplTest {

    @Test
    void byIpTest() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp ("127.0.0.1");
        Location expected = new Location(null, null, null, 0);
        Assertions.assertEquals(actual, expected);
    }

}