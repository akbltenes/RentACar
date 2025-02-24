package enes.akblt.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import enes.akblt.rentACar.business.abstracts.BrandService;
import enes.akblt.rentACar.business.requests.CreateBrandRequest;
import enes.akblt.rentACar.business.responses.GetAllBrandResponse;
import enes.akblt.rentACar.dataAccess.abstracts.BrandRepository;
import enes.akblt.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;

@Service // bu sınıf bir business nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService{
	private BrandRepository brandRepository;
	
	//@Autowired
	//public BrandManager(BrandRepository brandRepository) {
		//this.brandRepository=brandRepository;
	//} //surada contructorla cagırmak yerine lombok kullanabiliriz
	
	@Override
	public List<GetAllBrandResponse> getAll() {
		List<Brand> brands=brandRepository.findAll(); //bize bir marka nesneleri geliyor
		List<GetAllBrandResponse> brandsResponse=new ArrayList<GetAllBrandResponse>();
		// bizim bunu listelememiz gerektiği için arraylist newliypruz
		for (Brand brand : brands) {
		GetAllBrandResponse responseItem=new GetAllBrandResponse();	
		responseItem.setId(brand.getId());
		responseItem.setName(brand.getName());
		brandsResponse.add(responseItem);
		}
		//iş kuralları
		
		
		
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand=new Brand(); 
		brand.setName(createBrandRequest.getName());
		this.brandRepository.save(brand); 
	}
	
	

}
