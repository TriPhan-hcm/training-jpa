package com.faber.airmgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The class AppLaunch.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 13:58
 * @des todo
 */
@EnableJpaRepositories
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.faber.airmgr")
public class AppLaunch {
    public static void main(String[] args) {
        SpringApplication.run(AppLaunch.class, args);
    }
}
