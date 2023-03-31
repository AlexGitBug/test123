package dao.repository.integration;

import com.dmdev.webStore.dao.repository.CatalogRepository;
import com.dmdev.webStore.entity.Catalog;
import dao.repository.initProxy.ProxySessionTestBase;
import dao.repository.integration.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import dao.repository.util.MocksForRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@IT
@RequiredArgsConstructor
public class CatalogRepositoryIT {

    private final CatalogRepository catalogRepository;

    @Test
    void deleteCatalog() {
        var catalog = MocksForRepository.getCatalog();
        entityManager.persist(catalog);

        entityManager.remove(catalog);

        var actualResult = entityManager.find(Catalog.class, catalog.getId());
        assertThat(actualResult).isNull();
    }


//    @Test
//    void saveCatalog() {
//        entityManager.getTransaction().begin();
//        var catalog = MocksForRepository.getCatalog();
//
//        catalogRepository.save(catalog);
//
//        Catalog actualResult = entityManager.find(Catalog.class, catalog.getId());
//        assertThat(actualResult).isEqualTo(catalog);
//        entityManager.getTransaction().commit();
//    }
//
//    @Test
//    void updateCatalog() {
//        entityManager.getTransaction().begin();
//        var catalog = MocksForRepository.getCatalog();
//        catalogRepository.save(catalog);
//
//        Catalog result = entityManager.find(Catalog.class, catalog.getId());
//        result.setCategory("update-category");
//        catalogRepository.update(catalog);
//
//        Catalog actualResult = entityManager.find(Catalog.class, catalog.getId());
//        assertThat(actualResult).isEqualTo(catalog);
//        entityManager.getTransaction().commit();
//    }
//
//    @Test
//    void findByIdCatalog() {
//        entityManager.getTransaction().begin();
//        var catalog = MocksForRepository.getCatalog();
//        catalogRepository.save(catalog);
//
//        var actualResult =  entityManager.find(Catalog.class, catalog.getId());
//
//        assertThat(actualResult).isEqualTo(catalog);
//        entityManager.getTransaction().commit();
//    }
}