package com.virus.springboot_neo4j.repositroy;

import com.virus.springboot_neo4j.model.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface PersonRepository extends Neo4jRepository<Person,String> {
    List<Person> findByName(String name);
}
