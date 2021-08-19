import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/login")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String ProductDescription = request.getParameter("ProductDescription");
           int ListPrice = Integer.parseInt(request.getParameter("ListPrice"));
           int DiscountPercent = Integer.parseInt(request.getParameter("DiscountPercent"));
           double DiscountAmount =  (ListPrice*DiscountPercent*0.01);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<H1> sản phẩm " +ProductDescription+ " có chiết khấu là + " +DiscountAmount+ "  </H1>" );
        writer.println("</html>");

    }
}
