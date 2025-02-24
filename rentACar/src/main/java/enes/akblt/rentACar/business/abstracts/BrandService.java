package enes.akblt.rentACar.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import enes.akblt.rentACar.business.requests.CreateBrandRequest;
import enes.akblt.rentACar.business.responses.GetAllBrandResponse;
import enes.akblt.rentACar.entities.concretes.Brand;

@Service
public interface BrandService {

		List<GetAllBrandResponse> getAll();
		void add(CreateBrandRequest createBrandRequest);
}
