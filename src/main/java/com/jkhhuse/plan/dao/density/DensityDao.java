package com.jkhhuse.plan.dao.density;

import com.jkhhuse.plan.entity.density.DensityDO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DensityDao extends JpaRepository<DensityDO, Long> {

	DensityDO findByUuid(long uuid);

}