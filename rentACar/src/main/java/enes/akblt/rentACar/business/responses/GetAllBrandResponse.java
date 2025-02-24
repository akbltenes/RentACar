package enes.akblt.rentACar.business.responses;

import enes.akblt.rentACar.business.requests.CreateBrandRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandResponse { //mrka listeleme

	
	private int id;
	private String name;
}
