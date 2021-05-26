package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import kodlamaio.hrms.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name="id")
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{

	@Column(name = "website")
	private String website;
	
	@Column(name = "phone_number")
	private String phone;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "confirmation")
	private boolean confirmation;
}
