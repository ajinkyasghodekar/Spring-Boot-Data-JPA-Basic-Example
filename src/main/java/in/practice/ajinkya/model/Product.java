package in.practice.ajinkya.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ptab")
public class Product {
	@Id
	private Integer pid;
	private String ploc;
	private String pname;
	private Integer pcost;
}
