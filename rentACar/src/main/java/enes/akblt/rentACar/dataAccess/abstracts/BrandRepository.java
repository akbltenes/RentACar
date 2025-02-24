package enes.akblt.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enes.akblt.rentACar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
	//jpanın içine brand yazdık.Brandın idsnin tipi integer
	//oldugu için değişken tipi olarak integer yazdık
	//List<Brand> getAll(); //getAlli cagiran birisi markaları listeler
	//bu operasyonu yazmamıza artık gerek yok cunku jpa repositoryi extend
	//ettiğimiz için onun içinde var bu
}
