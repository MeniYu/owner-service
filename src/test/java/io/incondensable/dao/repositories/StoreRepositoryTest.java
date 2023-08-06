package io.incondensable.dao.repositories;

import io.incondensable.application.business.domain.store.StoreSingleMenu;
import io.incondensable.application.business.domain.menu.Item;
import io.incondensable.application.business.domain.menu.MenuDetails;
import io.incondensable.application.business.domain.vt.Address;
import io.incondensable.application.dao.repositories.StoreSingleMenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author abbas
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class StoreRepositoryTest {

    @Autowired
    private StoreSingleMenuRepository repo;

    @Test
    public void test() {
        Address address = new Address("Iran", "Tehran", "Tehran", "Shit Street", 10);
        Set<Item> items = new HashSet<>();
        Item espresso = new Item();
        espresso.setName("Espresso");
        espresso.setPrice(59000L);
        items.add(espresso);

        Item americano = new Item();
        espresso.setName("Americano");
        espresso.setPrice(69000L);
        items.add(americano);

        StoreSingleMenu store = new StoreSingleMenu();
        store.setAddress(address);
        store.setName("Shit Store");
        store.setMenuDetails(new MenuDetails(items, null));

        StoreSingleMenu actual = repo.save(store);

        assertThat(actual.getMenuDetails().getItems().size(), is(2));
        assertThat(actual.getAddress().getCity(), is("Tehran"));
    }

}
