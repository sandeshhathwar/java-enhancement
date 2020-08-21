package login.company.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginRegister() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ApplicantDAO ad = new ApplicantDAOimpl();
		String userName = request.getParameter("username");
		String password = request.getParameter("password1");
		String submitType = request.getParameter("submit");
		Applicant a = new Applicant();
		a = ad.getApplicant(userName, password);
		System.out.println(a.getName()+a.getPassword()+a.getUsername());

		if (submitType.equals("login") && a!=null && a.getName()!=null) 
			{
			request.setAttribute("amessage", a.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		} else if (submitType.equals("register")) {
			a.setName(request.getParameter("name"));
			a.setPassword(password);
			a.setUsername(userName);
			ad.insertApplicant(a);
			request.setAttribute("successMessage", "Registration done, please login to continue!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "Data not found, please click on register!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}
}