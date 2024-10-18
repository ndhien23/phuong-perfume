<%-- 
    Document   : cua-hang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Shop</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
               	<c:forEach items="${dssp }" var="sp">                
	                <div class="col-md-3 col-sm-6">
	                    <div class="single-shop-product">
	                        <div class="product-upper">
	                            <img src="img/${sp.hinhAnh }" alt="">
	                        </div>
	                        <h2><a href="">${sp.tenSanPham }</a></h2>
	                        <div class="product-carousel-price">
								<fmt:setLocale value="vi-VN"/>	                             
	                        	<fmt:formatNumber value="${sp.donGiaKM }" var="num1"></fmt:formatNumber>
	                            <ins>${num1 } vnđ</ins>
	                            
	                        	<fmt:formatNumber value="${sp.donGiaKM }" var="num2"></fmt:formatNumber>
	                            <del>${num2 } vnđ</del>
	                        </div>  
	                        
	                        <div class="product-option-shop">
	                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">GIỎ HÀNG</a>
	                        </div>                       
	                    </div>
	                </div>
               	</c:forEach>
            </div>
            
            <div class="row">
                <div class="col-md-12">
                    <div class="product-pagination text-center">
                        <nav>
                          <ul class="pagination">
                            <li>
                              <a href="trang-cua-hang.jsp?trang=${trang-1>0?trang-1:trang }" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                              </a>
                            </li>
                         	<c:forEach var="i" begin="1" end="${tongSoTrang }" step="1">
	                            <li><a href="trang-cua-hang.jsp?trang=${i }">${i }</a></li>
                         	</c:forEach>
                            <li>
                              <a href="trang-cua-hang.jsp?trang=${trang+1<=tongSoTrang?trang+1:trang }" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                              </a>
                            </li>
                          </ul>
                        </nav>                        
                    </div>
                </div>
            </div>
        </div>
    </div>
