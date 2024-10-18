package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogics.SanPhamBL;
import javaBeans.SanPham;

/**
 * Servlet implementation class CuaHangServlet
 */
@WebServlet("/CuaHangServlet")
public class CuaHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CuaHangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<SanPham> dssp = SanPhamBL.docTatCa();
		int soDongTrang = 8;
		int tongSoTrang = SanPhamBL.tongSoTrang(soDongTrang);
		int trang = 1;
		dssp = SanPhamBL.viTriTrang(trang, soDongTrang);
		
		if(request.getParameter("trang") != null) {
			trang = Integer.parseInt(request.getParameter("trang"));
			dssp = SanPhamBL.viTriTrang(trang, soDongTrang);
		}
		request.setAttribute("trang", trang);
		request.setAttribute("tongSoTrang", tongSoTrang);
		request.setAttribute("dssp", dssp);
		request.getRequestDispatcher("Views/cua-hang.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
