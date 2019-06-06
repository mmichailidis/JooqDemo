package com.forjooq.demo;

import com.forjooq.demo.models.DemoTable;
import com.forjooq.demo.models.OtherTable;
import com.forjooq.demo.repos.DemoTableRepository;
import com.forjooq.demo.repos.OtherTableRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConf {

    @Bean
    public ApplicationRunner doStuff(DemoTableRepository demoTableRepository,
                                     OtherTableRepository otherTableRepository) {
        return args -> {
            final Iterable<DemoTable> all = demoTableRepository.findAll();
            final Iterable<OtherTable> all1 = otherTableRepository.findAll();

            // final Demotable demotable = Demotable.DEMOTABLE;
            // final Othertable othertable = Othertable.OTHERTABLE;
        };
    }
}
