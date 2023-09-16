package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.PatientDto;

public class PatientDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public String insert(PatientDto dto) {
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();

		return "Data inserted";
	}

	public String deleteById(int bd) {
		PatientDto d1 = entityManager.find(PatientDto.class, bd);
		if (d1 != null) {
			entityTransaction.begin();
			entityManager.remove(d1);
			entityTransaction.commit();
			return "data deleted";
		} else {
			return "not data found";
		}
	}

	public Object findById(Object cid) {
		PatientDto dto=entityManager.find(PatientDto.class,cid);
		if(dto!=null) {
			return dto.toString();
			
		}else
		return "no data found";
	}

	public List<PatientDto> fetchAll() {
		Query q=entityManager.createQuery("select a from PatientDto a");
	    List<PatientDto> dto=q.getResultList();
        
		return dto;
        
		
	}

	public String update(int cid, long number) {
		PatientDto pd=entityManager.find(PatientDto.class, cid);
		//pd.setPhno(number);
		pd.setPhno(number);
		entityTransaction.begin();
		entityManager.merge(pd);
		entityTransaction.commit();
		return "data updated";
	}

	public List<PatientDto> update_All(int cid, String name, String mail, String password, long phone, String gender) {
		PatientDto dt=entityManager.find(PatientDto.class,cid);
		dt.setName(name);
		dt.setEmail(mail);
		dt.setPassword(password);
		dt.setPhno(phone);
		dt.setGender(gender);
		entityTransaction.begin();
		entityManager.merge(dt);
		entityTransaction.commit();
		Query q=entityManager.createQuery("select b from PatientDto b");
		return q.getResultList();
	}

}
