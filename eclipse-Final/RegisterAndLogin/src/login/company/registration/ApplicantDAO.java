package login.company.registration;

public interface ApplicantDAO {
	
	public int insertApplicant(Applicant a); 
	public Applicant getApplicant(String username,String password); 
}
