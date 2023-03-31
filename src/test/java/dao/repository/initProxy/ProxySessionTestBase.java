package dao.repository.initProxy;

import com.dmdev.webStore.dao.repository.CatalogRepository;
import dao.repository.config.ApplicationConfigurationTest;
import lombok.RequiredArgsConstructor;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;

import static dao.repository.initProxy.TestDelete.deleteAll;

@RequiredArgsConstructor
public abstract class ProxySessionTestBase {

    private final EntityManager entityManager;

    private final CatalogRepository catalogRepository;


}
