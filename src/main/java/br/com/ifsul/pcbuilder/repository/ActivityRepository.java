package br.com.ifsul.pcbuilder.repository;

import br.com.ifsul.pcbuilder.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

    List<Activity> findAllByType(String type);

}
