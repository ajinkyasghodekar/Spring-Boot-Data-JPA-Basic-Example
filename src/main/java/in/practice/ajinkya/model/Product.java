package in.practice.ajinkya.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name="proTab")
public class Product {
	@Id
	private Integer pid;
	private String ploc;
	private String pname;
	private Integer pcost;
}
