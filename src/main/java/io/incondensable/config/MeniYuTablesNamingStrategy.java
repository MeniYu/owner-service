package io.incondensable.config;

import org.hibernate.boot.model.naming.CamelCaseToUnderscoresNamingStrategy;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

/**
 * Enable this strategy in Properties:
 * spring.jpa.hibernate.naming.physical-strategy = MeniYuTablesNamingStrategy.class.getName() or
 * using absolute path: io.incondensable.config.MeniYuTablesNamingStrategy
 * <p>
 * When hibernate/hibernate-orm#4098 is merged and released we should consider dropping SpringPhysicalNamingStrategy
 * and using CamelCaseToUnderscoresNamingStrategy instead.
 *
 * @author abbas
 */
public class MeniYuTablesNamingStrategy extends CamelCaseToUnderscoresNamingStrategy {

    /**
     * Let's dive deeper into Hibernate. According to the documentation, there are two interfaces responsible for naming
     * your tables, columns etc. in Hibernate: ImplicitNamingStrategy and PhysicalNamingStrategy.
     * <p>
     * ImplicitNamingStrategy is in charge of naming all objects that were not explicitly named by a developer:
     * e.g. entity name, table name, column name, index, FK etc. The resulting name is called the logical name,
     * it is used internally by Hibernate to identify an object. It is not the name that gets put into the DB.
     * <p>
     * PhysicalNamingStrategy provides the actual physical name used in the DB based on the logical JPA object name.
     * Effectively, this means that using Hibernate you cannot specify database object names directly, but only
     * logical ones. To have a better understanding of what's happening under the hood, see the diagram below.
     */
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        final String t = "my_" + name.getText();
        return new Identifier(t, name.isQuoted());
    }

}
