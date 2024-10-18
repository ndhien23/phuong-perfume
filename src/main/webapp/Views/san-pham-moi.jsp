<%-- 
    Document   : san-pham-moi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">New Products</h2>
                        <div class="product-carousel">
                        <c:forEach items="${dsspm }" var="sp">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/${sp.hinhAnh }" alt="">
                                    <div class="product-hover">
                                        <a href="ThemVaoGioServlet?idsp=${sp.iD }&slm=1" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Thêm vào giỏ hàng</a>
                                        <a href="single-product.html" class="view-details-link"><i class="fa fa-link"></i> Xem chi tiết</a>
                                    </div>
                                </div>
                                
                                <h2><a href="single-product.html">${sp.tenSanPham }</a></h2>
                                
                                <div class="product-carousel-price">
                                	<fmt:setLocale value="vi-VN"/>
                                	<fmt:formatNumber value="${sp.donGiaKM }" var="num1"></fmt:formatNumber>
                                    <ins>${num1 } vnđ</ins> 
                                    
                                	<fmt:formatNumber value="${sp.donGiaKM }" var="num2"></fmt:formatNumber>
                                    <del>${num2 } vnđ</del>
                                </div> 
                            </div>
                        </c:forEach>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End main content area -->
    