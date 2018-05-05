dataSource {
    pooled = true
    dbCreate = "none"
    url = "jdbc:mysql://localhost:3306/redgold"
    driverClassName = "com.mysql.jdbc.Driver"
    dialect = org.hibernate.dialect.MySQL5InnoDBDialect
    username = "root"
    password = "12345678"
    readOnly = true
}
environments {
    development {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:devDb"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:prodDb"
        }
    }
}