package io.incondensable.dao.repositories.menu;

import io.incondensable.application.business.domain.menu.Item;
import io.incondensable.application.business.domain.menu.ItemImage;
import io.incondensable.application.dao.repositories.menu.ItemRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author abbas
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repo;

    @Test
    public void test() {
        ItemImage image = new ItemImage();
        image.setName("shit image");
        image.setDescription("Shitiest Image of the world at 2023");

        Item espresso = new Item();
        espresso.setName("Espresso");
        espresso.setPrice(59000L);
        espresso.setImage(image);
        espresso.setMenuDetails(null);

        Item actual = repo.save(espresso);

        assertThat(actual.getImage().getId(), is(actual.getId()));
        assertThat(actual.getImage().getDescription(), is("Shitiest Image of the world at 2023"));
        assertThat(actual.getId(), is(3L));
        assertThat(actual.getName(), is("Espresso"));
    }

}
