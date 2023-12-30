//package io.incondensable.dao.repositories;
//
//import io.incondensable.application.business.domain.Owner;
//import io.incondensable.application.dao.repositories.OwnerRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
///**
// * @author abbas
// */
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class OwnerRepositoryTest {
//
//    @Autowired
//    private OwnerRepository ownerRepository;
//
//    @Test
//    public void test() {
//        Owner owner = new Owner();
//        owner.setUserId("adsfefgedasdasd");
//        Owner save = ownerRepository.save(owner);
//        System.out.println(save.getId());
//    }
//
//    @Test
//    public void test2() {
//        System.out.println(ownerRepository.findAll());
//    }
//
//}
