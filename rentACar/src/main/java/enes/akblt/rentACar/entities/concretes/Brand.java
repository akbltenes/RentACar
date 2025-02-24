package enes.akblt.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands") 
//bu bir tablodur ve ismi de brandsdir
@Data //lombokla bunu import ettiğimizde getter setter yazmamıza
//gerek kalmaz.Lombok bizim için getter ve setterleri oluşturur.
//aynı zamanda parametresiz constructor oluşturur.
//fakat parametreli constructor oluşturmaz.bunun için farklı bir şey
//kullanacagız
@AllArgsConstructor 
@NoArgsConstructor

@Entity // veri tabanı varlıgı oldugunu soyler
public class Brand {
	// ctrl shift o , kullanılmayan importları kaldırır
	
	@Id  //sen veritabanında primary key alanısın demek
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//marka eklendiiginde idyi otomatik arttır demek
	@Column(name="id") //sen bir kolonsun ve senin
	//veritabanındakii karsılıgın id
private int id; 
	
	@Column(name="name")
private String name;


}
