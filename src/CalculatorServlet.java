import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/Converter")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float first_operand = Float.parseFloat(request.getParameter("first_operand"));
        Float second_operand = Float.parseFloat(request.getParameter("second_operand"));
        String operator = request.getParameter("operator");
        PrintWriter x = response.getWriter();
        x.println("<html>");
        x.println("<h1> Result <h1>");
        try {
            float result = Caculate.caculate(first_operand, second_operand, operator);
            x.println(first_operand + " " + operator +" " + second_operand + " = " + result);
        }
        catch (Exception o){
            x.println("Error" + o.getMessage());
        }
        x.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
