package survey_c;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/survey")
public class SurveyServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ form index.html
        String firstName = request.getParameter("firstName");
        String lastName  = request.getParameter("lastName");
        String email     = request.getParameter("email");
        String dob       = request.getParameter("dob");
        String heardFrom = request.getParameter("heardFrom");
        String contactVia= request.getParameter("contactVia");
        String wantsUpdates = request.getParameter("wantsUpdates");
        String emailOK      = request.getParameter("emailOK");

        // Gửi dữ liệu sang thanks.jsp
        request.setAttribute("firstName", firstName);
        request.setAttribute("lastName", lastName);
        request.setAttribute("email", email);
        request.setAttribute("dob", dob);
        request.setAttribute("heardFrom", heardFrom);
        request.setAttribute("contactVia", contactVia);
        request.setAttribute("wantsUpdates", wantsUpdates != null ? "Yes" : "No");
        request.setAttribute("emailOK", emailOK != null ? "Yes" : "No");

        // Forward đến thanks.jsp
        request.getRequestDispatcher("thanks.jsp").forward(request, response);
    }
}
