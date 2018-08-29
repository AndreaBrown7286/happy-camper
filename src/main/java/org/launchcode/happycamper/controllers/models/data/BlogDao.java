package org.launchcode.happycamper.controllers.models.data;

import org.launchcode.happycamper.controllers.models.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface BlogDao extends CrudRepository<Blog, Integer> {

    List<Blog> findById(int id);
    List<Blog>findByLocation(String location);


}
