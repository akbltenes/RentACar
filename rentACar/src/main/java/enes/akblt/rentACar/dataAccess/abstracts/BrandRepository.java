package enes.akblt.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enes.akblt.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
	
}
