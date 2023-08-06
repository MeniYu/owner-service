package io.incondensable.application.dao.repositories;

import io.incondensable.application.business.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * @author abbas
 */
@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    @Query("select case when count(o.phoneNumber) > 0 then true else false end from Owner o where o.phoneNumber = :phoneNumber")
    boolean existsByPhoneNumber(@Param("phoneNumber") String phoneNumber);

    @Query("select case when count(o.email) > 0 then true else false end from Owner o where o.email = :email")
    boolean existsByEmail(@Param("email") String email);

}
