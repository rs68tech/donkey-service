package com.stranger;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "donkeys", path = "donkeys")
public interface DonkeyRepository extends PagingAndSortingRepository<Donkey, Long> {

	List<Donkey> findByLastName(@Param("name") String name);

}