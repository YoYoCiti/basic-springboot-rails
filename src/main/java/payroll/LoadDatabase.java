package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {

    return args -> {
      employeeRepository.save(new Employee("Adrian", "Tan", "Technician", "3000", "45 Pines Road"));
      employeeRepository.save(new Employee("Fred", "Baggins", "Human Resource", "3200", "83 Amoy Street"));
      employeeRepository.save(new Employee("Greg", "Jenkins", "Cleaner", "2800", "928 Kelp Road"));
      employeeRepository.save(new Employee("Amy", "Lee", "Administrator", "3000", "54 Holland Drive"));
      employeeRepository.save(new Employee("Luke", "Skywalker", "Security Guard", "3200", "3 Tatooine Lane"));
      employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));
    };
  }
}