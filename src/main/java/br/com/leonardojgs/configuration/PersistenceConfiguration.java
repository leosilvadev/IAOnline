package br.com.leonardojgs.configuration;



//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(basePackages="br.com.leonardojgs.model.repositories")
//@PropertySource("classpath:application.properties")
public class PersistenceConfiguration {
	
//	private static final String PROPERTY_NAME_DATABASE_DRIVER = "db.driver";
//    private static final String PROPERTY_NAME_DATABASE_URL = "db.url";
//    private static final String PROPERTY_NAME_DATABASE_USERNAME = "db.username";
//    private static final String PROPERTY_NAME_DATABASE_PASSWORD = "db.password";
// 
//    private static final String PROPERTY_NAME_HIBERNATE_DIALECT = "hibernate.dialect";
//    private static final String PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY = "hibernate.ejb.naming_strategy";
//    private static final String PROPERTY_NAME_HIBERNATE_SHOW_SQL = "hibernate.show_sql";
//    private static final String PROPERTY_NAME_HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
//    private static final String PROPERTY_NAME_HIBERNATE_HBM2DDL = "hibernate.hbm2ddl.auto";
//    
//	@Resource
//    private Environment environment;
// 
//	public PersistenceConfiguration() {
//		System.out.println("PERSISTENCE CONFIG - OK");
//	}
//	
//    @Bean
//    public DataSource dataSource() {
//    	BasicDataSource dataSource = new BasicDataSource();
//        dataSource.setDriverClassName(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_DRIVER));
//        dataSource.setUrl(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_URL));
//        dataSource.setUsername(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_USERNAME));
//        dataSource.setPassword(environment.getRequiredProperty(PROPERTY_NAME_DATABASE_PASSWORD));
//        return dataSource;
//    }
// 
//    @Bean
//	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
//		HibernateTransactionManager txManager = new HibernateTransactionManager();
//		txManager.setSessionFactory(sessionFactory);
//		return txManager;
//	}
// 
//    @Bean
//    public LocalSessionFactoryBean sessionFactory() throws ClassNotFoundException {
//    	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//    	sessionFactory.setDataSource(dataSource());
//    	sessionFactory.setPackagesToScan("br.com.leonardojgs.model.domains");
//    	
//        Properties properties = new Properties();
//        properties.put(PROPERTY_NAME_HIBERNATE_DIALECT, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_DIALECT));
//        properties.put(PROPERTY_NAME_HIBERNATE_FORMAT_SQL, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_FORMAT_SQL));
//        properties.put(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_NAMING_STRATEGY));
//        properties.put(PROPERTY_NAME_HIBERNATE_SHOW_SQL, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_SHOW_SQL));
//        properties.put(PROPERTY_NAME_HIBERNATE_HBM2DDL, environment.getRequiredProperty(PROPERTY_NAME_HIBERNATE_HBM2DDL));
//        
//        sessionFactory.setHibernateProperties(properties);
//        
//        return sessionFactory;
//    }
//    
//    @Bean
//	public HibernateExceptionTranslator hibernateExceptionTranslator(){
//		return new HibernateExceptionTranslator();
//	}

}
