package mon.projet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Save")
public class LivreController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String titre = request.getParameter("titre");
        String categorie = request.getParameter("categorie");
        String isbn = request.getParameter("isbn");
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Confirmation</title></head><body>");
        out.println("<h1>Confirmation de l'enregistrement</h1>");
        out.println("<h2>Informations sur le livre</h2>");
        out.println("<p><strong>Titre :</strong> " + titre + "</p>");
        out.println("<p><strong>Catégorie :</strong> " + categorie + "</p>");
        out.println("<p><strong>ISBN :</strong> " + isbn + "</p>");
        out.println("<h2>Informations sur l'auteur</h2>");
        out.println("<p><strong>Nom :</strong> " + nom + "</p>");
        out.println("<p><strong>Prénom :</strong> " + prenom + "</p>");
        out.println("</body></html>");
    }
}

