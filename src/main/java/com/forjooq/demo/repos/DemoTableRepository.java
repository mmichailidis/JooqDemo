package com.forjooq.demo.repos;

import com.forjooq.demo.models.DemoTable;
import org.springframework.data.repository.CrudRepository;

public interface DemoTableRepository extends CrudRepository<DemoTable, Integer> {
}
