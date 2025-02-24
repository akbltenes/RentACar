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

@RestController 
@RequestMapping("/api/brands") 
@AllArgsConstructor
@NoArgsConstructor
public class BrandsController {

	private BrandService brandService;

@Autowired 

	
@GetMapping("getall")
public List<GetAllBrandResponse> getAll(){
	return brandService.getAll();

}
@PostMapping("/add")
public void add(CreateBrandRequest createrBrandRequest) {
	this.brandService.add(createrBrandRequest);
}
}
