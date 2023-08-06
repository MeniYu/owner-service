package io.incondensable.application.business.services;

import io.incondensable.application.dao.repositories.StoreSingleMenuRepository;
import org.springframework.stereotype.Service;

/**
 * IRAN POST APIs FOR VALIDATING ZIP-CODES: https://gnaf.post.ir/reseller/ApiService/Index/0
 * @author abbas
 */
@Service
public class StoreSingleMenuService {

    private final StoreSingleMenuRepository repo;

    public StoreSingleMenuService(StoreSingleMenuRepository repo) {
        this.repo = repo;
    }
}
