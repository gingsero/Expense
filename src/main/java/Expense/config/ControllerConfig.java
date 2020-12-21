package Expense.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ContextDataSource.class, ContextSqlSession.class})
@ComponentScan(basePackages = {"Expense.mapper"})
public class ControllerConfig {

}
/*
 * "Expense.config.mapper", "Expense.config.service",
 * "Expense.config.controller"
 */