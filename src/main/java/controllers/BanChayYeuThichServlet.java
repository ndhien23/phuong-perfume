package controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogics.SanPhamBL;
import javaBeans.SanPham;

/**
 * Servlet implementation class BanChayYeuThichServlet
 */
@WebServlet("/BanChayYeuThichServlet")
public class BanChayYeuThichServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BanChayYeuThichServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int top = 3;
		List<SanPham> dsspbc = SanPhamBL.banChayNhieuNhat(top);
		List<SanPham> dsspgiam = SanPhamBL.giamGiaNhieuNhat(top);
		List<SanPham> dssplove = dsspbc;
		request.setAttribute("dsspbc", dsspbc);
		request.setAttribute("dsspgiam", dsspgiam);
		request.setAttribute("dssplove", dssplove);
		request.getRequestDispatcher("Views/ban-chay-yeu-thich.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
