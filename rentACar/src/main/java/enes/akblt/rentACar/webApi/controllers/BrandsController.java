package enes.akblt.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enes.akblt.rentACar.business.abstracts.BrandService;
import enes.akblt.rentACar.business.requests.CreateBrandRequest;
import enes.akblt.rentACar.business.responses.GetAllBrandResponse;
import enes.akblt.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController //restcontroller varsa bura erisim noktası
@RequestMapping("/api/brands") //adresleme
@AllArgsConstructor
@NoArgsConstructor
public class BrandsController {
// dataaccess constructurla businesin icinde kullanıldı
//businessi api cagıracak
	private BrandService brandService;

@Autowired //bu anotasyou kullanma amacımız sudur.
//parametreli constructorun içindeki parametreye bak.
//parametredeki classa git.BrandServiceyi kim implements ediyorsa
//onun newlenmiş halini bana ver.
//public BrandsController(BrandService brandService) {//
	//super();//
	//this.brandService = brandService; burası yrine de constructoru lombokla olusturalım
//}
	
@GetMapping("getall")
public List<GetAllBrandResponse> getAll(){
	return brandService.getAll();
//www.akblt.com diye bi web sitesi olsun
//www.akblt.com/api/brands/getall demek getmappingi çağır demektir.
//bu anotasyonun içindeki brandsevirce.getAll calısır.
//buradaki brandService businesstaki BrandManager'a gidecek
//BrandServiceye gitmez cunku o interface.//BrandManagera gidince
//BrandManager iş kurallarından geçecek.
//iş kurallarından geçerse InMemoryBrandRepositorye gidecek
//çünkü BrandManager classından geçerse InMemoryBrandRepositorye
//opsiyonlanıyor.
//inmemoryde de getAll oldugu için inMemory markalaır listeleyecek
	
}
@PostMapping("/add")
public void add(CreateBrandRequest createrBrandRequest) {
	this.brandService.add(createrBrandRequest);
}
}
